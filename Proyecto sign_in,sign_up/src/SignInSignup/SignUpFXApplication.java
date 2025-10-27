/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInSignup;

import SignInSignup.ui.GestionUsuarioController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jimmy
 */
public class SignUpFXApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/proyectosignUpNewCustomer.fxml"));
        Parent root = (Parent) loader.load();

        GestionUsuarioController controller = loader.getController();
        controller.init(root, stage);

        // Parent root = FXMLLoader.load(getClass().getResource("ui/SignUpNewCoustomer.fxml"));
        
        // • Establecer el título de la ventanacomo “New Customer”. 
        // • La ventana no debe ser redimensionable. 
        //• Inicializar todos los campos de texto vacíos. 
        // • Establecer el foco en el campo First Name. 
        //• Deshabilitar el botón Sign Up hasta que todos los campos requeridos estén completados. 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
