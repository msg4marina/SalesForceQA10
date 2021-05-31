package models;

public class Account {
    String accountName;
    String phone;
    String website;
    String description;
    String billingStreet;
    String shippingStreet;


    public Account() {
    }

    public Account(String accountName, String phone, String website, String description,
                   String billingStreet, String shippingStreet) {
        this.accountName = accountName;
        this.phone = phone;
        this.website = website;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;

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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getBillingStreet() {
        return billingStreet;
    }
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }
    public String getShippingStreet() {
        return shippingStreet;
    }
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
}