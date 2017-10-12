import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SeleniumCommands {

    //1.Switch between two windows in browser

    ArrayList<String>all_handles = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(all_handles.get(1));
    String new_title = driver.getTitle();
    driver.close();
    driver.switchTo().window(all_handles.get(0));
    driver.quit();

    //2.Perform right click using WebDriver

    driver.get("https://www.");
    WebElement menu = driver.findElement(By.id("id_element"));
    Actions action = new Actions(driver);
    action.contextClick(menu) //this is right click!
              .sendKeys(Keys.ARROW_DOWN) //Back
              .sendKeys(Keys.ARROW_DOWN) //Forward
              .sendKeys(Keys.ARROW_DOWN) //Reload
              .sendKeys(Keys.ARROW_DOWN) //Favorite
              .sendKeys(Keys.ENTER)
              .perform();

    //3.Check if an element is present on the web page

    //a.Using list size of findElements()
    Boolean isPresent = driver.findElements(By.id("id_fname")).size()>0

    //b.Using method isEmpty()
    if(!driver.findElements(By.xpath("//*[@id='id_fname']")).isEmpty())

    //c.Using try/catch
    static boolean isPresent(String id){
        try {
            driver.findElement(By.id(id));
        } catch (NoSuchElementException e){
            return false;
        }
        return true;
    }
    public static void main (String[]args){
        String id = id_element;
        isPresent(id);
    }








}
