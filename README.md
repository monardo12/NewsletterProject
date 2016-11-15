# NewsletterProject

-----------------------------------------------------------------------
Instructivo de ejecución del generador y del código generado.
-----------------------------------------------------------------------

Requerimientos</br>
1. Eclipse Mars con plugins de EMF y Sirius instalados</br>
2. NewsleterProject con la siguiente estructura de proyecto:</br>
  2.1 /DownloaderImages</br>
	2.2 /Examples</br>
	2.3 /Metamodels</br>
	2.3 /Newsletter.design</br>
	2.4 /NewsletterGenerator</br>
	2.5 /NewsletterModel</br>

-----------------------------------------------------------------------
Correr el generador
-----------------------------------------------------------------------

Para correr el generador es necesario realizar los siguientes pasos:</br>
</br>
1. Abrir en una primera instancia de eclipse el contenido de la carpeta /Metamodels</br>
y registrar los metamodelos Newsletter.ecore, Android.ecore y HTML.ecore</br>
</br>
	/Metamodels/MetamodeloAndroid</br>
	/Metamodels/MetamodeloHTML</br>
	/Metamodels/MetamodeloNewsletter</br>
	/MetamodelNewsletter.edit</br>
	/MetamodelNewsletter.editor</br>

2. Tambien importar el DownloaderImages si quiere ver su contenido (igual Ant lo empaquetará y ejecutará)

3. Abrir en una segunda instancia de eclipse los proyectos:</br>
</br>
	/NewsleterGenerator (Generador con las transformaciones, build.xml ANT, y demás archivos intermedios usados en la cadena de transformación)</br>
	/Newsletter.design (Proyecto Sirius con el editor gráfico definido)</br>
	/NewsletterModel (Modelo generado por Sirius que se usará como entrada de la cadena de transformación)</br>

4. Crear xmi de entrada en el proyecto /NewsletterModel editando un diagrama en sirius.</br> 
Almacenarlo con el nombre de /NewsletterModel/example/Newsletter.xmi y/o puede editar el archivo build.xmi para cambiar el nombre del modelo de entrada.</br>
</br>
5. Debe poner las urls de las imágenes (utilzadas en el editor) en el archivo /data/urlsImagenes.txt. Url por línea.</br>
</br>
6. Ejecutar build.xmi y esperar a que termine.</br> 
Este archivo prepara folders de NewsletterGenerator/generated, compila y ejecuta el jar que descarga las imágenes necesarias para el proyecto android</br>
(Para eso el bulid.xmi llama el build_jar.xml que limpia, compila, empaqueta y ejecuta un jar usando el proyecto  "DownloaderImages"). Luego este mismo build.xml ejecuta las transformaciones m2m y m2t de forma coordinada.</br>
</br>
7. El contenido del newsletter aparecerá en el folder de de /NewsleterGenerator/generated
</br>
(**Nota, a veces el ant guarda un caché del primer modelo que ejecuta. Si corriendo el ant (build.xml) no se actualiza el contenido de la carpeta generated, se sugiere correr las transfomaaiciones manualmente tras ejecutar el ant.)

-----------------------------------------------------------------------	
Correr codigo generado (aplicaciones)
-----------------------------------------------------------------------

Probar el newsletter en HTML
--------------------------------------

1. Para probar este aplicativo, basta con abrir el archivo /NewsleterGenerator/generated/newsletter.html
utilizando el browser de su preferencia. 

Probar el newsletter en  Android
--------------------------------------

1. Para probar este aplicativo, basta con abrir el folder /NewsleterGenerator/generated/NewsletterAndroid
utilizando android estudio y hacer "clean and build" del proyecto. Con ello, podrá ejecutarlo usando el AVD
(android virtual device) o generar el apk para probarlo en un dispositivo. 
