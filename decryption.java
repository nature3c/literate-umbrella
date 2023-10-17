import java.io.*;
import java.util.*;
public class decryption {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int ii = 0; ii < cipherText.length(); ii++) {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(ii));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0) {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            message += replaceVal;
        }
        return message;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter the words for decryption:");
        message = sc.next();

        System.out.println("\n\nEnter shift key:");
        key = sc.nextInt();
        System.out.println("\nDecrypted message:" + decrypt(message, key));
    }
}