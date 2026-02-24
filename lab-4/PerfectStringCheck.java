 import java.util.*;

public class PerfectStringCheck {

    static boolean isPerfect(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.add(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println(isPerfect(str) ? "Perfect String" : "Not a Perfect String");
        sc.close();
    }
}
