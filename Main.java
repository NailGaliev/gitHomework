package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        System.out.print("enter num: ");
        first = num.nextInt();

        switch (first) {
            case 1:
                System.out.print("Январь");
                break;
            case 2:
                System.out.print("Февраль");
                break;
            case 3:
                System.out.print("март");
                break;
            case 4:
                System.out.print("Апрель");
                break;
            case 5:
                System.out.print("Май");
                break;
            case 6:
                System.out.print("Июнь");
                break;
            case 7:
                System.out.print("Июль");
                break;
            case 8:
                System.out.print("Август");
                break;
            case 9:
                System.out.print("Сентябрь");
                break;
            case 10:
                System.out.print("Октябрь");
                break;
            case 11:
                System.out.print("Ноябрь");
                break;
            case 12:
                System.out.print("Декабрь");
                break;
        }

    }

}



