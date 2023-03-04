package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FooterPage {

    private final SelenideElement footerElement =  $("#footer-links").$("li");
    public FooterPage checkFooterVisible() {
        $("#footer-links").shouldBe(Condition.visible);
        return this;
    }

    public FooterPage checkFooterContent(String[] value) {
        footerElement.shouldHave(text(value[0]));
        for (int i = 1; i < value.length; i++) {
            footerElement.sibling(i - 1).shouldHave(text(value[i]));

        }
        return this;
    }
}
