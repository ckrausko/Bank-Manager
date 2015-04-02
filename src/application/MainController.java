package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
	private Button btnManagement;
	@FXML
	private Button btnTransaction;
	@FXML
	private Button btnReport;
	
	@FXML
	private void btnManagement(ActionEvent event) throws IOException{
		try {
			Stage primaryStage = new Stage();
			
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("AccountManager.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initModality(Modality.WINDOW_MODAL);
			primaryStage.initOwner(
		            ((Node)event.getSource()).getScene().getWindow() );
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@FXML
	private void btnTransaction(ActionEvent event) throws IOException{
		try {
			Stage primaryStage = new Stage();
			
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Transaction.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initModality(Modality.WINDOW_MODAL);
			primaryStage.initOwner(
		            ((Node)event.getSource()).getScene().getWindow() );
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
