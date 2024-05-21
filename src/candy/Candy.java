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
    }
}
