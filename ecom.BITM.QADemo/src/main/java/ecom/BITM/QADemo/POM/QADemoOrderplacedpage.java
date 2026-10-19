
package ecom.BITM.QADemo.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QADemoOrderplacedpage {

    WebDriver driver;
    WebDriverWait wait;

    public QADemoOrderplacedpage(WebDriver driver) {
        this.driver = driver;

        wait = new WebDriverWait(
                driver, Duration.ofSeconds(15));

        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath = "//h1[text()='Order Confirmed!']")
    private WebElement orderConfirmedMessage;

    @FindBy(xpath = "//button[contains(.,'Logout')] | //a[contains(.,'Logout')] | //*[@aria-label='Logout']")
    private WebElement logoutButton;
    
    @FindBy(xpath = "//span[text()='standard_user']")
    private WebElement profilebutton;
    
    @FindBy(xpath="//h1[text()='My Orders']")
    private WebElement myorders;
    
    @FindBy(xpath="//button[text()='Continue Shopping']")
    private WebElement orderspagecontinueshopping;
    
    public WebElement getOrderspagecontinueshopping() {
		return orderspagecontinueshopping;
	}

	public WebElement getMyorders() {
		return myorders;
	}

	public WebElement getProfilebutton() {
		return profilebutton;
	}

	@FindBy(xpath="//h1[@class='text-3xl font-bold text-slate-900']")
    private WebElement myorderspage;
    
    

	public WebElement getMyorderstext() {
		return myorderspage;
	}
	@FindBy(xpath = "//a[contains(@href,'/orders/')]")
	private WebElement orderDetailsLink;

	public WebElement getOrderDetailsLink() {
	    return orderDetailsLink;
	}

	public WebElement getOrderConfirmedMessage() {
		return orderConfirmedMessage;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}


    
}

