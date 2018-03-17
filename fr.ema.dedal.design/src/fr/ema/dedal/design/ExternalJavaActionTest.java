package fr.ema.dedal.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ExternalJavaActionTest implements IExternalJavaAction {

	public ExternalJavaActionTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		System.out.println("ça marche!");
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
