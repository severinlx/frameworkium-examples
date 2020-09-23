package freelancer.pages;

import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class SearchPage extends BasePage<SearchPage> {
    @FindBy(xpath = "//*[@id='__search']//input[@name= '__search_freetext']")//error extra for demo
    private TextInput searchField;

    @FindBy(xpath = "//*[@id='__search']//input[@name= '__search_freetext']/..//button")
    private Button searchButton;

    public ResultsPage search() {
        searchField.sendKeys("Test");
        searchButton.click();

        return PageFactory.newInstance(ResultsPage.class);
    }
}
