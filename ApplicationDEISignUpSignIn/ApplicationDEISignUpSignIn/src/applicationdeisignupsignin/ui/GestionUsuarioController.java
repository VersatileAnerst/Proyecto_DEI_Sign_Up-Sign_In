/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin.ui;
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
        try{
        Scene scene =new Scene(root);   
        stage.setScene(scene);
        //Establecer el titulo de la ventana en "Bank App"
        stage.setTitle("BankApp");
        //Ventana no redimensionable
        stage.setResizable(false);
        //*asociar eventos a manejadores
        btSignIn.setOnAction(this::handleBtSignInOnAction);
        btExit.setOnAction(this::handleBtExitOnAction);
        //*asociación de manejadores a properties
        tfUsername.textProperty().addListener(this::handleTfUsernameTextChange);
        tfUsername.focusedProperty().addListener(this::handleTfUsernameFocusChange);
        pfPassword.textProperty().addListener(this::handlePfPasswordTextChange);
        //*mostrar la ventana 
        stage.show();
        }catch(Exception e){
            
        }
    }
    /**
     * Este metodo sirve para comprobas si se ha cambido el texto en TextField Username
     * @param observable
     * @param oldValue
     * @param newValue 
     */
    private void handleTfUsernameTextChange(ObservableValue observable,
            String oldValue, String newValue){
        
    }
    /**
     * Este metodo sirve para enfocar el texto Tfusername
     * @param observable
     * @param oldvalue
     * @param newValue 
     */
    private void handleTfUsernameFocusChange(ObservableValue observable,
            Boolean oldValue, Boolean newValue){
        if(oldValue){
            
        }else{
            
        }
    }
    /**
     * Este metodo maneja el cambio de contraseña
    */
    private void handlePfPasswordTextChange(ObservableValue observable,
            String oldValue, String newValue){
    if (newValue.length() > 8) {
        pfPassword.setText(oldValue);
        showErrorAlert("La contraseña supera el número máximo de caracteres");
    }
}
    /**
     * Este metodo maneja la accion del Boton Exit
     * @param event 
     */
    private void handleBtExitOnAction(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, 
                "¿Deseas salir de la aplicación?", 
                ButtonType.YES, ButtonType.NO);
        alert.setTitle("Confirmar salida");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) btExit.getScene().getWindow();
            stage.close();
        }
    }
    /**
     * Este metodo maneja la accion del Boton Sign In
     * @param event 
     */
    private void handleBtSignInOnAction(ActionEvent event){
        
      /* try{
        //Crear Objeto customer
        Customer customer= new Customer();
        customer.setLastName("tfUsername");
        CustomerRESTClient Client=new CustomerRESTClient();
                .create_XML(customer);
        //Indicar al usuario que se ha registrado correctamente
        Alert alert= new Alert(Alert.AlertType)
        //Abrir ventana sign in
                }catch {
                    //Internal Server ERROR
                    //Not AuthorizedException
                }
    }*/
    }
    protected void showErrorAlert(String errorMsg){
        //Shows error dialog.
        Alert alert=new Alert(Alert.AlertType.ERROR,
                              errorMsg,
                              ButtonType.OK);
        alert.showAndWait();
        
    }
}
