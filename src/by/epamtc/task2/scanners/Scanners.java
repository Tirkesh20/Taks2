package by.epamtc.task2.scanners;

import java.awt.*;
import java.util.Scanner;

public class Scanners {
    private static final Scanner scanner=new Scanner(System.in);

    public static double doubleScanner(){
        while (!scanner.hasNext()){
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static String StringScanner(){
        while (!scanner.hasNext()){
            scanner.next();
        }
        return scanner.next();
    }

}
