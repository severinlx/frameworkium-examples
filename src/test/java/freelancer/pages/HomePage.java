package freelancer.pages;


import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import github.pages.components.HeaderComponent;
import io.qameta.allure.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class HomePage extends BasePage<github.pages.HomePage> {

    @Visible
    @Name("Header")
    private HeaderComponent header;

    @Step("Navigate to the Github homepage")
    public static github.pages.HomePage open() {
        return PageFactory.newInstance(github.pages.HomePage.class, "https://github.com");
    }

    public HeaderComponent theHeader() {
        return header;
    }
}

