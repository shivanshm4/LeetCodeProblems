package Recursion;

class DecimalToBinary {

  static String decimalToBinary(String result, int number) {

    if(number == 0){
      return result;
    }

    result = number%2 + result;
    return decimalToBinary(result, number/2);
  }
  public static void main(String[] args) {
    System.out.println(decimalToBinary("", 300 ));
  }
}
