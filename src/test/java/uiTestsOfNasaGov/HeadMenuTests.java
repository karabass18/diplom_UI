package uiTestsOfNasaGov;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HeadMenuPage;


public class HeadMenuTests extends TestsBase {

    HeadMenuPage headMenuPage = new HeadMenuPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка логотипа")
    @Test
    public void logoTest() {

        headMenuPage
                .checkLogoVisible()
                .checkLogoFileName("/sites/all/themes/custom/nasatwo/images/nasa-logo.svg");
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка 1-й строки верхнего меню")
    @Test
    public void shouldContainTextFromPropertiesFileInThe1Row() {

        headMenuPage
                .check1RowOfHeadMenuVisible()
                .check1RowOfHeadMenuContent(contentConfig.getHeadMenu1RowContent());
    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка 2-й строки верхнего меню")
    @Test
    public void shouldContainTextFromPropertiesFileInThe2Row() {

        headMenuPage
                .check2RowOfHeadMenuVisible()
                .check2RowOfHeadMenuContent(contentConfig.getHeadMenu2RowContent());

    }
}
