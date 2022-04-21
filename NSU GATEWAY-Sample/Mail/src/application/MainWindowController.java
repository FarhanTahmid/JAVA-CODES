package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

public class MainWindowController {

    @FXML
    private TreeView<?> emailsTreeVies;

    @FXML
    private TableView<?> emailsTableView;
    /*
    @FXML
    private WebView emailwebview;
	*/
    @FXML
    void optionsAction() {
    	System.out.println("Hey");
    }

}

