package freelancer.pages;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class LoginPage extends BasePage<LoginPage> {
        @Name("Username input")
        @Visible
        @FindBy(xpath = "//input[@id='username']")
        private  TextInput usernameInput;

        @Visible
        @FindBy(xpath = "//input[@id='password']")
        private  TextInput passwordInput;

        @Visible
        @FindBy(xpath = "//input[@id='login']")
        private Button loginConfirmBTN;
/*
        @Visible
        @FindBy(xpath = "//div[@class='alert alert-warning']")
        private WebElement strXpathFehlermeldungBeiAnmeldung";

        @Visible
        @FindBy(xpath = "//a[@class='header-logo ']")
        String strXpathHeaderLogo = "//a[@class='header-logo ']";

        @Visible
        @FindBy(xpath = "//div[@class='panel-welcome']")
        String getStrXpathWelcomePanel = "//div[@class='panel-welcome']";
*/
        @Step("Login to the freelancer homepage")
        public SearchPage logIn() {
                usernameInput.sendKeys("Manuel.Naas@fincon.eu");
                passwordInput.sendKeys("start123#");
                loginConfirmBTN.click();

                return PageFactory.newInstance(SearchPage.class);
        }
}
