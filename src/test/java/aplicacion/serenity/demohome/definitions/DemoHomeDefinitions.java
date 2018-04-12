package aplicacion.serenity.demohome.definitions;
import aplicacion.serenity.demohome.steps.DemoHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DemoHomeDefinitions {

    @Steps
    DemoHomeSteps mainPageSteps;

    @Given("enter as user to the page")
    public void enterPage() {
        mainPageSteps.enterPage();
    }

    @When("enter in iframe")
    public void enterIframe() {
        mainPageSteps.clickIframe();
    }

    @Then("switch to page sahi test")
    public void switchToPage() {
        mainPageSteps.switchToPage();
    }
}
