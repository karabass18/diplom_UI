package uiTestsOfNasaGov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SearchFieldPage;

public class SearchFieldTests extends TestsBase {

    SearchFieldPage searchFieldPage = new SearchFieldPage();

    @DisplayName("Проверка поля Поиск")
    @Test
    public void searchFieldTest() {

        searchFieldPage
                .checkSearchFieldVisible()
                .checkPlaceholderContent();
    }

    @DisplayName("Проверка выдачи поска")
    @Test
    public void searchFieldFunctionTest() {

        searchFieldPage
                .checkInputInSearchField()
                .checkSearchResult();
    }
}
