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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddCustomerController implements Initializable {

	@FXML
	private Button btnSubmit;
	@FXML
	private TextField txtFirstName;
	@FXML
	private TextField txtLastName;
	@FXML
	private TextField txtMiddle;
	@FXML
	private TextField txtStreet;
	@FXML
	private TextField txtCity;
	@FXML
	private TextField txtState;
	@FXML
	private TextField txtZip;
	@FXML
	private TextField txtPhone;
	@FXML
	private TextField txtEmail;
	@FXML
	private Label lblMessage;
	@FXML
	private void btnSubmit(ActionEvent event){
		boolean safe = true;
		
		if(txtFirstName.getText().trim().equals("") || txtLastName.getText().trim().equals("") || txtStreet.getText().trim().equals("")
				|| txtCity.getText().trim().equals("") || txtState.getText().trim().equals("") || txtZip.getText().trim().equals("")
				|| txtPhone.getText().trim().equals("")){
			safe = false;
		}
		if(safe){
			// do some SQL insert here
			lblMessage.setText("Customer successfully added");
		}
		else{
			lblMessage.setText("Please fill out required fields");
		}
		
	}
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
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
