/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInSignup.ui;

import SignInSignup.model.Customer;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author jimmy
 */
public class GestionUsuarioController {
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private TextField tfMiddlelnitial;
    @FXML
    private TextField tfPhone;
    @FXML
    private TextField tfEmail;
    @FXML
    private PasswordField pfPassword;
    @FXML
    private PasswordField pfConfirmPassword;
    @FXML
    private TextField tfCity;
    @FXML
    private TextField tfStreet;
    @FXML
    private TextField tfZip;
    @FXML
    private Hyperlink hySignIn; 
    @FXML
    private Button btSignUp;
    @FXML
    private Button btBack;
    
    private static final Logger LOGGER=Logger.getLogger("proyectosignUpNewCustomer.ui");
    
    private Stage stage;
    

    public void init(Parent root, Stage stage) {
        logger.info("Initializing login stage");
            Scene scene = new Scene(root);

             stage.setScene(scene);
             stage.setTitle("login");//customer
             stage.setResizable(false);
             stage.setOnShowing(this::handleWindowShowing);
           
        // ventana sin texto 
         //clearFields();
         //asociar eventos a manejadores
         btBack.setOnAction(this ::handlebuBackOnAction);
         btSignUp.setOnAction(this ::handlebtSignUpAction);
        
         //asociacion de manejadores a properties
         
         tfFirstName.textProperty().addListener(this::handletfFirstNameTextChange);
         tfFirstName.focusedProperty().addListener(this::handletfFirstNameFocusChange);
         tfLastName.textProperty().addListener(this::handletfLastNameTextChange);
         tfPhone.textProperty().addListener(this::handletfPhoneTextChange);
         tfEmail.textProperty().addListener(this::handletEmailTextChange);
         tfCity.textProperty().addListener(this::handletfCityTextChange);
         tfStreet.textProperty().addListener(this::handletfStreetTextChange);
         tfZip.textProperty().addListener(this::handletfZipTextChange);
         pfPassword.textProperty().addListener(this::validateForm);
         pfConfirmPassword.textProperty().addListener(this::validateForm);
    
         stage.show();
         }
    private void handleWindowShowing(WindowEvent event){
        logger.info("Beggin LoginController::handleWindowShowing");
        buSignUp.setDisable(true);
        tfFirstName.requestFocus();
    }
    private void clearFields() {
        tfFirstName.clear();
        tfLastName.clear();
        tfMiddlelnitial.clear();
        tfPhone.clear();
        tfEmail.clear();
        pfPassword.clear();
        pfConfirmPassword.clear();
        tfCity.clear();
        tfStreet.clear();
        tfZip.clear();
        
   
    }
    protected void showErrorAlert(String errorMsg){
        //Shows error dialog.
        Alert alert=new Alert(Alert.AlertType.ERROR,
                              errorMsg,
                              ButtonType.OK);
        alert.showAndWait();
}   //validaciones nuevas .......



