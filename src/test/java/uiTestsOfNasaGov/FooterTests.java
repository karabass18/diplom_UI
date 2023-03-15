package uiTestsOfNasaGov;

import com.opencsv.CSVReader;
import config.ResourcesConfig;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import pages.FooterPage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.List;

public class FooterTests extends TestsBase {

    ClassLoader cLoader = FooterTests.class.getClassLoader();
    FooterPage footerPage = new FooterPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка Футера")
    @Test
    public void shouldContainТextFromCsvFile()  {

        /*try (InputStream stream = cLoader.getResourceAsStream("footerContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();*/
        ResourcesConfig config = ConfigFactory.create(ResourcesConfig.class, System.getProperties());

            footerPage
                    .checkFooterVisible()
                    .checkFooterContent(config.getArray());


    }
  /*  @Test
    public void test1() {
        ResourcesConfig config = ConfigFactory.create(ResourcesConfig.class, System.getProperties());
        String[] arrCont = config.getArray();
        System.out.println(arrCont[1]);
    }*/
}