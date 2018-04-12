package aplicacion.serenity.mainpage.definitions;
import aplicacion.serenity.mainpage.steps.MainPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MainPageDefinitions {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("enter page")
    public void enterPage() {
        mainPageSteps.enterPage();
    }

    @When("view page")
    public void viewPage() {
    }

    @Then("check page")
    public void checkPage() {
    }
}