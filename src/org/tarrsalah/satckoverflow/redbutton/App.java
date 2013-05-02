/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tarrsalah.satckoverflow.redbutton;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author tarrsalah.org
 */
public class App extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		StackPane root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * The main() method is ignored in correctly deployed JavaFX application.
	 * main() serves only as fallback in case the application can not be
	 * launched through deployment artifacts, e.g., in IDEs with limited FX
	 * support. NetBeans ignores main().
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
