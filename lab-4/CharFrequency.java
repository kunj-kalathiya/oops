import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        System.out.println("Characters exceeding " + n + ":");
        for (char c : map.keySet()) {
            if (map.get(c) > n)
                System.out.println(c);
        }
        sc.close();
    }
}
