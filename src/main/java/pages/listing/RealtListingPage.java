package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

  public  RealtListingPage(WebDriver driver) {
    super(driver);
  }

  private final By card = By.xpath("//div[contains(@class, 'listing-item')]");

  public RealtListingPage checkCountCards() {
    int countCard = driver.findElements(card).size();
    Assert.assertEquals(countCard, 24);
    return this;
  }
}
