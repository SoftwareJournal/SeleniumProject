package com.software.journal.testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindSoftwareJournalChannel {
	private WebDriver driver;
	// Add driver system path
	private final String driverPath = "C:\\Selenium\\driver\\81_0_4044_20\\chromedriver.exe";

	@BeforeClass
	public void setup() {
		// Add system property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// Add ChromeOption parameters
		ChromeOptions options = new ChromeOptions();

		// This strategy causes Selenium to wait for the
		// DOMContentLoaded event (html content downloaded and parsed only)
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@Test
	public void findSoftwareJournalChannel() throws InterruptedException {
		// Open browser to Google.com page
		driver.get("http://www.google.com");

		// Enter in the search text field
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("Software Journal Youtube Channel");

		// Click Google Search Button
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();

		// wait at least 10 seconds before the screen loads
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement link;
		WebElement videoHeader;

		try {
			// See if the Video header section shows
			videoHeader = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/g-section-with-header/div[1]/h3")));
		} catch (TimeoutException e) {
			System.out.println("Videos header is not shown");
			videoHeader = null;
		}

		// Which display is shown?
		if (videoHeader != null) {
			link = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/a/h3")));
		} else {
			link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(.,\"Software\")]")));
		}
		// Once loaded, click the link for Software Journal
		link.click();
		System.out.println("Successful test script run");
		Thread.sleep(20000);
	}
}
