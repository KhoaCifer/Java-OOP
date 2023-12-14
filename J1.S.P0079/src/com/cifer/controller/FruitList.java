/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifer.controller;

import com.cifer.model.Fruit;
import com.cifer.model.Order;
import java.util.ArrayList;
import java.util.Hashtable;
import utils.Utils;

/**
 *
 * @author Cifer
 */
public class FruitList implements I_FruitList {

    ArrayList<Fruit> fruitList = new ArrayList<>();
    Hashtable<String, ArrayList<Order>> customerOrderTable = new Hashtable<>();
    ArrayList<String> customerNameList = new ArrayList<>();

    @Override
    public void createFruit() {
        String name, origin;
        double price;
        int id = 1, amount;
        boolean continueCheck;
        do {
            System.out.println("Welcome to the fruit creation screen");
            name = Utils.getString("Input name: ");
            price = Utils.getNumber("Input price: ", 1, 10000);
            amount = Utils.getNumber("Input amount: ", 1, 10000);
            origin = Utils.getString("Input origin: ");
            fruitList.add(new Fruit(id, name, price, amount, origin));
            continueCheck = Utils.getBoolean("Do you want to continue (Y/N)");
            id++;
        } while (continueCheck == true);
        for (Fruit x : fruitList) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void viewOrders() {
        System.out.println("Welcome to view order screen");
        System.out.println("You have 2 option");
        System.out.println("1. View customer's order by name");
        System.out.println("2. View all customer's order");
        String customerName;
        int option = Utils.getNumber("Input your choice", 1, 2);
        switch (option) {
            case 1:
                customerName = Utils.getString("Input customer's name: ");
                for (Order x : customerOrderTable.get(customerName)) {
                    x.orderList();
                }
                break;
            case 2:
                System.out.println("All customer's order: ");
                for (int i = 0; i < customerNameList.size(); i++) {
                    customerName = customerNameList.get(i);
                    System.out.println(customerName);
                    for (Order x : customerOrderTable.get(customerName)) {
                        x.orderList();
                    }
                }
                break;
        }
    }

    @Override
    public void shopping() {
        System.out.println("Welcome to shopping screen");
        ArrayList<Order> customerOrderList = new ArrayList<>();
        System.out.println("Current fruit we have: ");
        int index;
        for (index = 0; index < fruitList.size(); index++) {
            fruitList.get(index).shoppingList();
        }
        System.out.println("Please tell us your name");
        String customerName = Utils.getString("Sure: ");
        System.out.println("Please select your fruit you want to buy");
        boolean orderStatus;
        int itemNumber;
        int quantity;
        do {
            itemNumber = Utils.getNumber("Input item's number: ", 1, fruitList.size());
            if (itemNumber <= fruitList.size()) {
                System.out.println("You selected: " + fruitList.get(itemNumber - 1).getName());
                System.out.println("Please input the quantity:");
                if (fruitList.get(itemNumber - 1).getQuantity() > 0) {
                    quantity = Utils.getNumber("Input number of " + fruitList.get(itemNumber - 1).getName() + " you want to buy ", 1, fruitList.get(itemNumber - 1).getQuantity());
                    customerOrderList.add(new Order(fruitList.get(itemNumber - 1).getName(), quantity, fruitList.get(itemNumber - 1).getPrice()));
                } else {
                    System.out.println("Sorry! We dont have any of this, please choose another");
                }
            } else {
                System.out.println("Please select the correct number");
            }
            orderStatus = Utils.getBoolean("Do you want to order now ?(Y/N)");
        } while (orderStatus == false);
        customerOrderTable.put(customerName, customerOrderList);
        customerNameList.add(customerName);
        System.out.printf("Product   |Quantity  |Price     |Amount    \n");
        double total = 0;
        for (Order x : customerOrderList) {
            x.orderList();
            total = total + x.getAmount();
        }
        System.out.println("Total: " + total);
    }
}
