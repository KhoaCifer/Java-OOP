package data;

public class Account {
    String accountID;
    String name;
    int yearOfBirth;
    int balance;

    public Account(String accountID, String name, int yearOfBirth) {
        this.accountID = accountID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getBalance() {
        return balance;
    }   

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountID=" + accountID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", balance=" + balance + '}';
    }

    public void showInformation() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Name: " + name);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Balance: " + balance);
    }
}
