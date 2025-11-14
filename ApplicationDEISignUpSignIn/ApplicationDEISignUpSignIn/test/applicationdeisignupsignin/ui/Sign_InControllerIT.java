/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationdeisignupsignin.ui;

import applicationdeisignupsignin.ApplicationDEISignUpSignIn;
import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.isVisible;

/**
 *
 * @author daniel
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Sign_InControllerIT extends ApplicationTest{
    @Override
    public void start(Stage stage) throws Exception{
        new ApplicationDEISignUpSignIn().start(stage);
    }
    
    @Test
    public void test7_InternalServerErrorException() {
        // Simula escribir datos y verifica la excepcion Internal Server Error
        clickOn("#tfEmail");
        write("username@gmail.com");
        clickOn("#pfPassword");
        write("wrongpassword");
        clickOn("#btSignIn");
        verifyThat("Internal server error", isVisible());
    }
}
