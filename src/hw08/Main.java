package hw08;

/* Joseph Comeaux
 * CS2012
 * 05 & 06 
 * Description: Main class to simply run the code from the other two classes
 * Other Comments: 
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setScene(JavaFX.MainScene());
		primaryStage.setTitle("First JavaFX project!!!");
		primaryStage.show();
	}
	
	// the method that is needed to run via eclipse
		public static void main(String[] args) {
			Application.launch(args);
		}

}
