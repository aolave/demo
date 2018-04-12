package aplicacion.serenity.demohome.steps;

import aplicacion.serenity.demohome.pages.DemoHomePages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoHomeSteps extends ScenarioSteps {

    DemoHomePages mainPageDemoPages=new DemoHomePages(getDriver());

    public DemoHomeSteps(Pages pages){
        super(pages);
    }

    @Step
    public void enterPage(){
        mainPageDemoPages.open();
    }

    @Step
    public void clickIframe(){
        mainPageDemoPages.setaWindowOpenTest();
    }

    @Step
    public void switchToPage(){
        mainPageDemoPages.switchToPage();
    }


}


