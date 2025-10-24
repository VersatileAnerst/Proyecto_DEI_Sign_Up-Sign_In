/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin.ui;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author daniel
 */
public class ResultadoController {
    @FXML
    private Image imWelcome;
    
    public void init(Stage stage,Parent root){
        try{
            //Escena 
            Scene scene =new Scene(root);   
            stage.setScene(scene);
            //
            stage.setTitle("BankApp");
            //Esta ventana no es redimensionable
            stage.setResizable(false);
            
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
