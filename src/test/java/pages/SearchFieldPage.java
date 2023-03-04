package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchFieldPage {

    public SearchFieldPage checkSearchFieldVisible() {
        $("[name=query]").shouldBe(Condition.visible);
        return this;
    }

    public SearchFieldPage checkPlaceholderContent() {
        assertThat($("[name=query]").getAttribute("placeholder").equals("Search"));
        return this;
    }

    public SearchFieldPage checkInputInSearchField() {
        $("[name=query]").setValue("hubble").pressEnter();
        //String urlOfSearch = WebDriverRunner.url();
        assertThat(WebDriverRunner.url().contains("https://nasasearch.nasa.gov/"));
        return this;
    }

    public SearchFieldPage checkSearchResult() {
        $("#best-bets").shouldHave(text("Recommended by NASA"));
        $("#best-bets").shouldHave(text("Hubble Space Telescope\n" +
                "https://www.nasa.gov/mission_pages/hubble/main/index.html"));
        return this;
    }
}
