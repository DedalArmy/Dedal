package fr.ema.dedal.design;

import org.obeonetwork.dsl.viewpoint.xtext.support.action.OpenXtextEmbeddedEditor;



import com.google.inject.Injector;

import fr.ema.dedal.xtext.ui.internal.DedalADLActivator;

public class OpenEmbeddedEditor extends OpenXtextEmbeddedEditor {
	    protected Injector getInjector() {
	        return  DedalADLActivator.getInstance().getInjector("fr.ema.dedal.xtext.DedalADL");
	    }
	}
