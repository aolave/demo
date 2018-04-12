package aplicacion.serenity.mainpage.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
@DefaultUrl("http://redcreativa.com.co/cristianbustamante/#/")
public class MainPagePages extends PageObject {
    public WebDriver driver;
    public MainPagePages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
