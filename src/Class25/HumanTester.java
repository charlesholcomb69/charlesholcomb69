package Class25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HumanTester {
    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        //  Maha.printLegs();
        Human.printLegs();
        LivingBeing.printLegs();
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("www.google.com");
    }
}
