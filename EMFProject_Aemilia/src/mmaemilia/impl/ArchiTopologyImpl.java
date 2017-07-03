/**
 */
package mmaemilia.impl;

import java.util.Collection;

import mmaemilia.ArchiElemInstance;
import mmaemilia.ArchiTopology;
import mmaemilia.ArchitecturalInteraction;
import mmaemilia.Attachment;
import mmaemilia.MmaemiliaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archi Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.impl.ArchiTopologyImpl#getAeiDecl <em>Aei Decl</em>}</li>
 *   <li>{@link mmaemilia.impl.ArchiTopologyImpl#getAttDecl <em>Att Decl</em>}</li>
 *   <li>{@link mmaemilia.impl.ArchiTopologyImpl#getAiDecl <em>Ai Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchiTopologyImpl extends MinimalEObjectImpl.Container implements ArchiTopology {
	/**
	 * The cached value of the '{@link #getAeiDecl() <em>Aei Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeiDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchiElemInstance> aeiDecl;

	/**
	 * The cached value of the '{@link #getAttDecl() <em>Att Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attDecl;

	/**
	 * The cached value of the '{@link #getAiDecl() <em>Ai Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAiDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalInteraction> aiDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmaemiliaPackage.Literals.ARCHI_TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchiElemInstance> getAeiDecl() {
		if (aeiDecl == null) {
			aeiDecl = new EObjectContainmentEList<ArchiElemInstance>(ArchiElemInstance.class, this, MmaemiliaPackage.ARCHI_TOPOLOGY__AEI_DECL);
		}
		return aeiDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getAttDecl() {
		if (attDecl == null) {
			attDecl = new EObjectContainmentEList<Attachment>(Attachment.class, this, MmaemiliaPackage.ARCHI_TOPOLOGY__ATT_DECL);
		}
		return attDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalInteraction> getAiDecl() {
		if (aiDecl == null) {
			aiDecl = new EObjectContainmentEList<ArchitecturalInteraction>(ArchitecturalInteraction.class, this, MmaemiliaPackage.ARCHI_TOPOLOGY__AI_DECL);
		}
		return aiDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AEI_DECL:
				return ((InternalEList<?>)getAeiDecl()).basicRemove(otherEnd, msgs);
			case MmaemiliaPackage.ARCHI_TOPOLOGY__ATT_DECL:
				return ((InternalEList<?>)getAttDecl()).basicRemove(otherEnd, msgs);
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AI_DECL:
				return ((InternalEList<?>)getAiDecl()).basicRemove(otherEnd, msgs);
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
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AEI_DECL:
				return getAeiDecl();
			case MmaemiliaPackage.ARCHI_TOPOLOGY__ATT_DECL:
				return getAttDecl();
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AI_DECL:
				return getAiDecl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AEI_DECL:
				getAeiDecl().clear();
				getAeiDecl().addAll((Collection<? extends ArchiElemInstance>)newValue);
				return;
			case MmaemiliaPackage.ARCHI_TOPOLOGY__ATT_DECL:
				getAttDecl().clear();
				getAttDecl().addAll((Collection<? extends Attachment>)newValue);
				return;
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AI_DECL:
				getAiDecl().clear();
				getAiDecl().addAll((Collection<? extends ArchitecturalInteraction>)newValue);
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
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AEI_DECL:
				getAeiDecl().clear();
				return;
			case MmaemiliaPackage.ARCHI_TOPOLOGY__ATT_DECL:
				getAttDecl().clear();
				return;
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AI_DECL:
				getAiDecl().clear();
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
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AEI_DECL:
				return aeiDecl != null && !aeiDecl.isEmpty();
			case MmaemiliaPackage.ARCHI_TOPOLOGY__ATT_DECL:
				return attDecl != null && !attDecl.isEmpty();
			case MmaemiliaPackage.ARCHI_TOPOLOGY__AI_DECL:
				return aiDecl != null && !aiDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchiTopologyImpl
