package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HizmetlerimizPage {
    public HizmetlerimizPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}