package aplicacion.serenity.pqrssolicitud.steps;
import aplicacion.serenity.pqrssolicitud.pages.PqrsSolicitudPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.model.ExamplesTable;
import net.thucydides.core.steps.ScenarioSteps;

public class PqrsSolicitudSteps extends ScenarioSteps {

    PqrsSolicitudPages pqrsSolicitudPages=new PqrsSolicitudPages(getDriver());

    public PqrsSolicitudSteps(Pages pages){
        super(pages);
    }

    @Step
    public void enterPage(){
        pqrsSolicitudPages.open();
    }

    @Step
    public void createSolictudPqrs(ExamplesTable data){
        pqrsSolicitudPages.setInputNombre(data);
        pqrsSolicitudPages.setInputtApellido(data);
        pqrsSolicitudPages.setSelectTipo(data);
        pqrsSolicitudPages.setSelectLugar(data);
        pqrsSolicitudPages.setSelectPrioridad(data);
        pqrsSolicitudPages.setInputCorreo(data);
        pqrsSolicitudPages.setTextDetalle(data);
    }

    @Step
    public void enviarSolicitud(){
        pqrsSolicitudPages.setButtonEnviarSolicitud();
    }

}


