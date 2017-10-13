import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
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

    //4.Check if an element is enabled on the page

    boolean elementEnabled = driver.findElement(By.id("id_element")).isEnabled();

    if (!driver.findElements(By.id("id_element")).getAttribute("disabled").isEmpty());

    //5.Check if an element is visible on the web page

    //a.HTML link
    <a href="http://abc.com" style="display: inline;">normal link</a>   //1st link
    <a href="http://abc.com" style="display: none;">link will not be displayed, no space allocated</a>  //2nd link
    <a href="http://abc.com" style="visibility: hidden;">hidden tag, but space is allocated</a>  //3rd link
    <a href="http://abc.com" style="opacity: 0;">unseen tag, space is allocated and it clickable</a>  //4th link


    //b.Using isDisplayed()method
    driver.findElement(By.id("id_element")).isDisplayed();

    //7.Check if an element read-only on the page
    if(!driver.findElements(By.id("id_element")).getAttribute("readonly").isEmpty());

    //8.Perform drag and drop
        //Using Action class
    Actions a = new Actions(driver);
    WebElement source = driver.findElement(By.xpath("xpath"));  //Source which you want to drag
    WebElement target = driver.findElement(By.xpath("xpath"));  //Target where you want to drop

    //9.Refresh a page without using context click

    //a.Using sendKeys.keys method
    driver.get("https://www.abc.com/index.html");
    driver.findElement(By.id("firstname_id")).sendKeys(Keys.F5);

    //b.Using navigate.refresh()method
        driver.get("https://www.abc.com/index.html");
        driver.navigate().refresh();

    //c.Using navigate.to()method
    driver.navigate().to(driver.getCurrentUrl());  //or driver.get(driver.getCurrentUrl());

    //10.Perform double click
        Actions a = new Actions(driver);
        a.doubleClick(webelement);

    //11.How to check if a text is highlighted on the page
    String color = driver.findElement(By.id("element_id")).getCssValue("color");
    String b_color = driver.findElement(By.xpath("element_id")).getCssValue("background-color");
    if(color.equals(b_color))
        System.out.println("Text is not highlighted");}

    //12.How to get the width and the height of the element
    Dimension element_size = driver.findElement(By.id("id_element")).getSize();
    double width = element_size.getWidth();
    double height = element_size.getHeight();

    //13.Check the checkbox or radio button is selected
    driver.findElement(By.xpath("xpath of button")).isSelected();

    //14.Count the number of links in a page
    int count =0;
    List<webElement>link = driver.findElements(By.tagName("a"));
    System.out.println(link.size());

    //15.How to get the attribute of the web element
    driver.getElement(By.tagName("img")).getAttribute("src");

    //16.How to achieve synchronization
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    //17.Get typed text from a textbox
    String typedText = driver.findElement(By.xpath("xpath")).getAttribute("value");

    //18.Type text in a new line inside a text area
    webelement.sendKeys("Line1. \ Line2.");

    //19.There is a scenario whenever function fails how can we automatically take a screenshot
    EventFiringWebDriver driver = new EventFiringWebDriver(driver);
    File srcFile = driver.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile. new File(imgPath));

    //20.How to get current URL
    driver.getCurrentUrl();

    //21.How do you handle https website in selenium
    public class HTTPSSecuredConnection{
        public static void main (String[]args){
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAcceptUntrustedCertificates(false);
            Webdriver driver = new FirefoxDriver(profile);
            driver.get("url");}}


    //22.How do you simulate browser back and forward
    driver.navigate().back();
    driver.navigate().forward();

    //23.How to clear the contents of a textbox
    driver.findElement(By.xpath("//input[@id='id_element']")).clear();

    //24.How to get the title of the page
    driver.getTitle();

    //25.Difference between close() and quit()

    //close() - close the browser where the control
    //quit() - close the browsers opened by WebDriver




}




    }








}
