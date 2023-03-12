package uiTestsOfNasaGov;

import com.opencsv.CSVReader;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FooterPage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FooterTests extends TestsBase {

    ClassLoader cLoader = FooterTests.class.getClassLoader();
    FooterPage footerPage = new FooterPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка Футера")
    @Test
    public void shouldContainТextFromCsvFile() throws Exception {

        try (InputStream stream = cLoader.getResourceAsStream("footerContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();

            footerPage
                    .checkFooterVisible()
                    .checkFooterContent(content.get(0));

        }
    }
}
