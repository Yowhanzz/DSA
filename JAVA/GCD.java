import java.util.Scanner;
public class GCD {

      public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = gcd(num1, num2);

        System.out.println("The Greatest Common Denominator of " + num1 + " and " + num2 + " is: " + gcd);
        scanner.close();
}
}