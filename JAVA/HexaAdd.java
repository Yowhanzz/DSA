public class HexaAdd {
    public static void main(String[] args) {
        String hex1 = "CAFE";
        String hex2 = "1CE";

        int num1 = Integer.parseInt(hex1, 16);
        int num2 = Integer.parseInt(hex2, 16);
        
        int sum = num1 + num2;
        
        String hexSum = Integer.toHexString(sum);
    
        System.out.println(hex1 + " + " + hex2 + " = " + hexSum);
    }
}

