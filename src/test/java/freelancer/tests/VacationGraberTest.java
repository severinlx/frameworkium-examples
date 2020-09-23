package freelancer.tests;

import com.frameworkium.core.ui.tests.BaseUITest;
import freelancer.pages.HomePage;
import freelancer.pages.LoginPage;

import static com.google.common.truth.Truth.assertThat;

public class VacationGraberTest extends BaseUITest {

    //mvn clean verify -Dtest=VacationGraberTest -Dbrowser=firefox -Dwebdriver.gecko.driver=C:\Users\aseverin\IdeaProjects\frameworkium-examples\src\test\resources\geckodriver.exe
    //mvn allure:report

    public final void vacation_test() {
        HomePage.open()
                .goToLogin()
                .logIn()
                .search();
    }
}
