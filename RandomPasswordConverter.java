import java.util.Scanner;
import java.util.Random;
public class RandomPasswordConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the desired password length:");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("y:");
        System.out.print("Include Lowercase? (y/n): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("y:");
        System.out.print("Include UpperCase? (y/n): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("y:");
        System.out.print("Include Special Characters? (y/n):");
        boolean includeSpecialcharacters = scanner.nextLine().equalsIgnoreCase("y:");
        String charSet = " ";
        if (includeNumbers) charSet += "0123456789";
        if (includeLowercase) charSet += "abcdefghijklmnopqrstuvwxyz";
        if (includeUppercase) charSet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (includeSpecialcharacters) charSet += "~!@#$%^&*()-+/*_.?<>{}[]";
        if (charSet.isEmpty()) {
            System.out.println("Error atleast one character must be selected.");
            return;
        }
        
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
        int randomIndex = random.nextInt(charSet.length());
        password.append(charSet.charAt(randomIndex));
        }

        System.out.println("Generated password: " +password.toString());
        scanner.close();
}
}
