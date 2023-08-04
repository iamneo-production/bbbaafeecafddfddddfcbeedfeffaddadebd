package com.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipPages {
    WebDriver Driver;
    
    @FindBy(tagName = "a")
    public List<WebElement> links;
    
    public flipPages(WebDriver Driver) {
        this.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }
    
    public int getCountOfLinks() {
        return links.size();
    }
    
    public void printLinkTextAndURLs() {
        System.out.println("--------------------------------");
        for (WebElement link : links) {
            String text = link.getText();
            String url = link.getAttribute("href");
            System.out.println("Text: " + text + " - URL: " + url);
        }
    }
}
