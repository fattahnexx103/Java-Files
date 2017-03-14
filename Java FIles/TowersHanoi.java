public class TowersHanoi {

  public static void main(String[] args) {
    solveTowers(4, 'A', 'B', 'C');
  }

  public static void solveTowers(int count, char source, char destination,
      char spare) {
    if (count == 1) {
      System.out.println("Move top disk from pole " + source + " to pole "
          + destination);
    } else {
      solveTowers(count - 1, source, spare, destination); // X
      solveTowers(1, source, destination, spare); // Y
      solveTowers(count - 1, spare, destination, source); // Z
    }
  }
}
