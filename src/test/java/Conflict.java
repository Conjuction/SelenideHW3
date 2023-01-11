import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Conflict {
    @Test
    void solutions(){
        open("https://github.com/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("h1.h1-mktg.mb-3").shouldHave(text("Build like the best"));
    }
}
