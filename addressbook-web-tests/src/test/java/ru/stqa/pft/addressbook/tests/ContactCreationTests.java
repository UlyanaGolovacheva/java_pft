package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().initContactPage();
    app.getGroupHelper().fillContactForm(new ContactData("Ulyana", "Aleksandrovna", "Golovacheva", "Ulita", "QA", "T2",
                    "theatralniy,60\nRostov-na-Donu", "89081903221", "ulyana.golovacheva@tele2.ru", "9", "October", "test1"));
    app.getGroupHelper().submitContactCreation();
    app.getGroupHelper().returnToHomePage();
  }
}
