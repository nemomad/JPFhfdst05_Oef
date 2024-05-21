package timeCalculation;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Geef een aantal seconden in:");
        var scanner = new Scanner(System.in);
        var seconds = scanner.nextInt();
        scanner.skip("\n");
        var hours = seconds/3600;
        var minutes = (seconds%3600)/60;
        var remainingSeconds = (seconds%3600)%60;
        System.out.println("U:" + hours + " M:" + minutes + " S:" + remainingSeconds);
    }
}
