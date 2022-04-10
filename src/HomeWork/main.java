package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class main {


        public static void main(String[] args) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                WebDriver driver = new FirefoxDriver (  );


                driver.get("https://demoqa.com/browser-windows");
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                String mainPageHandle=driver.getWindowHandle();
                System.out.println(mainPageHandle);
                WebElement newTab=driver.findElement(By.xpath("//button[@id='tabButton']"));
                newTab.click();
                System.out.println(newTab.getText());
                WebElement newWindow=driver.findElement(By.xpath("//button[@id='windowButton']"));
                newWindow.click();
                WebElement newWindowMessage=driver.findElement(By.xpath("//button[@type='button'and@id='messageWindowButton']"));
                newWindowMessage.click();
                Set<String> allwindowHnadles=driver.getWindowHandles();
                System.out.println(allwindowHnadles.size());
                Iterator<String > it=allwindowHnadles.iterator();
                while(it.hasNext()){
                        String a=it.next();
                        String b=it.next();
                        String c=it.next();
                        if(!a.equals(mainPageHandle)){
                                driver.switchTo().window(a) ;
                                WebElement text=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                                System.out.println(text.getText());
                                driver.switchTo().window(mainPageHandle);
                        }else if(!b.equals(mainPageHandle)){
                                driver.switchTo().window(b);
                                WebElement text1=driver.findElement(By.xpath("//button[@id='windowButton']"));
                                System.out.println(text1.getText());
                                driver.switchTo().window(mainPageHandle);
                        }else if(!c.equals(mainPageHandle)){
                                driver.switchTo().window(c);
                                WebElement text2=driver.findElement(By.xpath("//body"));
                                System.out.println(text2.getText());



                        }
                }
                driver.switchTo().window(mainPageHandle);
                newTab.click();

        }
}