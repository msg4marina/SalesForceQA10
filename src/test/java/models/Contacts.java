package models;

public class Contacts {
    String accountName;
    String lastName;
    String mailingStreet;

   public Contacts(String accountName,  String mailingStreet) {
        this.accountName = accountName;
        this.mailingStreet = mailingStreet;
    }

   public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

      
   public String getLastName() {
        return lastName;
   }

    public void setLastName(String lastName) {
       this.lastName = lastName;
   }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }
}

