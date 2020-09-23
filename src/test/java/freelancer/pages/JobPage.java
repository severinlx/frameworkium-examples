package freelancer.pages;

import com.frameworkium.core.ui.pages.BasePage;

public class JobPage extends BasePage<JobPage> {
    String strXpathTitel = "//div[@class='panel-body project-header panel-white']//h1";

    String strXpathStartDatum = "//div[@class='col-md-6 details-box']//i[@class='far fa-calendar-star']/..";
    String strXpathEndeDatum = "//div[@class='col-md-6 details-box']//i[@class='far fa-calendar-times']/..";
    String strXpathOrt = "//div[@class='col-md-6 details-box']//i[@class='far fa-map-marker-alt']/..";
    String strXpathBezahlung = "//div[@class='col-md-6 details-box']//i[@class='far fa-coins']/..";
    String strXpathRemote = "//div[@class='col-md-6 details-box']//i[@class='far fa-home-alt']/..";
    String strXpathLetztesUpdate = "//div[@class='col-md-6 details-box']//i[@class='far fa-history']/..";
    String strXpathReferenzNummer = "//div[@class='col-md-6 details-box']//i[@class='far fa-tag']/..";
    String strXpathProjektbeschreibung = "//div[@class=\"panel-body\"]";
    String strXpathKategorienUndSkills = "//h3[text() = 'Kategorien und Skills']/../..//div[@class='panel-body']";
    String strXpathKontaktdaten = "//h3[text() = 'Kontaktdaten']/../..//div[@class='panel-body']";
}
