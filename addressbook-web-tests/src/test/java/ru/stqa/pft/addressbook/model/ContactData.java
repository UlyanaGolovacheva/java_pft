package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String middlname;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String mobile;
  private final String email;
  private final String bday;
  private final String bmonth;
  private final String group;

  public ContactData(String name, String middlname, String lastname, String nickname, String title, String company, String address, String mobile, String email, String bday, String bmonth, String group) {
    this.name = name;
    this.middlname = middlname;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.mobile = mobile;
    this.email = email;
    this.bday = bday;
    this.bmonth = bmonth;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public String getMiddlname() {
    return middlname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getBday() {
    return bday;
  }

  public String getBmonth() {
    return bmonth;
  }

  public String getGroup() {
    return group;
  }
}
