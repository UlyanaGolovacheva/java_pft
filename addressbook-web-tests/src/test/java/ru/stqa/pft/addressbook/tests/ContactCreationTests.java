package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().initContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Ulyana", "Aleksandrovna", "Golovacheva", "Ulita", "QA", "T2",
                    "theatralniy,60\nRostov-na-Donu", "89081903221", "ulyana.golovacheva@tele2.ru", "9", "October", "test1"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
