package ch.makery.address.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ch.makery.address.MainApp;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;

public class BumbleBeeOverviewController {

	@FXML
	private Button up;

	@FXML
	private Button down;

	@FXML
	private Button left;

	@FXML
	private Button right;
	
	@FXML
	private ToggleButton tgKeyboard;

	private Boolean running = true;

	// Reference to the main application.
	private MainApp mainApp;

	/**
	 * The constructor. The constructor is called before the initialize()
	 * method.
	 */
	public BumbleBeeOverviewController() {

	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void up() {
		up.setFocusTraversable(false);
		System.out.println("UP");
		
	}

	public void down() {
		down.setFocusTraversable(false);
		System.out.println("DOWN");
	}

	public void left() {
		left.setFocusTraversable(false);
		System.out.println("LEFT");
	}

	public void right() {
		right.setFocusTraversable(false);
		System.out.println("RIGHT");
	}

	public void stop() {
		System.out.println("STOP");
		running = false;
	}
	
	public void keyboard() {
		tgKeyboard.setFocusTraversable(true);
		if(tgKeyboard.isSelected()) {
			
		}
	}

}
