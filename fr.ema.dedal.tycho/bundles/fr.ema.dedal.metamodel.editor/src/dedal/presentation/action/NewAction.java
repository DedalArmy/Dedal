/*******************************************************************************
 * Copyright (C) 2019 aleborgne
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package dedal.presentation.action;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

import dedal.presentation.DedalWizard;

/**
 * Action to create objects from the Dedal model. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class NewAction extends WorkbenchWindowActionDelegate {
	/**
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 *      <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void run(IAction action) {
		DedalWizard wizard = new DedalWizard();
		wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
		WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
		wizardDialog.open();
	}
}
