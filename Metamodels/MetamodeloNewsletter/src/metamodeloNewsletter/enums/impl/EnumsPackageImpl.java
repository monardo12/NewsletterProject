/**
 */
package metamodeloNewsletter.enums.impl;

import metamodeloNewsletter.MetamodeloNewsletterPackage;

import metamodeloNewsletter.enums.Align;
import metamodeloNewsletter.enums.Color;
import metamodeloNewsletter.enums.EnumsFactory;
import metamodeloNewsletter.enums.EnumsPackage;
import metamodeloNewsletter.enums.FontFamily;
import metamodeloNewsletter.enums.VerticalAlign;

import metamodeloNewsletter.impl.MetamodeloNewsletterPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumsPackageImpl extends EPackageImpl implements EnumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontFamilyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metamodeloNewsletter.enums.EnumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumsPackageImpl() {
		super(eNS_URI, EnumsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EnumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumsPackage init() {
		if (isInited) return (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Obtain or create and register package
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MetamodeloNewsletterPackageImpl theMetamodeloNewsletterPackage = (MetamodeloNewsletterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetamodeloNewsletterPackage.eNS_URI) instanceof MetamodeloNewsletterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetamodeloNewsletterPackage.eNS_URI) : MetamodeloNewsletterPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumsPackage.createPackageContents();
		theMetamodeloNewsletterPackage.createPackageContents();

		// Initialize created meta-data
		theEnumsPackage.initializePackageContents();
		theMetamodeloNewsletterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumsPackage.eNS_URI, theEnumsPackage);
		return theEnumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalAlign() {
		return verticalAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontFamily() {
		return fontFamilyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsFactory getEnumsFactory() {
		return (EnumsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		colorEEnum = createEEnum(COLOR);
		alignEEnum = createEEnum(ALIGN);
		verticalAlignEEnum = createEEnum(VERTICAL_ALIGN);
		fontFamilyEEnum = createEEnum(FONT_FAMILY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.AQUA);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.FUCHSIA);
		addEEnumLiteral(colorEEnum, Color.GRAY);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.LIME);
		addEEnumLiteral(colorEEnum, Color.MAROON);
		addEEnumLiteral(colorEEnum, Color.NAVY);
		addEEnumLiteral(colorEEnum, Color.OLIVE);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.PURPLE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.SILVER);
		addEEnumLiteral(colorEEnum, Color.TEAL);
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.YELLOW);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.LEFT);
		addEEnumLiteral(alignEEnum, Align.CENTER);
		addEEnumLiteral(alignEEnum, Align.RIGHT);

		initEEnum(verticalAlignEEnum, VerticalAlign.class, "VerticalAlign");
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.TOP);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.MIDDLE);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.BOTTOM);

		initEEnum(fontFamilyEEnum, FontFamily.class, "FontFamily");
		addEEnumLiteral(fontFamilyEEnum, FontFamily.ARIAL);
		addEEnumLiteral(fontFamilyEEnum, FontFamily.HELVETICA);
		addEEnumLiteral(fontFamilyEEnum, FontFamily.TIMES_NEW_ROMAN);
		addEEnumLiteral(fontFamilyEEnum, FontFamily.TREBUCHET_MS);
	}

} //EnumsPackageImpl
