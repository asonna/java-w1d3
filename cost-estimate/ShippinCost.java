import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {


  }

  public static void valueUnitOfTheItemIs(String valueUnit) {
    Console myConsole = System.console();
    System.out.println("What is the" + valueUnit + " of the item?");
    String stringValue = myConsole.readLine();

    Integer itemValue = Integer.parseInt(stringValue);
    Integer doubleNumber = singleNumber * 2;
    System.out.println("Your number have been doubled to: " + doubleNumber);
  }
}
