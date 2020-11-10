package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    initContactPage();
    fillContactForm(new ContactData("Ulyana", "Aleksandrovna", "Golovacheva", "Ulita", "QA", "T2",
                    "theatralniy,60\nRostov-na-Donu", "89081903221", "ulyana.golovacheva@tele2.ru", "9", "October", "test1"));
    submitContactCreation();
    returnToHomePage();
  }
}
