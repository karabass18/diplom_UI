package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoreStoriesButtonPage {

    public MoreStoriesButtonPage checkMoreStoriesButtonVisible(){
        $("#trending").shouldBe((Condition.visible));
        return this;
    }

    public MoreStoriesButtonPage checkMoreStoriesButtonContent(){
        $("#trending").shouldHave(text("MORE STORIES"));
        return this;
    }

    public MoreStoriesButtonPage checkMoreStoriesButtonFunction(){
        int numberBeforeClick = $("#cards").$$(withTagAndText("a", "")).size();
        $("#trending").click();
        int numberAfterClick = $("#cards").$$(withTagAndText("a", "")).size();
        assertThat(numberAfterClick > numberBeforeClick);
        return this;
    }
}
