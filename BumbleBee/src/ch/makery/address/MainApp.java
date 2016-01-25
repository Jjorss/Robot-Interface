package ch.makery.address;

import java.io.IOException;

import ch.makery.address.view.BumbleBeeOverviewController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private Writer w;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("BumbleBee");

		initRootLayout();

		showBumbleBeeOverview();

	}

	/**
	 * Initializes the root layout.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					switch (event.getCode()) {
					case W:
						System.out.println("UP");
						w = new Writer("Wifi_output.txt", "Up");
						break;
					case S:
						System.out.println("DOWN");
						w = new Writer("Wifi_output.txt", "Down");
						break;
					case A:
						System.out.println("LEFT");
						w = new Writer("Wifi_output.txt", "Left");
						break;
					case D:
						System.out.println("RIGHT");
						w = new Writer("Wifi_output.txt", "Right");
						break;
					default:
						break;

					}

				}

			});
			scene.setOnKeyReleased(new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					System.out.println("STOP");
					w = new Writer("Wifi_output.txt", "Stop");
				}

			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows the person overview inside the root layout.
	 */
	public void showBumbleBeeOverview() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/BumbleBeeOverview.fxml"));
			AnchorPane BumbleBeeOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(BumbleBeeOverview);

			// Give the controller access to the main app.
			BumbleBeeOverviewController controller = loader.getController();
			controller.setMainApp(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
