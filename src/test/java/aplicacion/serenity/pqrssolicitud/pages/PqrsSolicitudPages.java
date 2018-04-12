package aplicacion.serenity.pqrssolicitud.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://redcreativa.com.co/cristianbustamante/#/")
public class PqrsSolicitudPages extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[1]/div/input")
    WebElementFacade inputNombre;

    @FindBy(xpath = "//html/body/div[3]/div/div/div/div/div[2]/form/div/div[2]/div/input")
    WebElementFacade inputtApellido;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[3]/div/select")
    WebElementFacade selectTipo;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[4]/div/select")
    WebElementFacade selectLugar;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[5]/div/select")
    WebElementFacade selectPrioridad;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[6]/div/input")
    WebElementFacade inputCorreo;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[7]/div/textarea")
    WebElementFacade textDetalle;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[2]/form/div/div[8]/button")
    WebElementFacade buttonEnviarSolicitud;

    public WebDriver driver;

    public PqrsSolicitudPages(WebDriver driver){
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

    public void setInputNombre(ExamplesTable data){
        inputNombre.type(data.getRow(0).get("nombre"));
        waitEvent(1);
    }

    public void setInputtApellido(ExamplesTable data){
        inputtApellido.type(data.getRow(0).get("apellido"));
        waitEvent(1);
    }

    public void setSelectTipo(ExamplesTable data){
        selectTipo.selectByVisibleText(data.getRow(0).get("tipo"));
        waitEvent(1);
    }

    public void setSelectLugar(ExamplesTable data){
        selectLugar.selectByVisibleText(data.getRow(0).get("lugar"));
        waitEvent(1);
    }

    public void setSelectPrioridad(ExamplesTable data){
        selectPrioridad.selectByVisibleText(data.getRow(0).get("prioridad"));
        waitEvent(1);
    }

    public void setInputCorreo(ExamplesTable data){
        inputCorreo.type(data.getRow(0).get("correo"));
        waitEvent(1);
    }

    public void setTextDetalle(ExamplesTable data){
        textDetalle.type(data.getRow(0).get("detalle"));
        waitEvent(1);
    }

    public void setButtonEnviarSolicitud(){
        buttonEnviarSolicitud.click();
        waitEvent(4);
    }

}
