package aplicacion.serenity.pqrssolicitud.definitions;

import aplicacion.serenity.pqrssolicitud.steps.PqrsSolicitudSteps;
import aplicacion.serenity.menu.steps.MainMenuSteps;
import org.jbehave.core.model.ExamplesTable;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class PqrsDefinitions {

    @Steps
    MainMenuSteps mainMenuSteps;

    @Steps
    PqrsSolicitudSteps pqrsSolicitudSteps;

     @When("crear la solicitud PQRS:$data")
    public void solicitud(ExamplesTable data){
        mainMenuSteps.menuSolicitud();
        pqrsSolicitudSteps.createSolictudPqrs(data);
        pqrsSolicitudSteps.enviarSolicitud();
    }
    @Then("revisar solitud PQRS fue creada")
    public void  revisar(){
    }
}
