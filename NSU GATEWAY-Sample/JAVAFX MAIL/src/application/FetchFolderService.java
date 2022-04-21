package application;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Store;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class FetchFolderService extends Service<Void> {

	private Store store;
	private EmailTreeItem<String>folderroot;
	

	public FetchFolderService(Store store, EmailTreeItem<String> folderroot) {
		super();
		this.store = store;
		this.folderroot = folderroot;
	}
	



	@Override
	protected Task<Void> createTask() {
		
		return new Task<Void>() {

			@Override
			protected Void call() throws Exception {
				fetchfolders();
				return null;
			}

			private void fetchfolders() {
				try {
					Folder[] folders=store.getDefaultFolder().list();
					handleFolders(folders,folderroot);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}

			private void handleFolders(Folder[] folders, EmailTreeItem<String> folderroot) throws MessagingException {
				for(Folder folder: folders) {
					EmailTreeItem<String>emailTreeItem=new EmailTreeItem<String>(folder.getName());
					folderroot.getChildren().add(emailTreeItem);
					folderroot.setExpanded(true);
					if(folder.getType()==Folder.HOLDS_FOLDERS) {
						Folder[] subFolders=folder.list();
						handleFolders(subFolders, emailTreeItem);
					}
				}
				
			}
		}; 
	}
	
}
