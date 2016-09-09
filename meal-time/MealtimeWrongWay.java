import java.io.Console;

public class MealtimeWrongWay {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What did you eat for breakfast?");
    String YourBreakfast = myConsole.readLine();
    System.out.println("So, you had " + YourBreakfast + " for breakfast!");

    System.out.println("What did you eat for lunch?");
    String YourLunch = myConsole.readLine();
    System.out.println("So, you had " + YourLunch + " for lunch!");

    System.out.println("What did you eat for dinner?");
    String YourDinner = myConsole.readLine();
    System.out.println("So, you had " + YourDinner + " for dinner!");
  }
}
