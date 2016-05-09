/**
 */
package metamodeloNewsletter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Video#getPreview <em>Preview</em>}</li>
 *   <li>{@link metamodeloNewsletter.Video#getTitle <em>Title</em>}</li>
 *   <li>{@link metamodeloNewsletter.Video#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends Element {
	/**
	 * Returns the value of the '<em><b>Preview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preview</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview</em>' containment reference.
	 * @see #setPreview(Image)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo_Preview()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getPreview();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Video#getPreview <em>Preview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview</em>' containment reference.
	 * @see #getPreview()
	 * @generated
	 */
	void setPreview(Image value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(Text)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo_Title()
	 * @model containment="true"
	 * @generated
	 */
	Text getTitle();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Video#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Text value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Text)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo_Description()
	 * @model containment="true"
	 * @generated
	 */
	Text getDescription();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Video#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Text value);

} // Video
