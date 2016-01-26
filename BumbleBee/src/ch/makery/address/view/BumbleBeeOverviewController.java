package ch.makery.address.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ch.makery.address.MainApp;
import ch.makery.address.Writer;
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
	
	private Writer w;

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
		w = new Writer("Wifi_output.txt", "Up");
		up.requestFocus();
		System.out.println("UP");
		
	}

	public void down() {
		down.setFocusTraversable(false);
		w = new Writer("Wifi_output.txt", "Down");
		down.requestFocus();
		System.out.println("DOWN");
	}

	public void left() {
		left.setFocusTraversable(false);
		System.out.println("LEFT");
		w = new Writer("Wifi_output.txt", "Left");
		left.requestFocus();
	}

	public void right() {
		right.setFocusTraversable(false);
		w = new Writer("Wifi_output.txt", "Right");
		System.out.println("RIGHT");
		right.requestFocus();
	}

	public void stop() {
		System.out.println("STOP");
		w = new Writer("Wifi_output.txt", "Stop");
		
	}

	public Button getUp() {
		return up;
	}

	public void setUp(Button up) {
		this.up = up;
	}

	public Button getDown() {
		return down;
	}

	public void setDown(Button down) {
		this.down = down;
	}

	public Button getLeft() {
		return left;
	}

	public void setLeft(Button left) {
		this.left = left;
	}

	public Button getRight() {
		return right;
	}

	public void setRight(Button right) {
		this.right = right;
	}
	

}
