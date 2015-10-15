import java.lang.reflect.Array;

public class Bitshifter {
  public static String encrypt(String originalMessage) {
    String encryptedMessage = "";
    int length = originalMessage.length();
    char ch;
    for (int i = 0; i < length; i++) {
      ch = originalMessage.charAt(i);
      ch += 10;
      encryptedMessage += ch;
    }
    return encryptedMessage;
  }

  public static String decrypt(String encryptedMessage) {
    String decryptedMessage = "";
    int length = encryptedMessage.length();
    char ch;
    for (int i = 0; i < length; i++) {
      ch = encryptedMessage.charAt(i);
      ch -= 10;
      decryptedMessage += ch;
    }
    return decryptedMessage;
  }

  public static String encrypt2(String originalMessage) {
    int length = originalMessage.length();
    char[] originalArray = new char[length];
    for (int i = 0; i < length; i++) {
      originalArray[i] = originalMessage.charAt(i);
    }
    char[] encryptedArray = new char[length];
    for (int j = 0; j < length; j++) {
      char differentCharacter = Array.getChar(originalArray, j);
      encryptedArray[j] = (char) (differentCharacter + ((j + 5) * (j + 3)));
    }
    String encryptedMessage = new String(encryptedArray);
    return encryptedMessage;
  }

  public static String decrypt2(String encryptedMessage) {
    int length = encryptedMessage.length();
    char[] encryptedArray = new char[length];
    for (int i = 0; i < length; i++) {
      encryptedArray[i] = encryptedMessage.charAt(i);
    }
    char[] decryptedArray = new char[length];
    for (int j = 0; j < length; j++) {
      char differentCharacter = Array.getChar(encryptedArray, j);
      decryptedArray[j] = (char) (differentCharacter - ((j + 5) * (j + 3)));
    }
    String decryptedMessage = new String(decryptedArray);
    return decryptedMessage;
  }
}