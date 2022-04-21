package application;





import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;


public class MainWindowController extends BaseController implements Initializable {

    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
		super(emailManager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}

	@FXML
    private TreeView<String> emailsTreeVies;

    @FXML
    private TableView<?> emailsTableView;

    @FXML
    private WebView emailwebview;

    @FXML
    private MenuItem options;

    @FXML
    void optionsAction() {

    }

    @FXML
    void options() {

    	viewFactory.showOptionSWindow();
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setUpEmailsTreeView();
		
	}

	private void setUpEmailsTreeView() {
		emailsTreeVies.setRoot(emailManager.getFolderRoot());
		emailsTreeVies.setShowRoot(false);
		
	}

}
