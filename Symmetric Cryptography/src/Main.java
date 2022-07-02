
public class Main {

    public static void main(String[] args) {
        // Create String variables
        String originalString = "General Sir John Kotelawala Defence University";

        // Call encryption method
        String encryptedString
                = AES.encrypt(originalString);

        // Call decryption method
        String decryptedString
                = AES.decrypt(encryptedString);

        // Print all strings
        System.out.println("Encrypting String: "+originalString);
        System.out.println("Encrypted String: "+encryptedString);
        System.out.println("Decrypted String: "+decryptedString);
    }
}
