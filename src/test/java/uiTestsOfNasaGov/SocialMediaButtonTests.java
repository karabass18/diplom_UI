package uiTestsOfNasaGov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SocialMediaButtonPage;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SocialMediaButtonTests extends TestsBase{

    SocialMediaButtonPage socialMediaButtonPage = new SocialMediaButtonPage();
    @DisplayName("Проверка кнопки SOCIAL MEDIA")
    @Test
    public void socialMediaButtonTest() {

        socialMediaButtonPage
                .checkSocialMediaButtonVisible()
                .checkAppearanceOfDropDownList()
                .checkDropDownListContent();

    }

    @DisplayName("Проверка сылок в выпадающем списке аккаунтов NASA")
    @Test
    public void socialMeliaDropDownContentTest() {
        socialMediaButtonPage
                .checkFaceBookLinkInTheDropDownList()
                .checkTwitterLinkInTheDropDownList()
                .checkLinkedinLinkInTheDropDownList();

    }
}
