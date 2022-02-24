import java.util.Scanner;
import java.time.LocalDate;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    LocalDate currentDate = LocalDate.now();
    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    /*
    Your solution goes here
    */
    age = input.nextInt();

    currentYear = currentDate.getYear();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
