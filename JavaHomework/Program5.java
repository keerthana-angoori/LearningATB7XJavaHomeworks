import java.util.Scanner;

public class Program5 {

        public static void main(String[] args) {
            //A year is a leap year if “any one of ” the following conditions are satisfied
            //The year is multiply by 400.
            //The year is a multiple of 4 and not a multiple of 100.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the year to find out whether it is leap year or not");
            int year = sc.nextInt();
            if ( year % 4 == 0 )
                if((year  % 100 != 0)||( year % 400 == 0))
            {
                System.out.println("This is leap year");
            }
            else {
                System.out.println("not a leap year");
            }
        }
    }

