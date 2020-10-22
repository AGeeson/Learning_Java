import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
      String[] sArr = s.split(" ");
      int score;
      score = sArr[0].length();
      for (int i=1; i < sArr.length; i++){
        if (sArr[i].length() < score){
          score = sArr[i].length();
        }
      }
      return score;    
    }
}