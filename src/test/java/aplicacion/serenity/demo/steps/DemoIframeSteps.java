package aplicacion.serenity.demo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import aplicacion.serenity.demo.pages.DemoIframePages;
import org.jbehave.core.model.ExamplesTable;

public class DemoIframeSteps extends ScenarioSteps {

    DemoIframePages demoIframePages=new DemoIframePages(getDriver());

    public DemoIframeSteps(Pages pages){
        super(pages);
    }

    @Step
    public void enterPage(){
        demoIframePages.open();
    }

    @Step
    public void enterIframe(){
        demoIframePages.setAIframeTest();
        demoIframePages.setAErrorPage();
        demoIframePages.setA404Page();
        demoIframePages.setCheckMessage();
    }
    @Step
    public void checkPage(){
        demoIframePages.setCheckMessage();
    }

    @Step
    public void enterTable(ExamplesTable data){
        demoIframePages.setATabletest();
        demoIframePages.setTableViewEmployment();
        demoIframePages.setTdDataEmployeeId(data);
        demoIframePages.setTdDataFirstName(data);
        demoIframePages.setTdDataEmail(data);
    }

    public void enterVisibleTest(){
        demoIframePages.setAVisibleTest();
        demoIframePages.setInputDisplayNOne();
        demoIframePages.setInputVisibilityHidden();
        demoIframePages.setInputsDisplayNOneAndVisibilityHidden();
    }
}


