package uiTestsOfNasaGov;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestsBase {
    @BeforeAll
    static void beforeAll() {
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.nasa.gov";

    }
    @BeforeEach
    public void beforeEach(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        step("Открываем " + baseUrl, () -> {
            open(baseUrl);
        });

    }
}
