package uiTestsOfNasaGov;

import config.ContentConfig;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FooterPage;

public class FooterTests extends TestsBase {

   // ClassLoader cLoader = FooterTests.class.getClassLoader();
    FooterPage footerPage = new FooterPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка Футера")
    @Test
    public void shouldContainТextFromCsvFile() {

        /*try (InputStream stream = cLoader.getResourceAsStream("footerContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();*/
      //  ContentConfig contentConfig = ConfigFactory.create(ContentConfig.class, System.getProperties());

        footerPage
                .checkFooterVisible()
                .checkFooterContent(contentConfig.getFooterContent());


    }
  /*  @Test
    public void test1() {
        ResourcesConfig config = ConfigFactory.create(ResourcesConfig.class, System.getProperties());
        String[] arrCont = config.getArray();
        System.out.println(arrCont[1]);
    }*/
}