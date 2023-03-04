package uiTestsOfNasaGov;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MoreStoriesButtonPage;

public class MoreStoriesButtonTests extends TestsBase {

    MoreStoriesButtonPage moreStoriesButtonPage = new MoreStoriesButtonPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка кнопки MORE STORIES")
    @Test
    public void moreStoriesButtonTest() {

        moreStoriesButtonPage
                .checkMoreStoriesButtonVisible()
                .checkMoreStoriesButtonContent()
                .checkMoreStoriesButtonFunction();

    }
}
