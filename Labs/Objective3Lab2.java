public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 10;
    side2 = 8;
    double squared1 = side1 * side1;
    double squared2 = side2 * side2;
    hypotenuse = Math.sqrt(squared1 + squared2);
    System.out.println("the hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
