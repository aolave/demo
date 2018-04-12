package aplicacion.serenity.menu.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainMenuPages extends PageObject {
    @FindBy(xpath = "/html/body/div[2]/header/nav/ul/li[3]/a")
    WebElementFacade liSolicitud;
    @FindBy(xpath = "/html/body/div[2]/header/nav/ul/li[4]/a")
    WebElementFacade liConsulta;

    public WebDriver driver;

    public MainMenuPages(WebDriver driver){
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

    public void setliSolicitud(){
        liSolicitud.click();
        waitEvent(2);
    }
    public void setliConsulta(){
        liConsulta.click();
        waitEvent(2);
    }
}
