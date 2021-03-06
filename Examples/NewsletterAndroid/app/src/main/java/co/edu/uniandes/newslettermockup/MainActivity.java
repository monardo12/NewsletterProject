package co.edu.uniandes.newslettermockup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    /**
     * HashMap que almacena las acciones de la aplicacion.
     * Una accion es un redireccion a un link que puede tener cualquier contenido web.
     * Cada registro del hashmap lo compone un id de vista que lo lanza(key), y el link para ejecutar la accion(value).
     */
    private HashMap <Integer, String> actionLinksViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        actionLinksViews = new HashMap<Integer, String>();

        //Por cada vista con link se crea un registro en un hashmap de actions
        actionLinksViews.put(R.id.imageView_disenoboletin19febrerob02_2, "https://apps.co/comunicaciones/articulos/elementos-legales-para-el-emprendimiento-digital-2/?mkt_hm=4&utm_source=email_marketing&utm_admin=65089&utm_medium=email&utm_campaign=Elementos");
        actionLinksViews.put(R.id.button_presencial,"https://apps.co/comunicaciones/eventos/elementos-legales-para-el-emprendimiento-digital-3/");
        actionLinksViews.put(R.id.button_virtual,"https://plus.google.com/events/c541njr83ht26v8ic03tslq4c3c");
        actionLinksViews.put(R.id.imageView_disenoboletin19febrero14,"https://apps.co/comunicaciones/articulos/certificate-internacionalmente-como-profesional-ti/");
        actionLinksViews.put(R.id.layout_video1, "https://www.youtube.com/watch?v=p542clXAwRw");
        actionLinksViews.put(R.id.layout_video2, "https://www.youtube.com/watch?v=QY02W8XK61c&list=PL1C9B31303DD2150E");

    }


    @Override
    public void onClick(View v) {

        Log.i("onClick", "Click en vista= " + v.getId());

        //El id de cada vista nos dice cual es su link almacenado en el HashMap de actions
        String link = actionLinksViews.get(v.getId());

        if (link!=null)
        {
            openBrowser(link);
        }
        else
        {
            Toast.makeText(this,"Element without Url", Toast.LENGTH_SHORT);
        }


    }

    private static final String HTTPS = "https://";
    private static final String HTTP = "http://";

    /**
     * Open a browser chooser giving a url (with or without http:// prefix)
     * @param url
     */
    public void openBrowser(String url) {

        if (!url.startsWith(HTTP) && !url.startsWith(HTTPS)) {
            url = HTTP + url;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(Intent.createChooser(intent, "Chose browser"));

    }

}
