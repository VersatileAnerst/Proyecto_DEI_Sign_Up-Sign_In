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
     public void test1_SomeMethod() {
    verifyThat("#tfFirstName",isFocused()) ;
        
    }
   @Test
    public void test2_InitialState() {
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
    public void test3_example(){
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
        
    }
}
