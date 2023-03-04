package uiTestsOfNasaGov;

import org.junit.jupiter.api.Test;
import pages.SocialMediaButtonPage;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SocialMediaButtonTests extends TestsBase{

    SocialMediaButtonPage socialMediaButtonPage = new SocialMediaButtonPage();

    @Test
    public void socialMediaButtonTest() {

        socialMediaButtonPage
                .checkSocialMediaButtonVisible()
                .checkAppearanceOfDropDownList()
                .checkDropDownListContent();
        /*$("#follow").shouldBe(visible);
        $("#at_hover").shouldBe(hidden);
        $("#follow").click();
        $("#at_hover").shouldBe(visible);
        $("#at_hover").shouldHave(text("Facebook"), text("Twitter"), text("Linkedin"));*/

    }

    @Test
    public void socialMeliaDropDownContentTest() {
        socialMediaButtonPage
                .checkFaceBookLinkInTheDropDownList()
                .checkTwitterLinkInTheDropDownList()
                .checkLinkedinLinkInTheDropDownList();

       /* $("#follow").click();
        //sleep(500);
        $("#at_hover").$("#atic_facebook").click();
        assertThat(WebDriverRunner.url().contains("facebook.com"));
        Selenide.closeWindow();*/

    }
}
