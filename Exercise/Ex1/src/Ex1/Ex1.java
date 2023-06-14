package Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]) {
        int NumberCheck;
        NumberCheck = GetANumber();
        if (isPrime(NumberCheck) == true){
            System.out.println(NumberCheck + " is a prime number");
        } 
        else {
            System.out.println(NumberCheck + " is not a prime number");
        }
        NumberCheck = GetANumber();
        for(int i = 2; i <= NumberCheck; i++){
            if (printPrimeList(i) == true){
                System.out.print(i + " ");
            }
        }
        NumberCheck = Get3Number();
        System.out.println("y = ax + b = " + NumberCheck);
    }
    public static int GetANumber() {
        int InputNumber;
        System.out.println("Input a number");
        Scanner FromKeyboard = new Scanner(System.in);
        InputNumber = FromKeyboard.nextInt();
        return InputNumber;
    }
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for(int x = 2; x <= Math.sqrt(n); x++){
            if (n % x == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean printPrimeList(int n) {
        if (n <= 1){
            return false;
        }
        for(int x = 2; x <= Math.sqrt(n); x++){
            if (n % x == 0){
                return false;
            }
        }
        return true;
    }
    public static int Get3Number() {
        int InputA;
        int InputB;
        int InputX;
        int y;
        System.out.println("Input A and B");
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        Scanner X = new Scanner(System.in);
        InputA = A.nextInt();
        InputB = B.nextInt();
        System.out.println("Input X");
        InputX = X.nextInt();
        y = InputA*InputX + InputB;
        return y;
    }
}

