/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin.ui;

import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author daniel
 */
public class ResultController {
    @FXML
    private ImageView imWelcome;
    
    private static final Logger LOGGER = Logger.getLogger("applicationdeisignupsignin.ui");
    
    public void init(Stage stage,Parent root){
        try{
            //Escena 
            Scene scene =new Scene(root);   
            stage.setScene(scene);
            //Establece el titulo
            stage.setTitle("BankApp");
            //Esta ventana no es redimensionable
            stage.setResizable(false);
            stage.show();
            LOGGER.info("Window Result initialized");
        }catch(Exception e){
           String errorMsg="Critical Error"+e.getMessage();
            this.showErrorAlert(errorMsg); 
        }
    }
    
    protected void showErrorAlert(String errorMsg){
        //Muestra dialogo de error
        Alert alert=new Alert(Alert.AlertType.ERROR,
                              errorMsg,
                              ButtonType.OK);
        alert.showAndWait();
        
    }
}
