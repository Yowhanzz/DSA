public class Base5Add {

  public static void main(String[] args) {
    String base5String1 = "1230";
    String base5String2 = "443";

    int num1InDecimal = Integer.parseInt(base5String1, 5);
    int num2InDecimal = Integer.parseInt(base5String2, 5);

    int sumInDecimal = num1InDecimal + num2InDecimal;

    String sumBase5= Integer.toString(sumInDecimal, 5);

    System.out.println(sumBase5);
    }    
  }


