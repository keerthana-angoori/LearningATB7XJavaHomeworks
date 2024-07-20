import java.util.Scanner;

public class Program2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number:");
        int num1 = sc.nextInt();
        System.out.println("The numbers along with FIZZ and BUZZ are :");
        for (int num=1; num< 101 ; num++) {

            if (num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("FIZZBUZZ");
            }
            else if (num % 3 == 0)
            {
                System.out.println("FIZZ");
            }
            else if (num % 5 == 0)
            {
                System.out.println("BUZZ");
            }
            else
            {
                System.out.println(num);
            }
        }

    }

}
