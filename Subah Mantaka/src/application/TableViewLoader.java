package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewLoader implements Initializable {
	@FXML
    private TableView<Coins> mantakatable;

    @FXML
    private TableColumn<Coins, String> correctAnswerColumn;

    @FXML
    private TableColumn<Coins, String> coinsWonColumn;

    @FXML
    private TableColumn<Coins, String> coinsLostColumn;

    @FXML
    private TableColumn<Coins, String> toalCoinsColumn;

    
    final ObservableList<Coins>gameChart=FXCollections.observableArrayList();
    String coorectAns="";
    String coinsLost="";
    String coinsWon="";
    String totalCoins="";
    File file=new File("src//manatak2.csv");
    PrintWriter writer;
    void writeInCsv() {
    	try {
			writer=new PrintWriter(file);
		
			writer.append("3 out of 5 games");
			writer.append(",");
			writer.append("14");
			writer.append(",");
			writer.append("2");
			writer.append(",");
			writer.append("12");
			writer.append("\n");
			writer.flush();
			writer.close();
			
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    static Scanner reader;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			reader=new Scanner(file);
			reader.useDelimiter("[,\n]");
			while(reader.hasNext()) {
				coorectAns=reader.next();
				coinsWon=reader.next();
				coinsLost=reader.next();
				totalCoins=reader.next();
				gameChart.add(new Coins(coorectAns, coinsWon, coinsLost, totalCoins));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("here");
			e.printStackTrace();
		}
		this.correctAnswerColumn.setCellValueFactory(new PropertyValueFactory<Coins,String>("correctAnswer"));
		this.coinsWonColumn.setCellValueFactory(new PropertyValueFactory<Coins,String>("coinsWon"));
		this.coinsLostColumn.setCellValueFactory(new PropertyValueFactory<Coins,String>("coinsLost"));
		this.toalCoinsColumn.setCellValueFactory(new PropertyValueFactory<Coins,String>("totalCoins"));
		
		this.mantakatable.setItems(gameChart);
		
	}
	
}
