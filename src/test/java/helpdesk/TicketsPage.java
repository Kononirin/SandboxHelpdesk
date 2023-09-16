package helpdesk;

import core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketsPage extends BasePage {

    @FindBy(id = "search_query")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='tickettitle']")
    private WebElement ticket;

    public TicketsPage() {
        PageFactory.initElements(driver, this);
    }

    public TicketPage findTicket(String str) throws InterruptedException {
        Thread.sleep(2000);
        searchField.sendKeys(str, Keys.ENTER);
        Thread.sleep(2000);
        ticket.click();
        return new TicketPage();
    }
}
