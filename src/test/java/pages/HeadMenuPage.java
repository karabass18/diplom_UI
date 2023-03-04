package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeadMenuPage {

    private final SelenideElement mainMenuElement = $("#nasa-main-menu").$("li");
    private final SelenideElement mainMenu2RowElement = $(".dropdown-menu", 0).$("li");

    public HeadMenuPage checkLogoVisible() {
        step("Проверка видимости", () -> {
            $(".logo").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkLogoFileName(String value) {
        step("Проверка имени файла логотипа", () -> {
            String logoFileName = $("img").getAttribute("src");
            assertThat(logoFileName.equals(value));
        });
        return this;
    }

    public HeadMenuPage check1RowOfHeadMenuVisible() {
        step("Проверка видимости", () -> {
            $("#nasa-main-menu").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage check1RowOfHeadMenuContent(String[] value) {
        step("Проверка текста", () -> {
            for (int i = 0; i < value.length; i++) {
                mainMenuElement.sibling(i).shouldHave(text(value[i]));
            }
        });
        return this;
    }

    public HeadMenuPage check2RowOfHeadMenuVisible() {
        step("Проверка видимости", () -> {
            $("#nasa-main-menu").$(".dropdown-menu").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage check2RowOfHeadMenuContent(String[] value) {
        step("Проверка текста", () -> {
            mainMenu2RowElement.shouldHave(text(value[0]));
            for (int i = 1; i < value.length; i++) {
                mainMenu2RowElement.sibling(i - 1).shouldHave(text(value[i]));
            }
        });
        return this;

    }
}
