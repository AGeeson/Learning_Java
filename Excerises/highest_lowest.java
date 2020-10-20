import java.util.*;

public class Kata {
  public static String highAndLow(String numbers) {
    String[] arrOfNumbers = numbers.split(" ");
    int [] intArr = new int[arrOfNumbers.length];
    for(int i=0; i < intArr.length; i++){
      intArr[i] = Integer.parseInt(arrOfNumbers[i]);
    }
    Arrays.sort(intArr);
    return Integer.toString(intArr[intArr.length-1]) + " " + Integer.toString(intArr[0]);
  }
}