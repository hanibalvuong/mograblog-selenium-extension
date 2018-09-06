package mograblog;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * User: guym
 * Date: 7/21/13
 * Time: 7:57 AM
 */
public class TestSelectElement {

    @Test
    public void shouldHave2Options(){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.mograblog.com/2013/08/extending-selenium-in-java.html");
        MyPage page = new MyPage();

        PageFactory.initElements( new MograblogFieldDecorator( chromeDriver, chromeDriver ), page );
        page.changeToOption2();

        try{ // normally we don't need this, but we want to see it change this time, so I added sleep
            Thread.sleep(3000);
        }catch(Exception e){}


    }
}
