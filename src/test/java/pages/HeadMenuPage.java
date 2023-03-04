package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeadMenuPage {

    private final SelenideElement mainMenuElement = $("#nasa-main-menu").$("li");
    private final SelenideElement mainMenu2RowElement = $(".dropdown-menu", 0).$("li");

    public HeadMenuPage checkLogoVisible() {
        $(".logo").shouldBe(Condition.visible);
        return this;
    }

    public HeadMenuPage checkLogoFileName(String value) {
        String logoFileName = $("img").getAttribute("src");
        assertThat(logoFileName.equals(value));
        return this;
    }

    public HeadMenuPage check1RowOfHeadMenuVisible() {
        $("#nasa-main-menu").shouldBe(Condition.visible);
        return this;
    }

    public HeadMenuPage check1RowOfHeadMenuContent(String[] value) {

        for (int i = 0; i < value.length; i++) {
            mainMenuElement.sibling(i).shouldHave(text(value[i]));

        }
        /*mainMenuElement.sibling(0).shouldHave(text(value[0]));
        mainMenuElement.sibling(1).shouldHave(text(value[1]));
        mainMenuElement.sibling(2).shouldHave(text(value[2]));
        mainMenuElement.sibling(3).shouldHave(text(value[3]));
        mainMenuElement.sibling(4).shouldHave(text(value[4]));
        mainMenuElement.sibling(5).shouldHave(text(value[5]));
        mainMenuElement.sibling(6).shouldHave(text(value[6]));*/

        return this;

    }

    public HeadMenuPage check2RowOfHeadMenuVisible() {
        $("#nasa-main-menu").$(".dropdown-menu").shouldBe(Condition.visible);
        return this;
    }

    public HeadMenuPage check2RowOfHeadMenuContent(String[] value) {
        mainMenu2RowElement.shouldHave(text(value[0]));
        for (int i = 1; i < value.length; i++) {
            mainMenu2RowElement.sibling(i - 1).shouldHave(text(value[i]));

        }
        /*$(".dropdown-menu", 0).$("li").shouldHave(text("Humans in Space"));
        $(".dropdown-menu", 0).$("li").sibling(0).shouldHave(text("Moon to Mars"));
        $(".dropdown-menu", 0).$("li").sibling(1).shouldHave(text("Earth"));
        $(".dropdown-menu", 0).$("li").sibling(2).shouldHave(text("Space Tech"));
        $(".dropdown-menu", 0).$("li").sibling(3).shouldHave(text("Flight"));
        $(".dropdown-menu", 0).$("li").sibling(4).shouldHave(text("Solar System and Beyond"));
        $(".dropdown-menu", 0).$("li").sibling(5).shouldHave(text("STEM Engagement"));
        $(".dropdown-menu", 0).$("li").sibling(6).shouldHave(text("History "));
        $(".dropdown-menu", 0).$("li").sibling(7).shouldHave(text("Benefits to You"));*/

        return this;

    }
}
