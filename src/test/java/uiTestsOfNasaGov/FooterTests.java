package uiTestsOfNasaGov;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FooterPage;

public class FooterTests extends TestsBase {

    FooterPage footerPage = new FooterPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка Футера")
    @Test
    public void shouldContainТextFromPropertiesFile() {

        footerPage
                .checkFooterVisible()
                .checkFooterContent(contentConfig.getFooterContent());
    }
}