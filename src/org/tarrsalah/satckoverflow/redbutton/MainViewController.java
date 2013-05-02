/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tarrsalah.satckoverflow.redbutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author tarrsalah.org
 */
public class MainViewController implements Initializable {

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	@FXML
	public void sayHello() {
		System.out.println("Hello");
	}
}
