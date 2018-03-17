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