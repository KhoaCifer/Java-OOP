/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifer.view;

import com.cifer.controller.FruitList;
import utils.Utils;

/**
 *
 * @author Cifer
 */
public class Main {

    public static void main(String[] args) {
        menu();
        int choice;
        FruitList fruitList = new FruitList();
        do {
            menu();
            choice = Utils.getNumber("Please input your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    fruitList.createFruit();
                    break;
                case 2:
                    fruitList.viewOrders();
                    break;
                case 3:
                    fruitList.shopping();
                    break;
                case 4:
                    System.out.println("Exit successfully");
                    break;
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("Fruit Shop System");
        System.out.println("1. Create Fruit");
        System.out.println("2. View Orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
    }
}
