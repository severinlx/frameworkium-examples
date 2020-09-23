package freelancer.pages;

import com.frameworkium.core.ui.pages.BasePage;

public class ResultsPage extends BasePage<ResultsPage> {
    // XPaths - Suchliste
    String strXpathSuchlisteneintrag = "(//*[contains(@id,\"project_link\")])[" + "[i]" + "]"; // [i] wird innerhalb der Schleife mit dem aktuellen Schleifenzähler ersetzt
    String strXPathnaechsteSeite = "//ul[@class=\"pagination\"]//span[@class=\"fa fa-angle-right\"]/..";
    String strXpathSuchlistenElemente = "//div[@class='project-list']/*";
}
