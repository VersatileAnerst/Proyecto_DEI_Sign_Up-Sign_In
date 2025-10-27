/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInSignup.ui;

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

    public void init(Parent root, Stage stage) {
        
            Scene scene = new Scene(root);

             stage.setScene(scene);
             stage.show();
        // ventana sin texto 
         clearFields();
         //asociar eventos a manejadores
         btBack.setOnAction(this ::handlebuBackOnAction);
         btSignUp.setOnAction(this ::handlebuSignUp);
        
         //asociacion de manejadores a properties
         
         tfFirstName.textProperty().addListener(this::handletfFirstNameTextChange);
         tfFirstName.focusedProperty().addListener(this::handletfFirstNameFocusChange);
         tfLastName.textProperty().addListener(this::handletfLastNameTextChange);
         tfPhone.textProperty().addListener(this::handletfPhoneTextChange);
         tfEmail.textProperty().addListener(this::handletEmailTextChange);
         tfCity.textProperty().addListener(this::handletfCityTextChange);
         tfStreet.textProperty().addListener(this::handletfStreetTextChange);
         tfZip.textProperty().addListener(this::handletfZipTextChange);
       
     
    
        
   
   
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
}   
    /**
     * 
     * @param observable
     * @param oldValue
     * @param newValue 
     */
    private void handletfFirstNameTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
        
       
        
    
    }
    /**
     * 
     * @param observable
     * @param oldValue
     * @param newValue 
     */
    private void handletfFirstNameFocusChange(ObservableValue observable, Boolean oldValue, Boolean newValue){
        if (oldValue ){
            
        }   
        else{}
        
    }
    private void handletfLastNameTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
    
    }
    private void handletfPhoneTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
    
    }
    private void handletEmailTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
    
    }
    private void handletfCityTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
    
    }
    private void handletfStreetTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
    
    }
    private void handletfZipTextChange( ObservableValue observable ,
                                                String oldValue,
                                                String newValue){
    
    }
     
    private void handlebuBackOnAction(ActionEvent event){
        
    }
    private void handlebuSignUp(ActionEvent event){
        
    }
        
    

   
    
}
