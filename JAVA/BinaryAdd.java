public class BinaryAdd {
    public static void main(String[] args) {
        String binary1 = "10110";
        String binary2 = "1011";
        
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        
        int sum = num1 + num2;
      
        String binarySum = Integer.toBinaryString(sum);
  
        System.out.println(binary1 + " + " + binary2 + " = " + binarySum);
    }
}

