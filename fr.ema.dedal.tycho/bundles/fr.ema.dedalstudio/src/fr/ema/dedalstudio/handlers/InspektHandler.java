package fr.ema.dedalstudio.handlers;

import fr.ema.dedal.componentinspector.explorer.Explorer;
import java.io.IOException;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;


public class InspektHandler {

	
	String defaultPath = "C:\\Users\\Alexandre\\Documents\\Travail\\IDEs\\library";

	@Execute
	public void execute(Shell shell) throws ClassNotFoundException, NoSuchMethodException, IOException {
		DirectoryDialog dialog = new DirectoryDialog(shell);
		dialog.setText("Choose library or jar to inspect");
//		dialog.setFilterPath(defaultPath);
		dialog.open();



//		MessageDialog.openInformation(shell, "Choisi", dialog.getFilterPath());
		
		MessageBox mb = new MessageBox(shell);

		if(!dialog.getFilterPath().equals(""))
		{
			mb.setMessage(Explorer.print(dialog.getFilterPath()));
			mb.open();
		}
		
	}
	
}
