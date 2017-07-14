/**
 */
package mmaemilia.impl;

import mmaemilia.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmaemiliaFactoryImpl extends EFactoryImpl implements MmaemiliaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmaemiliaFactory init() {
		try {
			MmaemiliaFactory theMmaemiliaFactory = (MmaemiliaFactory)EPackage.Registry.INSTANCE.getEFactory(MmaemiliaPackage.eNS_URI);
			if (theMmaemiliaFactory != null) {
				return theMmaemiliaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MmaemiliaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmaemiliaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MmaemiliaPackage.AEMILIA_SPECIFICATION: return createAEmiliaSpecification();
			case MmaemiliaPackage.ARCHI_TYPE: return createArchiType();
			case MmaemiliaPackage.ARCHI_ELEM_TYPES: return createArchiElemTypes();
			case MmaemiliaPackage.ARCHI_TOPOLOGY: return createArchiTopology();
			case MmaemiliaPackage.INTERACTION: return createInteraction();
			case MmaemiliaPackage.LOCAL_INTERACTION: return createLocalInteraction();
			case MmaemiliaPackage.ARCHITECTURAL_INTERACTION: return createArchitecturalInteraction();
			case MmaemiliaPackage.INPUT_INTERACTION: return createInputInteraction();
			case MmaemiliaPackage.OUTPUT_INTERACTION: return createOutputInteraction();
			case MmaemiliaPackage.ARCHI_ELEM_INSTANCE: return createArchiElemInstance();
			case MmaemiliaPackage.ATTACHMENT: return createAttachment();
			case MmaemiliaPackage.ELEM_TYPE: return createElemType();
			case MmaemiliaPackage.TO: return createTo();
			case MmaemiliaPackage.FROM: return createFrom();
			case MmaemiliaPackage.ELEM: return createElem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MmaemiliaPackage.INTERACTION_TYPE:
				return createInteractionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MmaemiliaPackage.INTERACTION_TYPE:
				return convertInteractionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaSpecification createAEmiliaSpecification() {
		AEmiliaSpecificationImpl aEmiliaSpecification = new AEmiliaSpecificationImpl();
		return aEmiliaSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiType createArchiType() {
		ArchiTypeImpl archiType = new ArchiTypeImpl();
		return archiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemTypes createArchiElemTypes() {
		ArchiElemTypesImpl archiElemTypes = new ArchiElemTypesImpl();
		return archiElemTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiTopology createArchiTopology() {
		ArchiTopologyImpl archiTopology = new ArchiTopologyImpl();
		return archiTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalInteraction createLocalInteraction() {
		LocalInteractionImpl localInteraction = new LocalInteractionImpl();
		return localInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalInteraction createArchitecturalInteraction() {
		ArchitecturalInteractionImpl architecturalInteraction = new ArchitecturalInteractionImpl();
		return architecturalInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInteraction createInputInteraction() {
		InputInteractionImpl inputInteraction = new InputInteractionImpl();
		return inputInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInteraction createOutputInteraction() {
		OutputInteractionImpl outputInteraction = new OutputInteractionImpl();
		return outputInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstance createArchiElemInstance() {
		ArchiElemInstanceImpl archiElemInstance = new ArchiElemInstanceImpl();
		return archiElemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemType createElemType() {
		ElemTypeImpl elemType = new ElemTypeImpl();
		return elemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To createTo() {
		ToImpl to = new ToImpl();
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From createFrom() {
		FromImpl from = new FromImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elem createElem() {
		ElemImpl elem = new ElemImpl();
		return elem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionType createInteractionTypeFromString(EDataType eDataType, String initialValue) {
		InteractionType result = InteractionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmaemiliaPackage getMmaemiliaPackage() {
		return (MmaemiliaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MmaemiliaPackage getPackage() {
		return MmaemiliaPackage.eINSTANCE;
	}

} //MmaemiliaFactoryImpl
