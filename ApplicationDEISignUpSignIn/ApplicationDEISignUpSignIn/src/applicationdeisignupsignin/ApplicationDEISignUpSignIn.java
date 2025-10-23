/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin;

import applicationdeisignupsignin.ui.GestionUsuarioController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author daniel
 */
public class ApplicationDEISignUpSignIn extends Application {
    private Stage Stage;

@Override
public void start(Stage stage) throws Exception {

FXMLLoader loader= new FXMLLoader(getClass().getResource("ui/DisenoSignIn.fxml"));
Parent root = (Parent)loader.load();

    GestionUsuarioController controller =loader.getController();
    controller.init(Stage, root);
    
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
