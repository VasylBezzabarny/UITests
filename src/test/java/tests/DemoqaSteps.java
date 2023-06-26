package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.DemoqaPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaSteps {
    private DemoqaPage demoqaPage;
    private ChromeDriver driver;

    @Given("I am on the demoqa page")
    public void openDemoqaPage() {
        driver = new ChromeDriver();
        demoqaPage = new DemoqaPage(driver);
        driver.get("https://demoqa.com/webtables");
    }
    @When("I click the Add button")
    public void clickAddButton() {
        demoqaPage.clickAddButton();
    }
    @And("I enter the first name {string}")
    public void enterFirstName(String firstName) {
        demoqaPage.enterFirstName(firstName);
    }
    @And("I enter the last name {string}")
    public void enterLastName(String lastName) {
        demoqaPage.enterLastName(lastName);
    }
    @And("I enter the email {string}")
    public void enterEmail(String email) {
        demoqaPage.enterEmail(email);
    }
    @And("I enter the age {string}")
    public void enterAge(String age) {
        demoqaPage.enterAge(age);
    }
    @And("I enter the salary {string}")
    public void enterSalary(String salary) {
        demoqaPage.enterSalary(salary);
    }
    @And("I enter the department {string}")
    public void enterDepartment(String department) {
        demoqaPage.enterDepartment(department);
    }
    @And("I click the Submit button")
    public void clickSubmitButton() {
        demoqaPage.clickSubmitButton();
    }
    @Then("Close the page")
    public void closePage() {
        driver.close();
    }
}
