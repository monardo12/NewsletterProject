/**
 */
package metamodeloNewsletter;

import metamodeloNewsletter.enums.Color;
import metamodeloNewsletter.enums.FontFamily;
import metamodeloNewsletter.enums.FontWeight;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Text#getContent <em>Content</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#isItalic <em>Italic</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#isUnderline <em>Underline</em>}</li>
 *   <li>{@link metamodeloNewsletter.Text#isStrikethrough <em>Strikethrough</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Element {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * The default value is <code>"Arial"</code>.
	 * The literals are from the enumeration {@link metamodeloNewsletter.enums.FontFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see metamodeloNewsletter.enums.FontFamily
	 * @see #setFontFamily(FontFamily)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_FontFamily()
	 * @model default="Arial"
	 * @generated
	 */
	FontFamily getFontFamily();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see metamodeloNewsletter.enums.FontFamily
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(FontFamily value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_FontSize()
	 * @model
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link metamodeloNewsletter.enums.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #setFontColor(Color)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_FontColor()
	 * @model default="none"
	 * @generated
	 */
	Color getFontColor();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#getFontColor <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link metamodeloNewsletter.enums.FontWeight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see metamodeloNewsletter.enums.FontWeight
	 * @see #setFontWeight(FontWeight)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_FontWeight()
	 * @model default="normal"
	 * @generated
	 */
	FontWeight getFontWeight();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see metamodeloNewsletter.enums.FontWeight
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(FontWeight value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(boolean)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_Italic()
	 * @model
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(boolean)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_Underline()
	 * @model
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

	/**
	 * Returns the value of the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strikethrough</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strikethrough</em>' attribute.
	 * @see #setStrikethrough(boolean)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getText_Strikethrough()
	 * @model
	 * @generated
	 */
	boolean isStrikethrough();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Text#isStrikethrough <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikethrough</em>' attribute.
	 * @see #isStrikethrough()
	 * @generated
	 */
	void setStrikethrough(boolean value);

} // Text
