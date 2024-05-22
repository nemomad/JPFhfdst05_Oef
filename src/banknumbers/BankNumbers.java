package banknumbers;

public class BankNumbers {
    public static void main(String[] args)
    {
         var banknr = 823445816730L; //OK
        // var banknr = 237824199569L; //OK
        // var banknr = 662431212859L; //OK
        // var banknr = 737524091952L; //OK
        // var banknr = 111224444891L; //NOK
        // var banknr = 777553241844L; //NOK
        var firstTen = banknr/100;
        var rest = firstTen%97;
        var lastTwo = banknr%100;
        if (rest == lastTwo) {
            System.out.println(banknr + " is een geldig bankrekeningnummer." );
        }
        else {
            System.out.println(banknr + " is geen geldig bankrekeningnummer.");
        }
    }
}
