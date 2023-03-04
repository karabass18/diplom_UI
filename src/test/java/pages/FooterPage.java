package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class FooterPage {

    private final SelenideElement footerElement =  $("#footer-links").$("li");
    public FooterPage checkFooterVisible() {
        step("Проверяем футер на видимость ", () ->{
            $("#footer-links").shouldBe(Condition.visible);
        });
        return this;
    }

    public FooterPage checkFooterContent(String[] value) {
        step("Проверяем содержание футера", () -> {
            footerElement.shouldHave(text(value[0]));
            for (int i = 1; i < value.length; i++) {
                footerElement.sibling(i - 1).shouldHave(text(value[i]));
            }
        });
        return this;
    }
}
