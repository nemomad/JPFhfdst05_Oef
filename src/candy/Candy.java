package candy;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        System.out.println("Prijs van de aankoop:");
        var scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        scanner.skip("\n");
        double change = 2.0 - price;
        System.out.println(change);
        String coinsReturn;
        int amount = 0;
         while (change > 1) {
            amount += 1 ;
            change -= 1;
        }
        int amount2 = 0;
        while (change > 0.50) {
            amount2 += 1 ;
            change -= 0.50;
        }
        int amount3 = 0;
        while (change > 0.20) {
            amount3 += 1 ;
            change -= 0.20;
        }
        int amount4 = 0;
        while (change > 0.10) {
            amount4 += 1 ;
            change -= 0.10;
        }
        int amount5 = 0;
        while (change > 0.05) {
            amount5 += 1 ;
            change -= 0.05;
        }
        int amount6 = 0;
        while (change > 0.02) {
            amount6 += 1 ;
            change -= 0.02;
        }
        int amount7 = 0;
        while (change > 0.01) {
            amount7 += 1 ;
            change -= 0.01;
        }




         coinsReturn = amount + "x €1  " + amount2 + "x €0.50  " + amount3 + "x €0.20  " + amount4 + "x €0.10  " + amount5 + "x €0.05  " + amount6 + "x €0.02  " + amount7 + "x €0.01  ";

        System.out.println(coinsReturn);
    }
}
