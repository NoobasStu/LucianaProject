
/**
 * Created by ������� on 20.06.2015.
 */
package main.java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LucianaMainPage {

    private WebDriver driver;
    
    
    /*
    ��������� ��������
     */
    @FindBy

            (xpath = ".//*[@id='textual']")

    WebElement pageTitle;


    /*
    ������� �� �������� �����������\�����������
     */
    @FindBy

            (xpath = ".//*[@id='topbar-right']/div[1]/a")

    WebElement toLogin;

    /*
    ���� ������
     */
    @FindBy

            (xpath = ".//*[@id='search_mini']")

    WebElement searchField;

    /*
    �������
     */
    @FindBy

            (xpath = ".//*[@id='menu-item-96']/a")

    WebElement goToBasket;

    public LucianaMainPage(WebDriver driver) {
    }



    /*
    ���� ���-�� ������� � ��������.� �� ���� �������������.�� ���� ��� �� ������ ������� ��������?
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

