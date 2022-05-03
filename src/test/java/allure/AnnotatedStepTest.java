package allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AnnotatedStepTest {

    private static final String REPOSITORY = "Maria Bulaneva/demoqa_tests_12";
    private static final int ISSUE_NUMBER = 1;

    @Test
    @DisplayName("Успешный тест с аннотацией @Step")
    public void testGithubIssue() {
        Allure.parameter("Name", "Maria Bulaneva");
        //SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink();
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
