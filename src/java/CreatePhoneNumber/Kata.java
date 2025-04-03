package CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {  //pode-se usar o string format
      return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], 
                           numbers[2], numbers[3], numbers[4], numbers[5], 
                           numbers[6], numbers[7], numbers[8], numbers[9]);  //simples assim
  } 
  }