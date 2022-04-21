package Scene;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneMain extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		//creating the interface
	
		Group root =new Group();
		Scene scene=new Scene(root,600,600,Color.YELLOW); //setting the size and color for the scene
		Stage stage = new Stage();
		
		//setting a text
		Text text=new Text();
		text.setText("This is Farhan");
		text.setX(50);  //setting the text position
		text.setY(100); 
		text.setFont(Font.font("Gothic",35)); //changing font
		text.setFill(Color.RED); //changing color of the text
		
		//creating a line
		Line line =new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.BLUE);
		line.setOpacity(0.6); //setting the opacity of the line
		line.setRotate(45);
		
		//creating a rectangle
		Rectangle rectangle= new Rectangle();
		rectangle.setX(100);
		rectangle.setY(200);
		rectangle.setWidth(100);
		rectangle.setHeight(50);
		rectangle.setFill(Color.NAVY);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.RED);
		
		//creating a triangle
		
		Polygon triangle=new Polygon();
		triangle.getPoints().setAll(200.0,200.0,
									300.0,300.0,
									200.0,300.0);
		triangle.setFill(Color.WHITE);
		
		//creating Circle
		Circle circle =new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.GREEN);
		
		//adding image to scene
		Image image=new Image("NSU-LOGO-2021-resized.png");
		ImageView imageview=new ImageView(image);
		imageview.setX(400);
		imageview.setY(400);
		
		root.getChildren().add(text); //as text is a node we have to add that to the node
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageview);
		stage.setScene(scene);
		stage.show();
		
	}

}