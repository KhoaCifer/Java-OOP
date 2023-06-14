package ex3;

import data.data;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        inputInformation();
    }
    public static void inputInformation(){
        String owner; 
        int dai = 1; 
        int rong = 1;
        int canh = 1;
        int bankinh = 1;
        String color;
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input Owner: ");
        owner = banPhimCuaTui.nextLine();
        if ("Na".equals(owner)) {
            while (0 < 1) {
                try {
                    System.out.print("Input chieu dai: ");
                    dai = Integer.parseInt(banPhimCuaTui.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Do ku know how to input a positive number");
                }
            }
            while (69 < 79) {
                try {
                    System.out.print("Input chieu rong: ");
                    rong = Integer.parseInt(banPhimCuaTui.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Do ku know how to input a positive number");
                }
            }
            System.out.print("Input color: ");
            color = banPhimCuaTui.nextLine();
            data boss = new data(owner, dai, rong, canh, bankinh, color);
            boss.showInformation();
        }
        else if ("Cifer".equals(owner)) {
            while (0 < 1) {
                try {
                    System.out.print("Input ban kinh: ");
                    bankinh = Integer.parseInt(banPhimCuaTui.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Do ku know how to input a positive number");
                }
            }
            System.out.print("Input color: ");
            color = banPhimCuaTui.nextLine();
            data boss = new data(owner, dai, rong, canh, bankinh, color);
            boss.showInformation();
        }
        else if ("Ghe tao".equals(owner)) {
            while (0 < 1) {
                try {
                    System.out.print("Input canh: ");
                    canh = Integer.parseInt(banPhimCuaTui.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Do ku know how to input a positive number");
                }
            }
            System.out.print("Input color: ");
            color = banPhimCuaTui.nextLine();
            data boss = new data(owner, dai, rong, canh, bankinh, color);
            boss.showInformation();
        }
    }
}
