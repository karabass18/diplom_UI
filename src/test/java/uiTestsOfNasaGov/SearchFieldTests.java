package uiTestsOfNasaGov;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.SearchFieldPage;

public class SearchFieldTests extends TestsBase {

    SearchFieldPage searchFieldPage = new SearchFieldPage();

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка поля Поиск")
    @Test
    public void shouldCntainPlaceholder() {

        searchFieldPage
                .checkSearchFieldVisible()
                .checkPlaceholderContent();
    }

    @CsvSource({
            "hubble,www.nasa.gov/mission_pages/hubble/main/index.html",
            "Apollo,www.nasa.gov/mission_pages/apollo/index.html",
            "Moon,The latest news and links to information about Earth's moon"
    })
    @Severity(SeverityLevel.CRITICAL)
    @ParameterizedTest(name = "Проверка наличия текста \"{1}\"" +
            "в рекомендуемой статье выдачи по запросу \"{0}\"")

    public void shouldContainAnArticleInTheSearchResult(String searchQuery, String expectedText) {

        searchFieldPage
                .checkInputInSearchField(searchQuery)
                .checkSearchResult(expectedText);
    }
}
