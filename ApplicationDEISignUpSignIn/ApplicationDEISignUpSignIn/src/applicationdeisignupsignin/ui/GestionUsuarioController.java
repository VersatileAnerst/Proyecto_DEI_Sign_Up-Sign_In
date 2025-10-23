/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin.ui;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 *
 * @author daniel
 */
public class GestionUsuarioController {
    @FXML
    private Button btSignIn;
    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField pfPassword;
    @FXML
    private Hyperlink hySignUp;
    @FXML
    private Button btExit;
    
    public void init(Stage stage, Parent root) {
        Scene scene =new Scene(root);    
        stage.setScene(scene);
    
        //*asociar eventos a manejadores
        btSignIn.setOnAction(this::handleBtSignInOnAction);
        btExit.setOnAction(this::handleBtExitOnAction);
        //*asociación de manejadores a properties
        tfUsername.textProperty().addListener(this::handleTfUsernameTextChange);
        tfUsername.focusedProperty().addListener(this::handleTfUsernameFocusChange);
        //*mostrar la ventana 
        stage.show();
       
    }
    /**
     * Este metodo sirve para comprobas si se ha cambido el texto en TextField Username
     * @param observable
     * @param oldvalue
     * @param newvalue 
     */
    private void handleTfUsernameTextChange(ObservableValue observable, String oldvalue, String newvalue){
        
    }
    /**
     * Este metodo sirve para enfocar el texto Tfusername
     * @param observable
     * @param oldvalue
     * @param newValue 
     */
    private void handleTfUsernameFocusChange(ObservableValue observable, Boolean oldValue, Boolean newValue){
        if(!oldValue){
            
        }else{
            
        }
    }
    /**
     * Este metodo maneja la accion del Boton
     * @param event 
     */
    private void handleBtExitOnAction(ActionEvent event){
        
    }
    /**
     * Este metodo maneja la accion del Boton
     * @param event 
     */
    private void handleBtSignInOnAction(ActionEvent event){
        
    }

}
