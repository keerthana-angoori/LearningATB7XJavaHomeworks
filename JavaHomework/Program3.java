import java.util.Scanner;

public class Program3 {

    public static void main(String [] args) {

        //By taking the user input and printing the numbers with FIZZ, BUZZ in that range.

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number:");
        int num = sc.nextInt();
        System.out.println("The numbers along with FIZZ and BUZZ are :");
        for (int i= 1; i<=num ; i++) {

            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FIZZBUZZ");
            }
            else if (i % 3 == 0)
            {
                System.out.println("FIZZ");
            }
            else if (i % 5 == 0)
            {
                System.out.println("BUZZ");
            }
            else
            {
                System.out.println(i);
            }
        }

    }

}




