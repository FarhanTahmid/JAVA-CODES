package TreeView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller implements Initializable{
	
	@FXML
	private TreeView myTreeView;	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String>rootItem=new TreeItem<>("Files");
		TreeItem<String>branchItem1=new TreeItem<>("Pictures");
		TreeItem<String>branchItem2=new TreeItem<>("Videos");
		TreeItem<String>branchItem3=new TreeItem<>("Tv-series");
		
		TreeItem<String>leafItem1=new TreeItem<>("Picture1");
		TreeItem<String>leafItem2=new TreeItem<>("Video1");
		TreeItem<String>leafItem3=new TreeItem<>("Hannibal");
		
		
		rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3);
		branchItem1.getChildren().add(leafItem1);
		branchItem2.getChildren().add(leafItem2);
		branchItem3.getChildren().add(leafItem3);
		
		
		myTreeView.setRoot(rootItem);
		
	}
	
	
	public void selectItem() {
		
		TreeItem<String> item=(TreeItem<String>) myTreeView.getSelectionModel().getSelectedItem();
		if(item!=null) {
			System.out.println(item.getValue());
		}
		
	}
}
