import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter a number that will be doubled for you");
    String stringNumber = myConsole.readLine();

    Integer singleNumber = Integer.parseInt(stringNumber);
    Integer doubleNumber = singleNumber * 2;
    System.out.println("Your number have been doubled to: " + doubleNumber);
  }
}
