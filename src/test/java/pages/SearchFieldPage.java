package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchFieldPage {

    public SearchFieldPage checkSearchFieldVisible() {
        step("Проверка видимости", () -> {
            $("[name=query]").shouldBe(Condition.visible);
        });
        return this;
    }

    public SearchFieldPage checkPlaceholderContent() {
        step("Проверка плейсхолдера", () -> {
            assertThat($("[name=query]").getAttribute("placeholder")).isEqualTo("Search");
        });
        return this;
    }

    public SearchFieldPage checkInputInSearchField(String key) {
        step("Проверка перехода на страницу https://nasasearch.nasa.gov", () -> {
            $("[name=query]").setValue(key).pressEnter();
            assertThat(WebDriverRunner.url()).contains("https://nasasearch.nasa.gov/");
        });
        return this;
    }

    public SearchFieldPage checkSearchResult(String value) {
        step("Проверка рекомендуемой статьи в выдаче", () -> {
            $("#best-bets").shouldHave(text("Recommended by NASA"));
            $("#best-bets").shouldHave(text(value));
        });
        return this;
    }
}
