package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SocialMediaButtonPage {

    public SocialMediaButtonPage checkSocialMediaButtonVisible() {
        $("#follow").shouldBe(visible);
        return this;
    }

    public SocialMediaButtonPage checkAppearanceOfDropDownList() {
        $("#at_hover").shouldBe(hidden);
        $("#follow").click();
        $("#at_hover").shouldBe(visible);
        return this;
    }

    public SocialMediaButtonPage checkDropDownListContent() {
        $("#at_hover").shouldHave(text("Facebook"), text("Twitter"), text("Linkedin"));
        return this;
    }

    public SocialMediaButtonPage checkFaceBookLinkInTheDropDownList() {

        $("#follow").click();
        //sleep(500);
        $("#at_hover").$("#atic_facebook").click();

        assertThat(WebDriverRunner.url().contains("facebook.com"));
        //sleep(1000);
        //Selenide.closeWindow();
        //sleep(1000);
        return this;
    }

    public SocialMediaButtonPage checkTwitterLinkInTheDropDownList() {

        //Selenide.refresh();
        $("#follow").click();
        //sleep(500);
        $("#at_hover").$("#atic_twitter").click();
        assertThat(WebDriverRunner.url().contains("twitter.com"));
        //Selenide.closeWindow();
        return this;
    }

    public SocialMediaButtonPage checkLinkedinLinkInTheDropDownList() {

        //Selenide.refresh();
        $("#follow").click();
        //sleep(500);
        $("#at_hover").$("#atic_linkedin").click();
        assertThat(WebDriverRunner.url().contains("linkedin.com"));
        //Selenide.closeWindow();
        return this;
    }

  //  https://www.linkedin.com/
}
