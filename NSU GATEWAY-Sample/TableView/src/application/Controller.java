package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
	Parent root;
	Scene scene;
	
	private static Scanner reader;
	String filePath="src//Listreaddemofromtext.csv";
	
	@FXML private TableView<Person>tableView;
	@FXML private TableColumn<Person, String>firstName1;
	@FXML private TableColumn<Person, String>lastName1;
	
	//@FXML private TableColumn<Person, String>completedCredit;

	
	
	
	final ObservableList<Person>people=FXCollections.observableArrayList();
	
	@FXML
    private Button showInfo;

    @FXML
    void showInfo(ActionEvent event) {
    	ObservableList<Person> tableValue;
    	tableValue=tableView.getSelectionModel().getSelectedItems();
    	System.out.println(tableValue.get(0).getFirstName());
    	
    	try {
    		Stage stage=new Stage();
    		
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("GetValues.fxml"));
			root=loader.load();
			ShowInfoController passer=loader.getController();
			passer.getValue(tableValue.get(0).getFirstName());
			scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
		} catch (IOException e) {
			System.out.println("File can not be found");
			System.out.println(e);
			e.printStackTrace();
		}
    	
    }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String ID="";
		String name="";
		//String completedCredit="";
		
		try {
			reader=new Scanner(new File(filePath));
			reader.useDelimiter("[,\n]");
			
			try {
				while(reader.hasNext()) {
					ID=reader.next();
					name=reader.next();
					//completedCredit=reader.next();
					
					people.add(new Person(ID,name));
				}
				
			} catch (Exception e) {
				System.out.println("No data");
				System.out.println(e);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		/*
		people.add(new Person("Farhan", "Tahmid"));
		people.add(new Person("Farhan", "Tahmid"));
		people.add(new Person("Farhan", "Tahmid"));
		*/
		firstName1.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
		lastName1.setCellValueFactory(new PropertyValueFactory<Person,String>("LastName"));
		
		//this.completedCredit.setCellValueFactory(new PropertyValueFactory<Person,String>("completedCredit"));
		
		
		tableView.setItems(people);
		//System.out.println(people.get(0));
		
	}
	
	{
		
	}
	
}
