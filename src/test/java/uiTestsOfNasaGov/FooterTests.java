package uiTestsOfNasaGov;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FooterPage;
import pages.HeadMenuPage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FooterTests extends TestsBase{

    ClassLoader cLoader = FooterTests.class.getClassLoader();
    FooterPage footerPage = new FooterPage();

    @DisplayName("Проверка Футера")
    @Test
    public void footerContentTest() throws Exception {

        try (InputStream stream = cLoader.getResourceAsStream("footerContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();

            footerPage
                    .checkFooterVisible()
                    .checkFooterContent(content.get(0));


            /*$("#footer-links").$("li").shouldHave(text("No Fear Act"));
            $("#footer-links").$("li").sibling(0).shouldHave(text("FOIA"));
            $("#footer-links").$("li").sibling(1).shouldHave(text("Privacy"));
            $("#footer-links").$("li").sibling(2).shouldHave(text("Accessibility"));
            $("#footer-links").$("li").sibling(3).shouldHave(text("Office of Inspector General"));
            $("#footer-links").$("li").sibling(4).shouldHave(text("Office of Special Counsel"));
            $("#footer-links").$("li").sibling(5).shouldHave(text("Agency Financial Reports"));
            $("#footer-links").$("li").sibling(6).shouldHave(text("Contact NASA"));*/
        }
    }
}
