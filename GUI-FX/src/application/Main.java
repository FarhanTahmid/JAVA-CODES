package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {       //(Stage nameOfStage creates a new Stage already
		
		//adding scene to the stage
		Group root =new Group();     //creating a root node for the scene to work..its must to create a node for the scene and to pass it to the scene 
		Scene scene= new Scene(root,Color.BLACK); //(adding the root note by passing the value,setting the Background color)
		//setting icon image
		Image icon =new Image("NSU-LOGO-2021-resized.png");
		
		//setting width and height
		stage.setHeight(420);
		stage.setWidth(420);
		//stage.setResizable(false); //can't resize the window using this
		
		/*
		//setting where my stage is going to appear of my screen
		stage.setX(50);
		stage.setY(100);
		*/
		
		//stage.setFullScreen(true);  //this makes the stage full screen
		
		stage.getIcons().add(icon); //adding icon to the stage
		stage.setTitle("Stage Creating");  //creating title for the stage
		stage.setScene(scene);  //adding the scene to the stage
		stage.show();  //makes the stage visible
		//Stage stage=new Stage(); //you can create a new Stage like this
		
	}

}
