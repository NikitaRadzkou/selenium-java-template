package test.searchapartment;

import org.testng.annotations.Test;
import test.base.BaseTest;

import static constans.Constans.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

  @Test
  public void checkIsRedirectToListing() {
    basePage.open(REALT_HOME_PAGE);

    realtHomePage.enterCountRooms().clickFindBtn();

    realtListingPage.checkCountCards();
  }
}
