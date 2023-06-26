package tests;

import org.example.DemoqaPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class DemoqaTest {
    private ChromeDriver driver;
    private DemoqaPage demoqaPage;

    By addElement = By.xpath("//button[@id='addNewRecordButton']");
    By firstNameInput = By.xpath("//input[@id='firstName']");
    By lastNameInput = By.xpath("//input[@id='lastName']");
    By emailInput = By.xpath("//input[@id='userEmail']");
    By ageInput = By.xpath("//input[@id='age']");
    By salaryInput = By.xpath("//input[@id='salary']");
    By departmentInput = By.xpath("//input[@id='department']");
    By submitButton = By.xpath("//button[@id='submit']");

    @BeforeEach
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/crown/Downloads/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        demoqaPage = new DemoqaPage(driver);
    }
    @Test
    public void baseTest() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        demoqaPage.clickAddButton();
        demoqaPage.enterFirstName("Ivan");
        demoqaPage.enterLastName("Ivanov");
        demoqaPage.enterEmail("Ivanov@gmail.com");
        demoqaPage.enterAge("35");
        demoqaPage.enterSalary("5000");
        demoqaPage.enterDepartment("office");
        demoqaPage.clickSubmitButton();
    }
    @AfterEach
    public void afterTest() {
        driver.close();
    }
}
