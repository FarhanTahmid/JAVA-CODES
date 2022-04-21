package emailApplication;

import javafx.scene.control.TreeItem;

public class EmailManager {
	//Folder Handling
	private EmailTreeItem<String>folderRoot=new EmailTreeItem<String>("");
	public EmailTreeItem<String> getFolderRoot() {
		return folderRoot;
	}
	
	public void addEmailAccount(EmailAccount emailAccount) {
		EmailTreeItem<String>treeItem=new EmailTreeItem<String>(emailAccount.getAddress());
		//treeItem.setExpanded(true);
		FetchFolderService fetchFolderService=new FetchFolderService(emailAccount.getStore(), treeItem);
		fetchFolderService.start();
			
		
		folderRoot.getChildren().add(treeItem);
	}
}

