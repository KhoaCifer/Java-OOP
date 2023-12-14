/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author hd
 */
public class Utils {

    private static Scanner sc;

    public static String getString(String welcome) {
        String result = "";
        sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.length() > 0) {
                check = false;
            }
            if (check == true) {
                System.out.println("Something wrong, input again");
            }
        } while (check);
        return result;
    }

    public static int getNumber(String welcome, int min, int max) {
        int result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                result = sc.nextInt();
                if (result >= min && result <= max) {
                    check = false;
                }
                if (check == true) {
                    System.out.println("Something wrong, input again");
                }
            } catch (Exception e) {
            }
        } while (check);
        return result;
    }

    public static double getNumber(String welcome, double min, double max) {
        double result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                result = sc.nextDouble();
                if (result >= min && result <= max) {
                    check = false;
                }
                if (check == true) {
                    System.out.println("Something wrong, input again");
                }
            } catch (Exception e) {
            }
        } while (check);
        return result;
    }

    public static String updateString(String welcome, String oldValue) {
        String result = "";
        System.out.print(welcome);
        sc = new Scanner(System.in);
        result = sc.nextLine();
        if (result.length() == 0) {
            result = oldValue;
            System.out.println("Program will keep the old info");
        }
        System.out.println("Update successfully");
        return result;
    }

    public static int updateNumber(String welcome, int min, int max, int oldValue) {
        int result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String str = sc.nextLine();
                if (str.length() == 0) {
                    result = oldValue;
                    check = false;
                    System.out.println("Program will keep the old info");
                } else {
                    result = Integer.parseInt(str);
                    if (result >= min && result <= max) {
                        check = false;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (check);
        System.out.println("Update successfully");
        return result;
    }

    public static double updateNumber(String welcome, double min, double max, double oldValue) {
        double result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String str = sc.nextLine();
                if (str.length() == 0) {
                    result = oldValue;
                    check = false;
                    System.out.println("Program will keep the old info");
                } else {
                    result = Double.parseDouble(str);
                    if (result >= min && result <= max) {
                        check = false;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (check);
        System.out.println("Update successfully");
        return result;
    }

    public static boolean getBoolean(String welcome) {
        boolean check = false;
        System.out.print(welcome);
        sc = new Scanner(System.in);
        int loopCheck = 1;
        do {
            String str = sc.nextLine();
            if ("y".equalsIgnoreCase(str)) {
                check = true;
                loopCheck = 0;
            } else if ("n".equalsIgnoreCase(str)) {
                check = false;
                loopCheck = 0;
            } else {
                System.out.println("Something wrong, input again, just use Y/N");
            }
        } while (loopCheck == 1);
        return check;
    }

    public static boolean updateBoolean(String welcome, boolean oldValue) {
        boolean check = false;
        System.out.print(welcome);
        sc = new Scanner(System.in);

        int loopCheck = 1;
        do {
            String str = sc.nextLine();
            if (str.length() == 0) {
                check = oldValue;
                System.out.println("Program will keep the old info");
                loopCheck = 0;
            } else if ("y".equalsIgnoreCase(str)) {
                check = true;
                loopCheck = 0;
            } else if ("n".equalsIgnoreCase(str)) {
                check = false;
                loopCheck = 0;
            } else {
                System.out.println("Something wrong, input again, just use Y/N or abort and program will keep old value");
            }
        } while (loopCheck == 1);
        System.out.println("Update successfully");
        return check;
    }
}
