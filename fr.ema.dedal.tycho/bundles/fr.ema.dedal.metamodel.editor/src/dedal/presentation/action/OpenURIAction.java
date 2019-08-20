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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;

import dedal.presentation.DedalEditorAdvisor;

/**
 * Open URI action for the objects from the Dedal model.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenURIAction extends WorkbenchWindowActionDelegate {
	/**
	 * Opens the editors for the files selected using the LoadResourceDialog.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(IAction action) {
		LoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(getWindow().getShell());
		if (Window.OK == loadResourceDialog.open()) {
			for (URI uri : loadResourceDialog.getURIs()) {
				DedalEditorAdvisor.openEditor(getWindow().getWorkbench(), uri);
			}
		}
	}
}
