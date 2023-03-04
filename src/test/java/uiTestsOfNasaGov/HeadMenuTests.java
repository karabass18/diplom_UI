package uiTestsOfNasaGov;

import com.opencsv.CSVReader;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HeadMenuPage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class HeadMenuTests extends TestsBase {

    ClassLoader cLoader = HeadMenuTests.class.getClassLoader();
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
    public void headMenu1RowTest() throws Exception {

        try (InputStream stream = cLoader.getResourceAsStream("headMenuContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();
            headMenuPage
                    .check1RowOfHeadMenuVisible()
                    .check1RowOfHeadMenuContent(content.get(0));
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка 2-й строки верхнего меню")
    @Test
    public void HeadMenu2RowTest() throws Exception {

        try (InputStream stream = cLoader.getResourceAsStream("headMenuContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();
            headMenuPage
                    .check2RowOfHeadMenuVisible()
                    .check2RowOfHeadMenuContent(content.get(1));
        }


    }
}
