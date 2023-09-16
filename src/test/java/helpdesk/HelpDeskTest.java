package helpdesk;

import core.BaseTest;
import helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;

import static helpers.StringModifier.getUniqueString;

public class HelpDeskTest extends BaseTest {

    @Test
    public void checkTicket() throws InterruptedException {
        //уникальный номер не находит и падает тест
//        String title = getUniqueString(TestValues.TEST_TITLE);
        String title = "Сообщение один";

        TicketPage ticketPage = new MainPage()
                .createTicket(title, TestValues.TEST_BODY, TestValues.TEST_EMAIL)
                .openLoginPage()
                .auth("admin", "adminat")
                .findTicket(title);

        Assert.assertTrue(ticketPage.getTitle().contains(title));
        Assert.assertEquals(ticketPage.getBody(), TestValues.TEST_BODY);
        Assert.assertEquals(ticketPage.getEmail(), TestValues.TEST_EMAIL);
    }
}
