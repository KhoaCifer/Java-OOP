package ex2;

import data.BookManagement;
import data.AccountManagement;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int choose;
        choose = GetANumber();
        switch(choose){
            case 1 -> {
                BookManagement DarkNhanTam = new BookManagement("Dark Nhan tam", "Dale Carnegie", 69);
                BookManagement CleanCode = new BookManagement("Clean Code", "Robert Martin",200);
                CleanCode.insertBookInformation();
                DarkNhanTam.insertBookInformation();
            }
            case 2 -> {
                int defaultBalance = 50;
                AccountManagement Smith = new AccountManagement("100524614",
                        "John Smith",
                        "123456789",
                        "0778824904",
                        defaultBalance + 100);
                Smith.accountData();
                System.out.println("Input Username");
                String username;
                Scanner Username = new Scanner(System.in);
                username = Username.nextLine();
                if ("Smith".equals(username)) {
                    int moneyWithdraw;
                    System.out.println("Input Money you want to get");
                    Scanner FromKeyboard = new Scanner(System.in);
                    moneyWithdraw = FromKeyboard.nextInt();
                    if (Smith.getBalance() <= 50) {
                        System.out.println("Your Balance must have at least 50k");
                    }
                    else {
                        System.out.printf("Input money you want to withdraw %d\n", moneyWithdraw);
                        int moneyLeft = Smith.getBalance() - moneyWithdraw;
                        if (moneyLeft < 50) {
                            System.out.println("Error");
                        } else {
                            System.out.println(moneyWithdraw + " has been withdrawed");
                        }
                    }
                }
                else {
                    System.out.println("Error, Unsername Invalid");
                }
            }
        }
    }   
    public static int GetANumber() {
        int InputNumber;
        System.out.println("Input a number");
        Scanner FromKeyboard = new Scanner(System.in);
        InputNumber = FromKeyboard.nextInt();
        return InputNumber;
    }
}
