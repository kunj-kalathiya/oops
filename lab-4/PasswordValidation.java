import java.util.Scanner;

public class PasswordValidation {

    static boolean isValid(String pwd) {
        if (pwd.length() < 5 || pwd.length() > 12)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);

            if (Character.isUpperCase(c) || !Character.isLetterOrDigit(c))
                return false;

            if (Character.isLowerCase(c))
                hasLower = true;

            if (Character.isDigit(c))
                hasDigit = true;

            if (i > 0 && pwd.charAt(i) == pwd.charAt(i - 1))
                return false;
        }
        return hasLower && hasDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        System.out.println(isValid(pwd) ? "Valid Password" : "Invalid Password");
        sc.close();
    }
    
}
