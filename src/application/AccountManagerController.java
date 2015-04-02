package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class AccountManagerController implements Initializable {
	
	@FXML
	private ComboBox cmbOptions;
	@FXML
	private void cmbOptions(ActionEvent event) throws IOException {
		if(cmbOptions.getValue().equals("Add Customer")){
			
			Parent mainWindowParent = FXMLLoader.load(getClass().getResource("AddCustomer.fxml"));
			Scene mainWindowScene = new Scene(mainWindowParent);
			Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(mainWindowScene);
			app_stage.show();
		}
		else if(cmbOptions.getValue().equals("Delete Customer")){

			Parent mainWindowParent = FXMLLoader.load(getClass().getResource("DeleteCustomer.fxml"));
			Scene mainWindowScene = new Scene(mainWindowParent);
			Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(mainWindowScene);
			app_stage.show();
		}
		else if(cmbOptions.getValue().equals("Add Account")){
			Parent mainWindowParent = FXMLLoader.load(getClass().getResource("AddAccount.fxml"));
			Scene mainWindowScene = new Scene(mainWindowParent);
			Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(mainWindowScene);
			app_stage.show();
		}
		else if(cmbOptions.getValue().equals("Close Account")){
			Parent mainWindowParent = FXMLLoader.load(getClass().getResource("CloseAccount.fxml"));
			Scene mainWindowScene = new Scene(mainWindowParent);
			Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(mainWindowScene);
			app_stage.show();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
