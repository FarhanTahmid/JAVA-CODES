package application;
	
import java.beans.EventHandler;



import javafx.application.Application;
import javafx.event.ActionEvent;


import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application  {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// UI Element
		
		
		
		
		
		Label lb1 = new Label    ("Enter First Value");
		Label lb2 = new Label    ("Enter Second Value");
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		Button b1 = new Button("Add");
		
		b1.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				String val1= tf1.getText().toString();
				String val2= tf2.getText().toString();
				
				int num1= Integer.parseInt(val1);
				int num2= Integer.parseInt(val2);
				int sum= num1+num2;
				
				// AlertBox
				
			Alert al= new Alert(AlertType.CONFIRMATION);
			al.setContentText(String.valueOf(sum));
			al.show();
				
			}
		});
		
		
		
		
		Button b2 = new Button("Sub");
		
		
		

		b2.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				String val1= tf1.getText().toString();
				String val2= tf2.getText().toString();
				
				int num1= Integer.parseInt(val1);
				int num2= Integer.parseInt(val2);
				int sum= num1-num2;
				
				// AlertBox
				
			Alert al= new Alert(AlertType.CONFIRMATION);
			al.setContentText(String.valueOf(sum));
			al.show();
				
			}
		});
		
		
		
		
		
		
		
		
		
		Button b3 = new Button("Mult");
		

		b3.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				String val1= tf1.getText().toString();
				String val2= tf2.getText().toString();
				
				int num1= Integer.parseInt(val1);
				int num2= Integer.parseInt(val2);
				int mult= num1*num2;
				
				// AlertBox
				
			Alert al= new Alert(AlertType.CONFIRMATION);
			al.setContentText(String.valueOf(mult));
			al.show();
				
			}
		});
		
		Button b4 = new Button("Div");
		

		b4.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				String val1= tf1.getText().toString();
				String val2= tf2.getText().toString();
				
				int num1= Integer.parseInt(val1);
				int num2= Integer.parseInt(val2);
				int div= num1/num2;
				
				// AlertBox
				
			Alert al= new Alert(AlertType.CONFIRMATION);
			al.setContentText(String.valueOf(div));
			al.show();
				
			}
		});
		
		
		
		//Layout
		
		 
		
		HBox hb1 = new HBox(10,lb1,tf1);
		HBox hb2 = new HBox(10,lb2,tf2);
		HBox hb3 = new HBox (10,b1,b2,b3,b4);
		
		VBox vb = new VBox(10,hb1,hb2,hb3);
		//...tab for position ///hb.setAlignment(Pos.CENTER);
		
		//Scene
		
		Scene sc = new Scene(vb, 500,500);
		
		//Stage
		
		
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
