package fr.ema.dedalstudio.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

import dedal.presentation.DedalWizard;

public class NewHandler {

	@Execute
	public void execute(Shell shell) {
		DedalWizard wizard = new DedalWizard();
		WizardDialog dial = new WizardDialog(shell, wizard);
		dial.create();
		dial.open();
	}
	
}
