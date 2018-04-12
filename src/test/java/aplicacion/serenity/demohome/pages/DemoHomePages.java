package aplicacion.serenity.demohome.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://sahitest.com/demo/")
public class DemoHomePages extends PageObject {

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/a[8]")
    WebElementFacade aWindowOpenTest;

    @FindBy(xpath = "/html/frameset/frame[2]")
    WebElementFacade iframeLevelOne;


    public WebDriver driver;
    public DemoHomePages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    private void waitEvent(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setaWindowOpenTest(){
        aWindowOpenTest.click();
        waitEvent(3);
    }

    public void switchToPage(){
        this.getDriver().switchTo().window((String) this.getDriver().getWindowHandles().toArray()[1]);
        driver.switchTo().frame(iframeLevelOne);
    }
}
