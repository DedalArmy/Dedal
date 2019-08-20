/*******************************************************************************
 * Copyright (C) 2019 aleborgne
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
/*
 * generated by Xtext
 */
package fr.ema.dedal.xtext.serializer;

import com.google.inject.Inject;
import dedal.Assembly;
import dedal.Attribute;
import dedal.ClassConnection;
import dedal.CompClass;
import dedal.CompInstance;
import dedal.CompRole;
import dedal.CompType;
import dedal.CompositeCompClass;
import dedal.CompositePort;
import dedal.Configuration;
import dedal.DedalDiagram;
import dedal.DedalPackage;
import dedal.InstConnection;
import dedal.Interface;
import dedal.InterfaceType;
import dedal.Port;
import dedal.Repository;
import dedal.RoleConnection;
import dedal.Signature;
import dedal.Specification;
import fr.ema.dedal.xtext.services.DedalADLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractDedalADLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DedalADLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DedalPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DedalPackage.ASSEMBLY:
				sequence_Assembly(context, (Assembly) semanticObject); 
				return; 
			case DedalPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case DedalPackage.CLASS_CONNECTION:
				sequence_ClassConnection(context, (ClassConnection) semanticObject); 
				return; 
			case DedalPackage.COMP_CLASS:
				sequence_CompClass_Impl(context, (CompClass) semanticObject); 
				return; 
			case DedalPackage.COMP_INSTANCE:
				sequence_CompInstance(context, (CompInstance) semanticObject); 
				return; 
			case DedalPackage.COMP_ROLE:
				sequence_CompRole(context, (CompRole) semanticObject); 
				return; 
			case DedalPackage.COMP_TYPE:
				sequence_CompType(context, (CompType) semanticObject); 
				return; 
			case DedalPackage.COMPOSITE_COMP_CLASS:
				sequence_CompositeCompClass(context, (CompositeCompClass) semanticObject); 
				return; 
			case DedalPackage.COMPOSITE_PORT:
				sequence_CompositePort(context, (CompositePort) semanticObject); 
				return; 
			case DedalPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case DedalPackage.DEDAL_DIAGRAM:
				sequence_DedalDiagram(context, (DedalDiagram) semanticObject); 
				return; 
			case DedalPackage.INST_CONNECTION:
				sequence_InstConnection(context, (InstConnection) semanticObject); 
				return; 
			case DedalPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case DedalPackage.INTERFACE_TYPE:
				sequence_InterfaceType(context, (InterfaceType) semanticObject); 
				return; 
			case DedalPackage.PARAMETER:
				sequence_Parameter(context, (dedal.Parameter) semanticObject); 
				return; 
			case DedalPackage.PORT:
				sequence_Port_Impl(context, (Port) semanticObject); 
				return; 
			case DedalPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case DedalPackage.ROLE_CONNECTION:
				sequence_RoleConnection(context, (RoleConnection) semanticObject); 
				return; 
			case DedalPackage.SIGNATURE:
				sequence_Signature(context, (Signature) semanticObject); 
				return; 
			case DedalPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ArchitectureDescription returns Assembly
	 *     Assembly returns Assembly
	 *
	 * Constraint:
	 *     (
	 *         name=assembly_name 
	 *         instantiates=[Configuration|EString] 
	 *         assmComponents+=CompInstance 
	 *         assmComponents+=CompInstance* 
	 *         (interfaceTypes+=InterfaceType interfaceTypes+=InterfaceType*)? 
	 *         (assemblyConnections+=InstConnection assemblyConnections+=InstConnection*)?
	 *     )
	 */
	protected void sequence_Assembly(ISerializationContext context, Assembly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (type=EString name=attribute_name)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.ATTRIBUTE__TYPE));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeAccess().getNameAttribute_nameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ClassConnection returns ClassConnection
	 *
	 * Constraint:
	 *     (
	 *         refID=EString 
	 *         property=EString 
	 *         clientClassElem=[CompClass|EString] 
	 *         clientIntElem=[Interaction|EString] 
	 *         serverClassElem=[CompClass|EString] 
	 *         serverIntElem=[Interaction|EString]
	 *     )
	 */
	protected void sequence_ClassConnection(ISerializationContext context, ClassConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__REF_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__REF_ID));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CLASS_CONNECTION__CLIENT_CLASS_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CLASS_CONNECTION__CLIENT_CLASS_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CLASS_CONNECTION__SERVER_CLASS_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CLASS_CONNECTION__SERVER_CLASS_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassConnectionAccess().getRefIDEStringParserRuleCall_1_0(), semanticObject.getRefID());
		feeder.accept(grammarAccess.getClassConnectionAccess().getPropertyEStringParserRuleCall_3_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getClassConnectionAccess().getClientClassElemCompClassEStringParserRuleCall_5_0_1(), semanticObject.eGet(DedalPackage.Literals.CLASS_CONNECTION__CLIENT_CLASS_ELEM, false));
		feeder.accept(grammarAccess.getClassConnectionAccess().getClientIntElemInteractionEStringParserRuleCall_7_0_1(), semanticObject.eGet(DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM, false));
		feeder.accept(grammarAccess.getClassConnectionAccess().getServerClassElemCompClassEStringParserRuleCall_9_0_1(), semanticObject.eGet(DedalPackage.Literals.CLASS_CONNECTION__SERVER_CLASS_ELEM, false));
		feeder.accept(grammarAccess.getClassConnectionAccess().getServerIntElemInteractionEStringParserRuleCall_11_0_1(), semanticObject.eGet(DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns CompClass
	 *     CompClass returns CompClass
	 *     CompClass_Impl returns CompClass
	 *
	 * Constraint:
	 *     (
	 *         name=component_class_name 
	 *         (realizes+=[CompRole|EString] realizes+=[CompRole|EString]*)? 
	 *         id=EString 
	 *         implements=[CompType|EString]? 
	 *         content=[CompInstance|EString]? 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (compInterfaces+=Interaction compInterfaces+=Interaction*)?
	 *     )
	 */
	protected void sequence_CompClass_Impl(ISerializationContext context, CompClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns CompInstance
	 *     CompInstance returns CompInstance
	 *
	 * Constraint:
	 *     (
	 *         name=component_instance_name 
	 *         role=[CompRole|EString]? 
	 *         id=EString 
	 *         instantiates=[CompClass|EString] 
	 *         (compInterfaces+=Interaction compInterfaces+=Interaction*)?
	 *     )
	 */
	protected void sequence_CompInstance(ISerializationContext context, CompInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns CompRole
	 *     CompRole returns CompRole
	 *
	 * Constraint:
	 *     (
	 *         name=component_role_name 
	 *         id=EString 
	 *         (compInterfaces+=Interface compInterfaces+=Interface*)? 
	 *         (compInterfaces+=Interface compInterfaces+=Interface*)? 
	 *         minInstanceNbr=INT? 
	 *         maxInstanceNbr=INT? 
	 *         (compInterfaces+=Interaction compInterfaces+=Interaction*)?
	 *     )
	 */
	protected void sequence_CompRole(ISerializationContext context, CompRole semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns CompType
	 *     CompType returns CompType
	 *
	 * Constraint:
	 *     (
	 *         name=component_type_name 
	 *         id=EString 
	 *         (compInterfaces+=Interface compInterfaces+=Interface*)? 
	 *         (compInterfaces+=Interface compInterfaces+=Interface*)? 
	 *         (compInterfaces+=Interaction compInterfaces+=Interaction*)?
	 *     )
	 */
	protected void sequence_CompType(ISerializationContext context, CompType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Component returns CompositeCompClass
	 *     CompClass returns CompositeCompClass
	 *     CompositeCompClass returns CompositeCompClass
	 *
	 * Constraint:
	 *     (
	 *         name=component_class_name 
	 *         id=EString 
	 *         implements=[CompType|EString] 
	 *         uses=[Configuration|EString]? 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (realizes+=[CompRole|EString] realizes+=[CompRole|EString]*)? 
	 *         (compInterfaces+=Interaction compInterfaces+=Interaction*)? 
	 *         (delegatedInterfaces+=[Interaction|ID] delegatedInterfaces+=[Interaction|ID]*)?
	 *     )
	 */
	protected void sequence_CompositeCompClass(ISerializationContext context, CompositeCompClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns CompositePort
	 *     Port returns CompositePort
	 *     CompositePort returns CompositePort
	 *
	 * Constraint:
	 *     (name=EString ports+=[Port|EString] ports+=[Port|EString]*)
	 */
	protected void sequence_CompositePort(ISerializationContext context, CompositePort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArchitectureDescription returns Configuration
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (
	 *         name=configuration_name 
	 *         (implements+=[Specification|EString] implements+=[Specification|EString]*)? 
	 *         (configComponents+=CompClass configComponents+=CompClass*)? 
	 *         (interfaceTypes+=InterfaceType interfaceTypes+=InterfaceType*)? 
	 *         (comptypes+=CompType comptypes+=CompType*)? 
	 *         (configConnections+=ClassConnection configConnections+=ClassConnection*)?
	 *     )
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DedalDiagram returns DedalDiagram
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (architectureDescriptions+=ArchitectureDescription architectureDescriptions+=ArchitectureDescription*)? 
	 *         (repositories+=Repository repositories+=Repository*)?
	 *     )
	 */
	protected void sequence_DedalDiagram(ISerializationContext context, DedalDiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InstConnection returns InstConnection
	 *
	 * Constraint:
	 *     (
	 *         refID=EString 
	 *         clientInstElem=[CompInstance|EString] 
	 *         clientIntElem=[Interaction|EString] 
	 *         serverInstElem=[CompInstance|EString] 
	 *         serverIntElem=[Interaction|EString]
	 *     )
	 */
	protected void sequence_InstConnection(ISerializationContext context, InstConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__REF_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__REF_ID));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.INST_CONNECTION__CLIENT_INST_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.INST_CONNECTION__CLIENT_INST_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.INST_CONNECTION__SERVER_INST_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.INST_CONNECTION__SERVER_INST_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstConnectionAccess().getRefIDEStringParserRuleCall_1_0(), semanticObject.getRefID());
		feeder.accept(grammarAccess.getInstConnectionAccess().getClientInstElemCompInstanceEStringParserRuleCall_3_0_1(), semanticObject.eGet(DedalPackage.Literals.INST_CONNECTION__CLIENT_INST_ELEM, false));
		feeder.accept(grammarAccess.getInstConnectionAccess().getClientIntElemInteractionEStringParserRuleCall_5_0_1(), semanticObject.eGet(DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM, false));
		feeder.accept(grammarAccess.getInstConnectionAccess().getServerInstElemCompInstanceEStringParserRuleCall_7_0_1(), semanticObject.eGet(DedalPackage.Literals.INST_CONNECTION__SERVER_INST_ELEM, false));
		feeder.accept(grammarAccess.getInstConnectionAccess().getServerIntElemInteractionEStringParserRuleCall_9_0_1(), semanticObject.eGet(DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceType returns InterfaceType
	 *
	 * Constraint:
	 *     (name=EString (signatures+=Signature signatures+=Signature*)?)
	 */
	protected void sequence_InterfaceType(ISerializationContext context, InterfaceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=interface_name direction=DIRECTION type=[InterfaceType|ID] delegation=[Interface|ID]? instantiates=[Interface|EString]?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (id=EString name=EString? type=EString?)
	 */
	protected void sequence_Parameter(ISerializationContext context, dedal.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns Port
	 *     Port returns Port
	 *     Port_Impl returns Port
	 *
	 * Constraint:
	 *     (name=EString interfaces+=[Interface|EString] interfaces+=[Interface|EString]*)
	 */
	protected void sequence_Port_Impl(ISerializationContext context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     (name=EString (components+=Component components+=Component*)? (interfaceTypes+=InterfaceType interfaceTypes+=InterfaceType*)?)
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoleConnection returns RoleConnection
	 *
	 * Constraint:
	 *     (refID=EString clientCompElem=[CompRole|ID] clientIntElem=[Interaction|ID] serverCompElem=[CompRole|ID] serverIntElem=[Interaction|ID])
	 */
	protected void sequence_RoleConnection(ISerializationContext context, RoleConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__REF_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__REF_ID));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.ROLE_CONNECTION__CLIENT_COMP_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.ROLE_CONNECTION__CLIENT_COMP_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.ROLE_CONNECTION__SERVER_COMP_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.ROLE_CONNECTION__SERVER_COMP_ELEM));
			if (transientValues.isValueTransient(semanticObject, DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleConnectionAccess().getRefIDEStringParserRuleCall_1_0(), semanticObject.getRefID());
		feeder.accept(grammarAccess.getRoleConnectionAccess().getClientCompElemCompRoleIDTerminalRuleCall_3_0_1(), semanticObject.eGet(DedalPackage.Literals.ROLE_CONNECTION__CLIENT_COMP_ELEM, false));
		feeder.accept(grammarAccess.getRoleConnectionAccess().getClientIntElemInteractionIDTerminalRuleCall_5_0_1(), semanticObject.eGet(DedalPackage.Literals.CONNECTION__CLIENT_INT_ELEM, false));
		feeder.accept(grammarAccess.getRoleConnectionAccess().getServerCompElemCompRoleIDTerminalRuleCall_7_0_1(), semanticObject.eGet(DedalPackage.Literals.ROLE_CONNECTION__SERVER_COMP_ELEM, false));
		feeder.accept(grammarAccess.getRoleConnectionAccess().getServerIntElemInteractionIDTerminalRuleCall_9_0_1(), semanticObject.eGet(DedalPackage.Literals.CONNECTION__SERVER_INT_ELEM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Signature returns Signature
	 *
	 * Constraint:
	 *     (id=EString name=EString? type=EString? (parameters+=Parameter parameters+=Parameter*)?)
	 */
	protected void sequence_Signature(ISerializationContext context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArchitectureDescription returns Specification
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (
	 *         name=specification_name 
	 *         (specComponents+=CompRole specComponents+=CompRole*)? 
	 *         (specConnections+=RoleConnection specConnections+=RoleConnection*)? 
	 *         (interfaceTypes+=InterfaceType interfaceTypes+=InterfaceType*)?
	 *     )
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
