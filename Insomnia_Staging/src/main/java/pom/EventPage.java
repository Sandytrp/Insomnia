package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefination.AbstractWebDriver;

public class EventPage extends AbstractWebDriver {
	@FindBy(id = "contact_name")
	WebElement contactName;
	@FindBy(id = "contact_email")
	WebElement contactEmail;
	@FindBy(name = "company_name")
	WebElement companyName;
	@FindBy(name = "location")
	WebElement location;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(id = "event_date")
	WebElement eventDate;
	@FindBy(id = "event_time")
	WebElement eventTime;
	@FindBy(id = "event_type")
	WebElement eventType;
	@FindBy(id = "event_products")
	WebElement eventProducts;

	public EventPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterfields() throws InterruptedException {
		contactName.sendKeys("Sandeep");
		Thread.sleep(1000);
		contactEmail.sendKeys("STiwari@Judge.com");
		Thread.sleep(1000);
		companyName.sendKeys("Judge India");
		Thread.sleep(1000);
		location.sendKeys("Noida");
		Thread.sleep(1000);
		phone.sendKeys("7982421791");
		Thread.sleep(1000);
		eventDate.sendKeys("06/08/1993");
		Thread.sleep(1000);
		eventTime.sendKeys("");
		Thread.sleep(1000);
		eventType.sendKeys("Yearly Party");
		Thread.sleep(1000);
		eventProducts.sendKeys("Mix Cookies");
	}

}
