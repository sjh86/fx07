package fx07_chart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("eventTest.fxml"));

		Parent root = loader.load();
		Scene scene = new Scene(root);

		Controller ctl = loader.getController();
		ctl.setRoot(root);

		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

