package data;

import java.util.*;

public class CustomersInformation {

    //Customer type:
    private String accountType;
    private String ownerType;
    private List<Account> arr = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public CustomersInformation(String accountType, String ownerType) {
        this.accountType = accountType;
        this.ownerType = ownerType;
    }

    public Account searchCustomers(String id) {
        if (arr.isEmpty() == true) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAccountID().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        return null;
    }

    public void addACustomer() {
        String id, name;
        int yearOfBirth;
        System.out.println("Add a customer");
        while (1 > 0) {
            System.out.print("Input ID: ");
            id = sc.nextLine().trim().toUpperCase();
            Account customer = searchCustomers(id);
            if (customer == null) {
                break;
            } else {
                System.out.println("ID duplicated");
            }
        }
        System.out.print("Input name: ");
        name = sc.nextLine();
        while (1 > 0) {
            System.out.print("Input year of birth: ");
            yearOfBirth = Integer.parseInt(sc.nextLine());
            if (yearOfBirth > 2008) {
                System.out.println("Your age is below 18, cannot create a bank account");
            } else {
                break;
            }
        }
        arr.add(new Account(id, name, yearOfBirth));
    }

    public void showCustomersList() {
        if (arr.isEmpty() == true) {
            System.out.println("There is no register");
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showInformation();
        }
    }

    public void searchACustomer() {
        String id;
        System.out.print("Input Customer's ID to search: ");
        id = sc.nextLine();
        Account customer = searchCustomers(id);
        if (customer == null) {
            System.out.println("Customer Not Found");
        } else {
            System.out.println("Customer Found, here is his/her information");
            customer.showInformation();
        }
    }

    public void updateCustomerInformation() {
        String id, name;
        System.out.print("Input Customer's ID to update: ");
        id = sc.nextLine();
        Account customer = searchCustomers(id);
        String choose;
        System.out.println("Which type of information you want to change ?");
        choose = sc.nextLine();
        while (1 > 0) {
            if (customer == null) {
                System.out.println("Customer Not Found!");
            } else {
                switch (choose) {
                    case "ID":
                        id = sc.nextLine();
                        customer.setAccountID(id);
                        System.out.println("ID update successfully");
                        System.out.println("Your Information after updated");
                        customer.showInformation();
                        break;
                    case "Name":
                        name = sc.nextLine();
                        customer.setName(name);
                        System.out.println("Name update successfully");
                        System.out.println("Your Information after updated");
                        customer.showInformation();
                        break;
                    default:
                        System.out.println("Error, Invalid Information type");
                }
                break;
            }
        }
    }

    public void deleteACustomer() {
        String id;
        System.out.print("Input Customer's ID to delete: ");
        id = sc.nextLine();
        if (arr.isEmpty() == true) {
            System.out.println("Customer Not Found!");
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAccountID().equalsIgnoreCase(id)) {
                arr.remove(i);
            }
        }
    }
    
    public void depositMoney(int cash) {
        String id;
        System.out.print("Input Customer's ID to deposit: ");
        id = sc.nextLine();
        Account customer = searchCustomers(id);
        if (customer == null) {
            System.out.println("Customer Not Found!");
            cash = 0;
        } else {
            while (1 > 0) {
                if (cash > 0) {
                    System.out.print("Your Balance after deposited ");
                    customer.setBalance(customer.getBalance() + cash);
                    System.out.println(customer.getBalance());
                    break;
                } else {
                    System.out.println("Invalid deposited cash");
                }
            }
        }
    }

    public void withdrawMoney(int cash) {
        String id;
        System.out.print("Input Customer's ID to withdraw: ");
        id = sc.nextLine();
        Account customer = searchCustomers(id);
        if (customer == null) {
            System.out.println("Customer Not Found!");
            cash = 0;
        } else {
            while (1 > 0) {
                if (cash > 0) {
                    System.out.print("Your Balance after withdrawed ");
                    customer.setBalance(customer.getBalance() - cash);
                    System.out.println(customer.getBalance());
                    break;
                } else {
                    System.out.println("Invalid withdraw cash");
                }
            }
        }
    }
}
