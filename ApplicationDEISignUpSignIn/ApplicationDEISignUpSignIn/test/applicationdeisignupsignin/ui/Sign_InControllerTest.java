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
import org.testfx.matcher.base.NodeMatchers;
import static org.testfx.matcher.base.NodeMatchers.isDisabled;
import static org.testfx.matcher.base.NodeMatchers.isEnabled;
import static org.testfx.matcher.base.NodeMatchers.isFocused;
import static org.testfx.matcher.base.NodeMatchers.isVisible;

/**
 *
 * @author daniel
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Sign_InControllerTest extends ApplicationTest{
    @Override
    public void start(Stage stage) throws Exception{
        new ApplicationDEISignUpSignIn().start(stage);
    }
    

    @Test
    public void test1_Focused() {
        //Comprueba el campo Email esta enfocado
       verifyThat("#tfEmail", isFocused());
    }
    @Test
    public void test2_SignInIsDisabled() {
        //Simula escribir en los campos username y password 
        //y comprueba que el boton esta deshabilitado
        clickOn("#tfEmail");
        write("username");
        verifyThat("#btSignIn", isDisabled());
        eraseText(8);
        clickOn("#pfPassword");
        write("password");
        verifyThat("#btSignIn", isDisabled());
        eraseText(8);
        verifyThat("#btSignIn", isDisabled());
    }
    @Test
    public void test3_SignInIsEnabled() {
        //Comprueba que el boton esta habilitado
        clickOn("#tfEmail");
        write("username");
        clickOn("#pfPassword");
        write("password");
        verifyThat("#btSignIn", isEnabled());
    }
    @Test
    public void test4_hySignUpOpened(){
        //Simula entrar en un enlace para comprobar que entra en otra ventana
        clickOn("#hySignUp");
        verifyThat("#btSignUp", isVisible());
    }
    @Test
    public void test5_UsersViewOpenedOnAceptarClick() {
        //Simula escribir datos correctos y compruba que entra a otra ventana
        clickOn("#tfEmail");
        write("awallace@gmail.com");
        clickOn("#pfPassword");
        write("qwerty*9876");
        clickOn("#btSignIn");
        verifyThat("#imWelcome", isVisible());
    }
    @Test
    public void test6_NotAuthorizedException() {
        // Simula escribir datos y pulsar el botón
        clickOn("#tfEmail");
        write("username@gmail.com");
        clickOn("#pfPassword");
        write("wrongpassword");
        clickOn("#btSignIn");
        verifyThat("Incorrect Email or Password", isVisible());
    }
}
