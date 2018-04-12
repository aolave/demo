package aplicacion.serenity.pqrsconsulta.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PqrsConsultaPages extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/div/label[1]/input")
    WebElementFacade inputGeneral;

    @FindBy(xpath = "/html/body/div[3]/div/label[2]/input")
    WebElementFacade inputNombre;

    @FindBy(xpath = "/html/body/div[3]/div/label[3]/input")
    WebElementFacade  inputDetalle;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/button")
    WebElementFacade  buttonConsultarSolicitud;


    WebElementFacade buttonEnviarSolicitud;

    public WebDriver driver;

    public PqrsConsultaPages(WebDriver driver){
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

    public void setInputGeneral(ExamplesTable data){
        inputGeneral.type(data.getRow(0).get("general"));
        waitEvent(1);
    }

    public void setSelectNombre(ExamplesTable data){
        inputNombre.type(data.getRow(0).get("nombre"));
        waitEvent(1);
    }

    public void setInputDetalle(ExamplesTable data){
        inputDetalle.type(data.getRow(0).get("detalle"));
        waitEvent(1);
    }

    public void setButtonConsultarSolicitud(){
        buttonConsultarSolicitud.click();
        waitEvent(5);
    }

    public void setTableViewDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        waitEvent(3);
    }
}

