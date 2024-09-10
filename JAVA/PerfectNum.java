import java.util.Scanner;

public class PerfectNum {

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int sumOfFactors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors == number;
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check if it is a perfect number: ");
        int num = scanner.nextInt(); 

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        scanner.close();
    }

}


