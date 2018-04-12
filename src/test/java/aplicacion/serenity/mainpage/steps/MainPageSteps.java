package aplicacion.serenity.mainpage.steps;

import aplicacion.serenity.mainpage.pages.MainPagePages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MainPageSteps extends ScenarioSteps {

    MainPagePages mainPagePages=new MainPagePages(getDriver());

    public MainPageSteps(Pages pages){
        super(pages);
    }

    @Step
    public void enterPage(){
        mainPagePages.open();
    }

}


