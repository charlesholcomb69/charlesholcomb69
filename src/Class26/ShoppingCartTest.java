package Class26;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
     /*  shoppingCart.originalPrice=100;
       shoppingCart.discount=.20;*/
        // shoppingCart.setDiscount(.20);
        System.out.println(shoppingCart.getDiscount());
        shoppingCart.calculatePrice();

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("www.google.com");
    }
}