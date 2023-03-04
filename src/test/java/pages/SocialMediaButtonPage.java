package pages;

import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SocialMediaButtonPage {

    public SocialMediaButtonPage checkSocialMediaButtonVisible() {
        step("Проверка видимости", () -> {
            $("#follow").shouldBe(visible);
        });
        return this;
    }

    public SocialMediaButtonPage checkAppearanceOfDropDownList() {
        step("Проверка появления списка после нажатия", () -> {
            $("#at_hover").shouldBe(hidden);
            $("#follow").click();
            $("#at_hover").shouldBe(visible);
        });
        return this;
    }

    public SocialMediaButtonPage checkDropDownListContent() {
        step("Проверка содержимого списка", () -> {
            $("#at_hover").shouldHave(text("Facebook"), text("Twitter"), text("Linkedin"));
        });
        return this;
    }

    public SocialMediaButtonPage checkFaceBookLinkInTheDropDownList() {
        step("Прверка адреса открывающегося окна по клику на facebook ", () -> {
            $("#follow").click();
            $("#at_hover").$("#atic_facebook").click();
            assertThat(WebDriverRunner.url().contains("facebook.com"));
        });
        return this;
    }

    public SocialMediaButtonPage checkTwitterLinkInTheDropDownList() {

        step("Прверка адреса открывающегося окна по клику на twitter ", () -> {
            $("#follow").click();
            $("#at_hover").$("#atic_twitter").click();
            assertThat(WebDriverRunner.url().contains("twitter.com"));
        });
        return this;
    }

    public SocialMediaButtonPage checkLinkedinLinkInTheDropDownList() {
        step("Прверка адреса открывающегося окна по клику на linkedin ", () -> {
        $("#follow").click();
        $("#at_hover").$("#atic_linkedin").click();
        assertThat(WebDriverRunner.url().contains("linkedin.com"));
        });
        return this;
    }

}
