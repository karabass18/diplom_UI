package uiTestsOfNasaGov;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SocialMediaButtonPage;

public class SocialMediaButtonTests extends TestsBase {

    SocialMediaButtonPage socialMediaButtonPage = new SocialMediaButtonPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка кнопки SOCIAL MEDIA")
    @Test
    public void shouldAppearDropDownList() {

        socialMediaButtonPage
                .checkSocialMediaButtonVisible()
                .checkAppearanceOfDropDownList()
                .checkDropDownListContent();

    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка сылок в выпадающем списке аккаунтов NASA")
    @Test
    public void shoulContainValidLinksInDropDownList() {
        socialMediaButtonPage
                .checkFaceBookLinkInTheDropDownList()
                .checkTwitterLinkInTheDropDownList()
                .checkLinkedinLinkInTheDropDownList();

    }
}
