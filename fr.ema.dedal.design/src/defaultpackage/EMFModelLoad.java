package defaultpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dedal.ArchitectureDescription;
import dedal.DedalDiagram;
import dedal.DedalPackage;
import dedal.Repository;


public class EMFModelLoad {
	
	private String path = "/Users/madlener/Documents/Ales/EMACS/RetD/runtime-DedalStudio/fr.ema.dedal.HASModel/model/HAS2.dedal";

	
	public DedalDiagram load() {
		System.out.println("load_begin");
	    // Initialize the model
	    DedalPackage.eINSTANCE.eClass();
	    
	    // Register the XMI resource factory for the .website extension

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("dedal", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI(path), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    DedalDiagram myDedal = (DedalDiagram) resource.getContents().get(0);
		System.out.println("load_end");
	    return myDedal;
	  }
	
	public ArchitectureDescription ArchitectureDescriptionLoad(DedalDiagram myDedal, String name){
		ArchitectureDescription myArchi = null;
		int index = -1;
		for (int i = 0; i< myDedal.getArchitectureDescriptions().size(); i++){
			if (myDedal.getArchitectureDescriptions().get(i).getName().equals(name)){
				index = i;
				break;
			}
		}
		if (index > -1){
			myArchi = myDedal.getArchitectureDescriptions().get(index);
		}
		return myArchi;
	}
	
	public Repository RepositoryLoad(DedalDiagram myDedal, String name){
		Repository myRepo = null;
		int index = -1;
		for (int i = 0; i< myDedal.getRepositories().size(); i++){
			if (myDedal.getRepositories().get(i).getName().equals(name)){
				index = i;
				break;
			}
		}
		if (index > -1){
			myRepo = myDedal.getRepositories().get(index);
		}
		return myRepo;
	}
	public ArchitectureDescription ArchitectureDescriptionLoad(String name){
		DedalDiagram myDedal = this.load();
		ArchitectureDescription myArchi = this.ArchitectureDescriptionLoad(myDedal, name);
		return myArchi;
	}
	
	public void save(DedalDiagram myDedal){
		System.out.println("start save");
		
		
		
		ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    Resource resource = resSet.createResource(CommonPlugin.resolve(myDedal.eResource().getURI()));
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(myDedal);
		System.out.println("middle save");

	    // now save the content.
		try {
		      resource.save(Collections.EMPTY_MAP);
		    } catch (IOException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		System.out.println("end save");

	}
}
