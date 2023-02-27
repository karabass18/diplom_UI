package uiTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestsBase {
    @BeforeAll
    static void beforeAll() {
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void beforeEach(){
        open("https://www.nasa.gov");
    }
}
