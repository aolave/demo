package aplicacion.serenity.demo.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import aplicacion.serenity.demo.steps.DemoIframeSteps;
import org.jbehave.core.model.ExamplesTable;

public class DemoDefinitions {

    @Steps
    DemoIframeSteps demoIframeSteps;

    @When("entrar on iframe test")
    public void enterIframes(){
        demoIframeSteps.enterIframe();
    }
    @Then("verficar iframe test")
    public void  verficarIframe(){
        demoIframeSteps.checkPage();
    }

    @When("entrar on table test: $data")
    public void entrarTable(ExamplesTable data){
        demoIframeSteps.enterTable(data);
        demoIframeSteps.enterVisibleTest();
    }
    @Then("verficar table test")
    public void  verficarTable(){
    }

}






