package aplicacion.serenity.pqrsconsulta.steps;

import aplicacion.serenity.pqrsconsulta.pages.PqrsConsultaPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class PqrsConsultaSteps extends ScenarioSteps {

    PqrsConsultaPages pqrsConsultaPages=new PqrsConsultaPages(getDriver());

    public PqrsConsultaSteps(Pages pages){
        super(pages);
    }

    @Step
    public void filtrosSolicitud(ExamplesTable data){
        pqrsConsultaPages.setInputGeneral(data);
        pqrsConsultaPages.setSelectNombre(data);
        pqrsConsultaPages.setInputDetalle(data);
    }

    @Step
    public void consultarSolicitud(){
        pqrsConsultaPages.setButtonConsultarSolicitud();
        pqrsConsultaPages.setTableViewDown();
    }

}


