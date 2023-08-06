package q1;

import data.Account;
import data.CustomersInformation;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        int choice, cash;
        Scanner sc = new Scanner(System.in);
        CustomersInformation director = new CustomersInformation("Company", "Director");
        do {
            //choice = sc.nextInt();
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    director.addACustomer();
                    break;
                case 2:
                    director.showCustomersList();
                    break;
                case 3:
                    director.searchACustomer();;
                    break;
                case 4:
                    director.updateCustomerInformation();
                    break;
                case 5:
                    director.deleteACustomer();
                    break;
                case 6:
                    System.out.println("How much money you want to deposit");
                    cash = Integer.parseInt(sc.nextLine());
                    director.depositMoney(cash);
                    break;
                case 7:
                    System.out.println("How much money you want to withdraw");
                    cash = Integer.parseInt(sc.nextLine());
                    director.withdrawMoney(cash);
                    break;
                case 8:
                    System.out.println("Exit completely");
                    break;
                default:
                    System.out.println("Please choose 1..7");
                    break;
            }
        } while (choice != 8);
        //khác 6 thì chạy tiếp, = 6 thì quit vòng lặp
    }

    public static void menu() {
        System.out.println("Welcome to NguL bank");
        System.out.println("Choose the following option to set");
        System.out.println("1. Add a new customer");
        System.out.println("2. Show customer list");
        System.out.println("3. Search a customer by ID");
        System.out.println("4. Update a Customer Profile");
        System.out.println("5. Remove a Customer Profile");
        System.out.println("6. Deposit Money");
        System.out.println("7. Withdraw Money");
        System.out.println("8. Exit");
    }
}
