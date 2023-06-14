package data;

public class AccountManagement {
    private String accountNumber;
    private String userName;
    private String CMND;
    private String phoneNumber;
    private int balance;
    public AccountManagement(String accountNumber, String userName, String CMND, String phoneNumber, int balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getCMND() {
        return CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }  
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void accountData () {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Username: " + userName);
        System.out.println("CMND: " + CMND);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}
