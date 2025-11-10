/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin;
import applicationdeisignupsignin.ui.Sign_UpController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jimmy
 */
public class ApplicationDEISignUpSignIn extends Application {

   // private Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
         /* FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/proyectosignUpNewCustomer.fxml"));
          Parent root = loader.load();
          GestionUsuarioController c = loader.getController();
            c.init();  */

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/proyectosignUpNewCustomer.fxml"));
        Parent root = (Parent) loader.load();

        Sign_UpController controller = loader.getController();
        controller.init( stage,root);

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

