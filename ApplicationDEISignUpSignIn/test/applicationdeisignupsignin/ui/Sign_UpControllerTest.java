package applicationdeisignupsignin.ui;

import applicationdeisignupsignin.ApplicationDEISignUpSignIn;
import javafx.stage.Stage;
import org.testfx.framework.junit.ApplicationTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.api.FxRobot;
import static org.testfx.matcher.base.NodeMatchers.isDisabled;
import static org.testfx.matcher.base.NodeMatchers.isFocused;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/**
 *
 * @author jimmy
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Sign_UpControllerTest extends ApplicationTest {
    
    
@Override
public void start(Stage stage) throws Exception{
    new ApplicationDEISignUpSignIn().start(stage);
 }

    @Test
     public void test1_Focused() {
    verifyThat("#tfFirstName",isFocused()) ;
        
    }
   @Test
    public void test2_Disabled() {
        clickOn("#tfEmail");
        write("use@nam.");
        verifyThat("#btSignUp", isDisabled());
        eraseText(8);
        clickOn("#pfPassword");
        write("password");
        verifyThat("#btSignUp", isDisabled());
        eraseText(8);
        verifyThat("#btSignUp", isDisabled());
    }
    @Test
    public void test3_SignUpErrorFrobidden(){
        clickOn("#tfFirstName");
        write("Jimmy");
        clickOn("#tfLastName");
        write("Trasmonte");
        clickOn("#tfMiddlelnitial");
        write("J");
        clickOn("#tfPhone");
        write("640525968");
        clickOn("#tfEmail");
        write("jimmytrasmonte23@gmail.com");
        clickOn("#pfPassword");
        write("contraseña");
        clickOn("#pfConfirmPassword");
        write("contraseña");
        clickOn("#tfCity");
        write("Madrid");
        clickOn("#tfState");
        write("Madrid");
        clickOn("#tfStreet");
        write("Calle, 21");
        clickOn("#tfZip");
        write("28600");
        clickOn("#btSignUp");
        verifyThat("Error Email Registered", isVisible());
        clickOn("Aceptar");
    }
    @Test
    public void test4_hySignInOpened(){
    //Simula entrar en un enlace para comprobar que entra en otra ventana
    clickOn("#hySignIn");
    verifyThat("#btSignIn", isVisible());
    }
    @Test
    public void test5_btBackOpened(){
    //Simula pulsar el boton back para comprobar que entra en otra ventana
    clickOn("#btBack");
    verifyThat("#btSignIn", isVisible());
    }
    @Test
    public void test6_SignInOpenClick() {
    //Simula escribir datos correctos y comprueba que entra a otra ventana
        clickOn("#tfFirstName");
        write("Jimmy");
        clickOn("#tfLastName");
        write("Trasmonte");
        clickOn("#tfMiddlelnitial");
        write("J");
        clickOn("#tfPhone");
        write("640525968");
        clickOn("#tfEmail");
        write("CorreoPrueba6@gmail.com");//cambiar numero de correo para pruebas 
        clickOn("#pfPassword");
        write("contraseña");
        clickOn("#pfConfirmPassword");
        write("contraseña");
        clickOn("#tfCity");
        write("Madrid");
        clickOn("#tfState");
        write("Madrid");
        clickOn("#tfStreet");
        write("Calle, 21");
        clickOn("#tfZip");
        write("28600");
        clickOn("#btSignUp");
        clickOn("Aceptar");
        verifyThat("#btSignIn", isVisible());
    }
}