    /**
     * 
     * @param observable
     * @param oldValue
     * @param newValue 
     */
    private void handletfFirstNameTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        
        if (newValue.length() > 255) {
            tfFirstName.setText(oldValue);
            showErrorAlert("El nombre de usuario supera el numero maximo de caracteres.");           
      
    
    }}
    /**
     * 
     * @param observable
     * @param oldValue
     * @param newValue 
     */
    private void handletfFirstNameFocusChange(ObservableValue observable,
            Boolean oldValue, Boolean newValue){
        if (oldValue ){
            if (!newValue) { // perdió el foco
            if (tfFirstName.getText().trim().isEmpty()) {
                tfFirstName.setStyle("-fx-border-color: red;");
            } else {
                tfFirstName.setStyle(null);
            }
        }
            
        }
    }
    private void handletfLastNameTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        if (newValue.length() > 255) {
            tfLastName.setText(oldValue);
            showErrorAlert("El apellido de usuario supera el numero maximo de caracte");
    }
    
    }
    private void handletfPhoneTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        if (newValue.length() > 20) {
            tfPhone.setText(oldValue);
            showErrorAlert("El telefono usuario supera el numero maximo de caracteres.");
    
    }}
    private void handletEmailTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        if (newValue.length() > 255) {
            tfEmail.setText(oldValue);
            showErrorAlert("El nombre de usuario supera el numero maximo de caracteres.");
    }
    
    }
    private void handletfCityTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        if (newValue.length() > 255) {
            tfCity.setText(oldValue);
            showErrorAlert("la calle del usuario supera el numero maximo de caracteres.");
    
    }}
    private void handletfStreetTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        if(newValue.length() > 255) {
            tfCity.setText(oldValue);
            showErrorAlert("la ciudad del usuario supera el numero maximo de caracteres.");
        
    
    }}
    private void handletfZipTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        if(newValue.length() > 255) {
            tfZip.setText(oldValue);
            showErrorAlert("El ZIP de usuario supera el numero maximo de caracteres.");
    
    }}
     
    private void handlebuBackOnAction(ActionEvent event){
        if (stage != null) {
            stage.close();
        }
        
    }
    private void handlebtSignUpAction(ActionEvent event) {
     try {
    if (btSignUp.isDisabled()) {
     showErrorAlert("Please fill all required fields correctly.");
        return;
    }
    Customer c = new Customer();
    c.setFirstName(tfFirstName.getText());
    c.setLastName(tfLastName.getText());
    c.setMiddleInitial(tfMiddlelnitial.getText());
    c.setPhone(Long.parseLong(tfPhone.getText()));
    c.setEmail(tfEmail.getText().trim());
    c.setPassword(pfPassword.getText());
    c.setCity(tfCity.getText());
    c.setStreet(tfStreet.getText());
    c.setZip(Integer.parseInt(tfZip.getText()));
    //c =new CustomerRESTClient();
   //client.create_XML(customer); 

    LOGGER.info("Customer registered: " + c.toString());
    showInfoAlert("Customer registered successfully!");
    clearFields();
    btSignUp.setDisable(true);
    tfFirstName.requestFocus();
    } catch (NumberFormatException e) {
    showErrorAlert("Error registering customer: " +
    e.getMessage());
    }catch (Exception e) {
    showErrorAlert("Error registering customer: " +
    e.getMessage());
    }
   }

               //    create_XML(customer);
           //new Alert("msg");

       public void init() {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       private void showInfoAlert(String customer_registered_successfully) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class buSignUp {

        private static void setDisable(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public buSignUp() {
        }
    }

    private static class logger {

        private static void info(String initializing_login_stage) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public logger() {
        }
    }
     private void validateForm(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        boolean allFilled = !pfPassword.getText().isEmpty() &&
                            !pfConfirmPassword.getText().isEmpty();

        buSignUp.setDisable(!allFilled);
    }
     private void handleTextChange(ObservableValue<? extends String>
    observable, String oldValue, String newValue) {
    validateForm();
    }
    private void validateForm() {
    boolean valid = true;
    String msg = "";
      if(tfFirstName.getText().trim().isEmpty()) {
    valid = false;
    msg = "First Name is required.";
    } else if (!tfFirstName.getText().matches("[A-Za-z]+")) {
    valid = false;
    msg = "First Name must contain only letters.";
    } else if (tfLastName.getText().trim().isEmpty()) {
    valid = false;
    msg = "Last Name is required.";
    } else if (!tfLastName.getText().matches("[A-Za-z]+")) {
    valid = false;
    msg = "Last Name must contain only letters.";
    } else if (!tfMiddlelnitial.getText().isEmpty() &&
    !tfMiddlelnitial.getText().matches("^[A-Za-z]$")) {
    valid = false;
    msg = "Only one character allowed for Middle Initial.";
    } else if (!tfPhone.getText().matches("\\d{9,15}")) {
    valid = false;
    msg = "Invalid phone number.";
    } else if (!Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
    tfEmail.getText())) {
    valid = false;
    msg = "Invalid email format.";
    } else if (pfPassword.getText().length() < 8) {valid = false;
    msg = "Password must be at least 8 characters.";
    } else if
    (!pfPassword.getText().equals(pfConfirmPassword.getText())) {
    valid = false;
    msg = "Passwords do not match.";
    } else if (tfCity.getText().isEmpty() ||
    tfStreet.getText().isEmpty() || tfZip.getText().isEmpty()) {
    valid = false;
    msg = "Address fields are required.";
    }
    btSignUp.setDisable(!valid);
    if (!valid && !msg.isEmpty()) {
    LOGGER.warning(msg);
    }
    }



        
    }
    
        
    
        
    

