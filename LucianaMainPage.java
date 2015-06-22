
/**
 * Created by Настена on 20.06.2015.
 */
package main.java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LucianaMainPage {

    private WebDriver driver;
    
    
    /*
    Заголовок страницы
     */
    @FindBy

            (xpath = ".//*[@id='textual']")

    WebElement pageTitle;


    /*
    Переход на страницу авторизации\регистрации
     */
    @FindBy

            (xpath = ".//*[@id='topbar-right']/div[1]/a")

    WebElement toLogin;

    /*
    Поле поиска
     */
    @FindBy

            (xpath = ".//*[@id='search_mini']")

    WebElement searchField;

    /*
    Корзина
     */
    @FindBy

            (xpath = ".//*[@id='menu-item-96']/a")

    WebElement goToBasket;

    public LucianaMainPage(WebDriver driver) {
    }



    /*
    НАдо что-то сделать с товарами.Я не имею представления.НО ведь это же важный элемент страницы?
     */


    /*
    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.titleContains("Products");
    }

    @Override
    public String getPageUrl() {
        return "";

    */

    public LucianaMainPage openMainPage(){

            return new LucianaMainPage(driver);

        }

        public LucianaLoginPage goToLoginPage(){

        return new LucianaLoginPage;

    }

    public LucianaBasketPage goToBasket() {

        return new LucianaBasketPage;

    }

    public void mainPageSearch(String text){
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.RETURN);




    }





}

