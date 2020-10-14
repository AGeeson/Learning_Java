public class Fish {
  String species;
  boolean isFreshwater;
  int age;
  
  public Fish(String fishSpecies, boolean freshwaterFish, int fishYears) {
    System.out.println("Constructor invoked!");
    species = fishSpecies;
    isFreshwater = freshwaterFish;
    age = fishYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    Fish magi = new Fish("karp", true, 37);
    Fish garydos = new Fish("big karp", true, 100);
    boolean isMagiOlder = magi.age > garydos.age;
    int totalFishYears = magi.age + garydos.age;
    System.out.println("Two fish logged: a " + magi.species + " and a " + garydos.species);
    System.out.println("The statement that fido is an older dog is: " + isMagiOlder);
    System.out.println("The total age of the fish is: " + totalFishYears);
    System.out.println("Main method finished");
  }
}