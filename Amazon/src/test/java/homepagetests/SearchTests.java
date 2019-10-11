package homepagetests;

import homepage.HomePage;
import org.testng.annotations.Test;
import searchResult.ResultPage;

public class SearchTests extends HomePage {
    ResultPage resultPage = new ResultPage();
    @Test
    public void ValidateSearchButtonWorks(){
       clickOnSearchBar();
       typeOnSearchBar("Java Books");
       clickOnSearchButton();
       sleepFor(2);
       resultPage.validateSearchPageDisplayed();


    }
}
