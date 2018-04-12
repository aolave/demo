package aplicacion.serenity.demo.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://sahitest.com/demo/")
public class DemoIframePages extends PageObject {

    @FindBy(xpath = "//*[@id=\"another\"]/iframe")
    WebElementFacade iframeLevelTwo;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[6]")
    WebElementFacade aIframeTest;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[4]/a[8]")
    WebElementFacade aErrorPage;

    @FindBy(xpath = "/html/body/a[1]")
    WebElementFacade a404Page;

    @FindBy(xpath = "/html/body/h1")
    WebElementFacade checkMessage;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[3]")
    WebElementFacade aTabletest;

    @FindBy(xpath = "//*[@id=\"t4\"]")
    WebElementFacade tableEmployment;

    @FindBy(xpath = "//*[@id=\"t4\"]/tbody/tr[2]/td[1]")
    WebElementFacade tdDataEmployeeId;

    @FindBy(xpath = "//*[@id=\"t4\"]/tbody/tr[2]/td[2]")
    WebElementFacade tdDataFirstName;

    @FindBy(xpath = "//*[@id=\"t4\"]/tbody/tr[2]/td[4]")
    WebElementFacade tdDataEmail;

    @FindBy(xpath = "/html/frameset/frame[1]")
    WebElementFacade iframeTop;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[2]/a[4]")
    WebElementFacade aVisibleTest;

    @FindBy(xpath = "/html/body/form/input[1]")
    WebElementFacade inputDisplayNOne;

    @FindBy(xpath = "/html/body/form/input[4]")
    WebElementFacade inputVisibilityHidden;

    @FindBy(xpath = "/*[@id=\"ud\"]/")
    WebElementFacade divUsingDisplay;

    @FindBy(xpath = "//*[@id=\"uv\"]")
    WebElementFacade divUsingVisibility;

    public WebDriver driver;

    private void waitEvent(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public DemoIframePages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void setAIframeTest(){
        aIframeTest.click();
        waitEvent(3);
    }

    public void setAErrorPage(){
        driver.switchTo().frame(iframeLevelTwo);
        aErrorPage.click();
        waitEvent(3);
    }

    public void setA404Page(){
        a404Page.click();
        waitEvent(2);
    }

    public void setCheckMessage(){
        waitEvent(1);
        MatcherAssert.assertThat("No se econtro mensaje de Error: Not Found","Not Found".equals(checkMessage.getText()));
    }

    public void setATabletest(){
        aTabletest.click();
        waitEvent(2);
    }

    public void setTableViewEmployment(){
        Actions actions = new Actions(driver);
        actions.moveToElement(tableEmployment);
        actions.perform();
        waitEvent(2);
    }

    public void setTdDataEmployeeId(ExamplesTable data){
        MatcherAssert.assertThat("No Se Encontro: EMPLOYEE_ID",data.getRow(0).get("EMPLOYEE_ID").equals(tdDataEmployeeId.getText()));
        waitEvent(1);
    }

    public void setTdDataFirstName(ExamplesTable data){
        MatcherAssert.assertThat("No Se Encontro: FIRST_NAME",data.getRow(0).get("FIRST_NAME").equals(tdDataFirstName.getText()));
        waitEvent(1);
    }

    public void setTdDataEmail(ExamplesTable data){
        MatcherAssert.assertThat("No Se Encontro: EMAIL",data.getRow(0).get("EMAIL").equals(tdDataEmail.getText()));
        waitEvent(1);
    }

    public void setAVisibleTest(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(iframeTop);
        aVisibleTest.click();
        waitEvent(3);
    }

    public void setInputDisplayNOne(){
        inputDisplayNOne.click();
        waitEvent(1);
        Assert.assertTrue("Error, Elemento no visible: Using Display", !divUsingDisplay.isVisible());
    }

    public void setInputVisibilityHidden(){
        inputVisibilityHidden.click();
        waitEvent(1);
        Assert.assertTrue("Error, Elemento Visible: Using Visibility", !divUsingVisibility.isVisible());
    }

    public void setInputsDisplayNOneAndVisibilityHidden(){
        inputDisplayNOne.click();
        inputVisibilityHidden.click();
        waitEvent(1);
        Assert.assertTrue("Error, Elemento visible: Using Display", !divUsingDisplay.isVisible());
        Assert.assertTrue("Error, Elemento visible: Using Visibility", !divUsingVisibility.isVisible());
    }

}