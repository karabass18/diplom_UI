package uiTestsOfNasaGov;

import org.junit.jupiter.api.Test;
import pages.MoreStoriesButtonPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoreStoriesButtonTests extends TestsBase{

    MoreStoriesButtonPage moreStoriesButtonPage = new MoreStoriesButtonPage();

    @Test
    public void moreStoriesButtonTest() {

        moreStoriesButtonPage
                .checkMoreStoriesButtonVisible()
                .checkMoreStoriesButtonContent()
                .checkMoreStoriesButtonFunction();

        /*$("#trending").shouldHave(text("MORE STORIES"));
        int numberBeforeClick = $("#cards").$$(withTagAndText("a", "")).size();
        System.out.println("!!!!!  " + numberBeforeClick);
        $("#trending").click();
        int numberAfterClick = $("#cards").$$(withTagAndText("a", "")).size();
        System.out.println("!!!!!  " + numberAfterClick);
        assertThat(numberAfterClick > numberBeforeClick);*/
    }
}
