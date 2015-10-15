import java.util.Scanner;

public class BitshifterApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("Please enter the message you want to encrypt:\n> ");
    String message = sc.nextLine();
    String encryptedMessage = Bitshifter.encrypt(message);

    System.out.println("Here’s your message after encryption:");
    System.out.printf("> “%s”\n", encryptedMessage);
    System.out.println("Here it is again after being decrypted:");
    System.out.printf("> “%s”\n", Bitshifter.decrypt(encryptedMessage));

    String encryptedMessage2 = Bitshifter.encrypt2(message);
    System.out.println("Here it is encrypted in a different way:");
    System.out.printf("> “%s”\n", encryptedMessage2);

    System.out.println("Here it is decrypted again:");
    System.out.printf("> “%s”\n", Bitshifter.decrypt2(encryptedMessage2));

    sc.close();
  }
}