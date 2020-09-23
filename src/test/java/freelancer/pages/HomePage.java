package freelancer.pages;


import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import github.pages.components.HeaderComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;

public class HomePage extends BasePage<freelancer.pages.HomePage> {
    @Name("Login Button")
    @Visible
    @FindBy(xpath = "//nav[@class='nav-top pull-right']//a[text() = 'Login']")
    private Button loginNavigationBTN;

    @Step("Navigate to the freelancer homepage")
    public static freelancer.pages.HomePage open() {
        return PageFactory.newInstance(freelancer.pages.HomePage.class, "http://www.freelance.de");
    }

    @Step("Navigate to LoginPage")
    public LoginPage goToLogin() {
        loginNavigationBTN.click();
        return PageFactory.newInstance(LoginPage.class);
    }
}

