public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int small = 0;
      int[] nArr = args;
      small = nArr[0];
      for(int i=1; i < nArr.length; i++){
        if (nArr[i] < small){
          small = nArr[i]; 
        }
      }
      return small;
    }
}