package uiTestsOfNasaGov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MoreStoriesButtonPage;

public class MoreStoriesButtonTests extends TestsBase {

    MoreStoriesButtonPage moreStoriesButtonPage = new MoreStoriesButtonPage();

    @DisplayName("Проверка кнопки MORE STORIES")
    @Test
    public void moreStoriesButtonTest() {

        moreStoriesButtonPage
                .checkMoreStoriesButtonVisible()
                .checkMoreStoriesButtonContent()
                .checkMoreStoriesButtonFunction();

    }
}
