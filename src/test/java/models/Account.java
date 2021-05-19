package models;

public class Account {
    String accountName;
    String phone;
    String website;

    public Account() {

    }
    public Account(String accountName, String phone, String website) {
        this.accountName = accountName;
        this.phone = phone;
        this.website = website;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}