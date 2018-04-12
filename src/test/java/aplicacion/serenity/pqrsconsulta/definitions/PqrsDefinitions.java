package aplicacion.serenity.pqrsconsulta.definitions;

import aplicacion.serenity.menu.steps.MainMenuSteps;
import aplicacion.serenity.pqrsconsulta.steps.PqrsConsultaSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class PqrsDefinitions {

    @Steps
    MainMenuSteps mainMenuSteps;

    @Steps
    PqrsConsultaSteps pqrsConsultaSteps;

    @When("consultar la solicitud PQRS:$data")
    public void consultar(ExamplesTable data){
        mainMenuSteps.menuConsulta();
        pqrsConsultaSteps.filtrosSolicitud(data);
    }
    @Then("verificar la consultar PQRS")
    public void  verificar(){
        pqrsConsultaSteps.consultarSolicitud();
    }
}
