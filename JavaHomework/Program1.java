import java.util.Scanner;

    import java.util.Scanner;

    public class Program1 {

        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first side of the triangle:");
            int side1 = sc.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the second side of the triangle:");
            int side2 = sc2.nextInt();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter the third side of the triangle:");
            int side3 = sc3.nextInt();
            if ( side1 == side2 && side2 == side3 && side3 == side1 ) {
                System.out.println("It is an equilateral triangle");
            }
            else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("It is an isosceles  triangle");
            }
            else if(side1 != side2 && side2 != side3 && side3 != side1)
            {
                System.out.println("It is an scalene  triangle");
            }
        }
    }


