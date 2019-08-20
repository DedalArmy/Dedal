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
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;

import dedal.presentation.DedalEditorAdvisor;

/**
 * Open action for the objects from the Dedal model.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAction extends WorkbenchWindowActionDelegate {
	/**
	 * Opens the editors for the files selected using the file dialog.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(IAction action) {
		String[] filePaths = DedalEditorAdvisor.openFilePathDialog(getWindow().getShell(), SWT.OPEN, null);
		if (filePaths.length > 0) {
			DedalEditorAdvisor.openEditor(getWindow().getWorkbench(), URI.createFileURI(filePaths[0]));
		}
	}
}
