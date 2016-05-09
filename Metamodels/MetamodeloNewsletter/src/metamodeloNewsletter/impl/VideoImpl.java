/**
 */
package metamodeloNewsletter.impl;

import metamodeloNewsletter.Image;
import metamodeloNewsletter.MetamodeloNewsletterPackage;
import metamodeloNewsletter.Text;
import metamodeloNewsletter.Video;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.impl.VideoImpl#getPreview <em>Preview</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.VideoImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.VideoImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends ElementImpl implements Video {
	/**
	 * The cached value of the '{@link #getPreview() <em>Preview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreview()
	 * @generated
	 * @ordered
	 */
	protected Image preview;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Text title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Text description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloNewsletterPackage.Literals.VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getPreview() {
		return preview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreview(Image newPreview, NotificationChain msgs) {
		Image oldPreview = preview;
		preview = newPreview;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.VIDEO__PREVIEW, oldPreview, newPreview);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreview(Image newPreview) {
		if (newPreview != preview) {
			NotificationChain msgs = null;
			if (preview != null)
				msgs = ((InternalEObject)preview).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodeloNewsletterPackage.VIDEO__PREVIEW, null, msgs);
			if (newPreview != null)
				msgs = ((InternalEObject)newPreview).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodeloNewsletterPackage.VIDEO__PREVIEW, null, msgs);
			msgs = basicSetPreview(newPreview, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.VIDEO__PREVIEW, newPreview, newPreview));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(Text newTitle, NotificationChain msgs) {
		Text oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.VIDEO__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Text newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodeloNewsletterPackage.VIDEO__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodeloNewsletterPackage.VIDEO__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.VIDEO__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Text newDescription, NotificationChain msgs) {
		Text oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.VIDEO__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Text newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodeloNewsletterPackage.VIDEO__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodeloNewsletterPackage.VIDEO__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.VIDEO__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.VIDEO__PREVIEW:
				return basicSetPreview(null, msgs);
			case MetamodeloNewsletterPackage.VIDEO__TITLE:
				return basicSetTitle(null, msgs);
			case MetamodeloNewsletterPackage.VIDEO__DESCRIPTION:
				return basicSetDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.VIDEO__PREVIEW:
				return getPreview();
			case MetamodeloNewsletterPackage.VIDEO__TITLE:
				return getTitle();
			case MetamodeloNewsletterPackage.VIDEO__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.VIDEO__PREVIEW:
				setPreview((Image)newValue);
				return;
			case MetamodeloNewsletterPackage.VIDEO__TITLE:
				setTitle((Text)newValue);
				return;
			case MetamodeloNewsletterPackage.VIDEO__DESCRIPTION:
				setDescription((Text)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.VIDEO__PREVIEW:
				setPreview((Image)null);
				return;
			case MetamodeloNewsletterPackage.VIDEO__TITLE:
				setTitle((Text)null);
				return;
			case MetamodeloNewsletterPackage.VIDEO__DESCRIPTION:
				setDescription((Text)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.VIDEO__PREVIEW:
				return preview != null;
			case MetamodeloNewsletterPackage.VIDEO__TITLE:
				return title != null;
			case MetamodeloNewsletterPackage.VIDEO__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //VideoImpl
