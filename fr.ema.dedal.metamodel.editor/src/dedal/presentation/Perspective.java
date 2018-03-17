package dedal.presentation;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.sirius.ui.tools.api.views.modelexplorerview.IModelExplorerView;
/**
 * RCP's perspective
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Perspective implements IPerspectiveFactory {
	/**
	 * Perspective ID
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String ID_PERSPECTIVE = "dedal.presentation.Perspective";

	/**
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID_PERSPECTIVE);

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.2f, layout.getEditorArea());
		left.addView(IModelExplorerView.ID);
		
		IFolderLayout bottomleft = layout.createFolder("bottomleft", IPageLayout.BOTTOM, 0.7f, "left");
		bottomleft.addView(IPageLayout.ID_OUTLINE);

		IFolderLayout bottomRight = layout.createFolder("bottonRight", IPageLayout.BOTTOM, (float)0.60, layout.getEditorArea());
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);
		 
		
	}
}