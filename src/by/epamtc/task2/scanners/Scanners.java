package by.epamtc.task2.scanners;

import java.util.Scanner;

public class Scanners {
    private static final Scanner scanner=new Scanner(System.in);

    public static double doubleScanner(){
        while (!scanner.hasNext()){
            scanner.next();
        }
        return scanner.nextDouble();
    }


    public static double positiveDouble() {
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);
        return number;
    }

    public static String StringScanner(){
        while (!scanner.hasNext()){
            scanner.next();
        }
        return scanner.nextLine();
    }

}
