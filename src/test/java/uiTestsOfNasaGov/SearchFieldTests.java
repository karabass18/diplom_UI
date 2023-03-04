package uiTestsOfNasaGov;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import pages.SearchFieldPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchFieldTests extends TestsBase{

    SearchFieldPage searchFieldPage = new SearchFieldPage();

    @Test
    public void searchFieldTest() {

        searchFieldPage
                .checkSearchFieldVisible()
                .checkPlaceholderContent();
        /*$("[name=query]").shouldBe(visible);
        assertThat($("[name=query]").getAttribute("placeholder").equals("Search"));*/
    }

    @Test
    public void searchFieldFunctionTest() {

        searchFieldPage
                .checkInputInSearchField()
                .checkSearchResult();
       /* $("[name=query]").setValue("hubble").pressEnter();
        String urlOfSearch = WebDriverRunner.url();
        assertThat(urlOfSearch.contains("https://nasasearch.nasa.gov/"));
        $("#best-bets").shouldHave(text("Recommended by NASA"));
        $("#best-bets").shouldHave(text("Hubble Space Telescope\n" +
                "https://www.nasa.gov/mission_pages/hubble/main/index.html"));*/

    }
}
