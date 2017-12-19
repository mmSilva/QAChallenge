package Steps;
import com.codeborne.selenide.Configuration;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.sql.Driver;

import static com.codeborne.selenide.Selenide.*;


public class LoginStep {
    public LoginStep(Driver driver) {
        //WebDriver driver = new WebDriver();
    }
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        Configuration.browser = "chrome";
        open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @And("^I enter the email as \"([^\"]*)\" and the password as \"([^\"]*)\"$")
    public void iEnterTheEmailAsAndThePasswordAs(String email, String password) throws Throwable {


       //().findElement(By.id("email")).clear();
        //getDriver().findElement(By.id("nome")).sendKeys(email);
        //getDriver().findElement(By.id("passwd")).clear();
       // getDriver().findElement(By.id("passwd")).sendKeys(password);
        //getDriver().findElement(By.cssSelector("#SubmitLogin > span")).click();

    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the My Account page$")
    public void iShouldSeeTheMyAccountPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
