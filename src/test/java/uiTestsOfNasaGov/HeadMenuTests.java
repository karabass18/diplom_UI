package uiTestsOfNasaGov;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.Test;
import pages.HeadMenuPage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeadMenuTests extends TestsBase{

    ClassLoader cLoader = HeadMenuTests.class.getClassLoader();
    HeadMenuPage headMenuPage = new HeadMenuPage();

    @Test
    public void logoTest() {

        headMenuPage
                .checkLogoVisible()
                .checkLogoFileName("/sites/all/themes/custom/nasatwo/images/nasa-logo.svg");
        //$(".logo").shouldBe(Condition.visible);

       // String logoFileName = $("img").getAttribute("src");
       // assertThat(logoFileName.equals("/sites/all/themes/custom/nasatwo/images/nasa-logo.svg"));
    }

    @Test
    public void headMenu1RowTest() throws Exception{

        try (InputStream stream = cLoader.getResourceAsStream("headMenuContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();
            headMenuPage
                    .check1RowOfHeadMenuVisible()
                    .check1RowOfHeadMenuContent(content.get(0));

           /* $("#nasa-main-menu").$("li").sibling(0).shouldHave(text(content.get(0)[0]));
            $("#nasa-main-menu").$("li").sibling(1).shouldHave(text(content.get(0)[1]));
            $("#nasa-main-menu").$("li").sibling(2).shouldHave(text(content.get(0)[2]));
            $("#nasa-main-menu").$("li").sibling(3).shouldHave(text(content.get(0)[3]));
            $("#nasa-main-menu").$("li").sibling(4).shouldHave(text(content.get(0)[4]));
            $("#nasa-main-menu").$("li").sibling(5).shouldHave(text(content.get(0)[5]));
            $("#nasa-main-menu").$("li").sibling(6).shouldHave(text(content.get(0)[6])); */

        }

    }

    @Test
    public void HeadMenu2RowTest() throws Exception {

        try (InputStream stream = cLoader.getResourceAsStream("headMenuContent.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {

            List<String[]> content = reader.readAll();
            headMenuPage
                    .check2RowOfHeadMenuVisible()
                    .check2RowOfHeadMenuContent(content.get(1));
        }

       /* $(".dropdown-menu", 0).$("li").shouldHave(text("Humans in Space"));
        $(".dropdown-menu", 0).$("li").sibling(0).shouldHave(text("Moon to Mars"));
        $(".dropdown-menu", 0).$("li").sibling(1).shouldHave(text("Earth"));
        $(".dropdown-menu", 0).$("li").sibling(2).shouldHave(text("Space Tech"));
        $(".dropdown-menu", 0).$("li").sibling(3).shouldHave(text("Flight"));
        $(".dropdown-menu", 0).$("li").sibling(4).shouldHave(text("Solar System and Beyond"));
        $(".dropdown-menu", 0).$("li").sibling(5).shouldHave(text("STEM Engagement"));
        $(".dropdown-menu", 0).$("li").sibling(6).shouldHave(text("History "));
        $(".dropdown-menu", 0).$("li").sibling(7).shouldHave(text("Benefits to You"));*/
    }
}
