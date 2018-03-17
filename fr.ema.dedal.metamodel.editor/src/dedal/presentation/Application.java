package dedal.presentation;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

/**
 * RCP's application <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Application implements IApplication {
	/**
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 *      <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object start(IApplicationContext context) throws Exception {
		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
				new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI, new OCLValidationDelegateFactory.Global());
		WorkbenchAdvisor workbenchAdvisor = new DedalEditorAdvisor();
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
			if (returnCode == PlatformUI.RETURN_RESTART) {
				return IApplication.EXIT_RESTART;
			} else {
				return IApplication.EXIT_OK;
			}
		} finally {
			display.dispose();
		}
	}

	/**
	 * @see org.eclipse.equinox.app.IApplication#stop() <!-- begin-user-doc -->
	 *      <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// Do nothing.
	}
}
