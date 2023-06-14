package varnfunc;

import java.util.Scanner; //~~ include<stdio.h>

public class VarNFunc {
    public static void main(String[] args) {
        int n;
        n = getAPositiveInterger(); 
        System.out.println("Your Number: " + n);
        printIntergerList(n);
        //x cua main dua value() cho n cua ham
        //Truyen Tham tri
        
        //playWithVariables();
        //playWithInt();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        //printIntergerList();
    }
    
    public static int getAPositiveInterger() {
        int n;
        System.out.print("Input a positive interger: ");
        Scanner banPhimCuaTui = new Scanner(System.in);
                         //malloc() calloc()
        n = banPhimCuaTui.nextInt();
        
        return n; //gan tra tri cho ten ham
    }
    
    public static void playWithBooleans() {
        boolean marriedstatus = false;
        if (marriedstatus == true) {
            System.out.println("Da co vo :<");
        }
        else {
            System.out.println("Vuon hong co loi nhung chua ai vao");;
        }
    }
    
    public static void playWithCharacters() { //2 byte, use unicode
        char m = '$';
        String name = "Ulquiorra Cifer";
        System.out.println("My name is " + name);
        System.out.println("The letter of my name: " + name.charAt(0));
        System.out.println("Lowercase: " + name.toUpperCase());
        System.out.println("+ String" + (name.toLowerCase() + name.toUpperCase()));
        System.out.println("unit: " + m);
    }
    
    public static void playWithDoubles() { //Java ưu tiên Double > Float
        double pi = 3.14;
        System.out.println("pi = " + pi);        
        System.out.printf("pi = %.2f\n", pi);
        float vat = 0.1f;
        System.out.println("vat = " + vat);
    }
    
    public static void playWithInt() {
        int n = 9; //literal value
        System.out.println("n = " + n);
        long m = 3_000_000_000L;
        System.out.println("m - " + m);
        int status = 0xFA; //hexa
        System.out.println("status: " + status);
        int phone = 0100; //octa
        System.out.println("phone: " + phone);
    }
    
    public static void playWithVariables() {
        int age = 20;
        int a = 10, b;
        b = 100;
        System.out.println("age: " + age);
        int yob = 2004;
        System.out.println("age again: " + (2023 - yob));
        System.out.printf("age printed by using %% as in C: %d\n", (2023 - yob));
    }
    
    public static void printIntergerList() {
        System.out.println("The list of 100 first int");
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
        }
    }
    
    //in ra stn tu 1 den n
    //hien tuong trong 1 class, ma co nhieu ham trung ten nhau va khac phan tham so/ dau vao nhung khac tren data type 
    //chu ko phai khac tren ten bien dc goi la Overload
    public static void printIntergerList(int x) {
        System.out.println("The list of " + x + " first int");
        for (int i = 1; i < x; i++) {
            System.out.print(i + " ");
        }
    }
}

