package aplicacion.serenity.menu.steps;
import aplicacion.serenity.menu.pages.MainMenuPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MainMenuSteps extends ScenarioSteps {
    MainMenuPages mainMenuPages=new MainMenuPages(getDriver());
    public MainMenuSteps(Pages pages){
        super(pages);
    }

    @Step
    public void menuSolicitud(){
        mainMenuPages.setliSolicitud();
    }

    @Step
    public void menuConsulta(){
        mainMenuPages.setliConsulta();
    }
}


