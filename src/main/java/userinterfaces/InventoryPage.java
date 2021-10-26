package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {
    public static final Target ITEM_PRODUCTO = Target.the("Producto").locatedBy("//div[text()='[Sauce Labs Fleece Jacket]']");
}
