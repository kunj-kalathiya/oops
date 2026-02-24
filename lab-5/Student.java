import java.util.Scanner;

class Student {
    
    // i)  accept mark and return pass/fail
    public String average(int m1, int m2, int m3) {
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average Marks: " + avg);
        
        if (avg >= 50) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    // ii) input name and return it
    public String inputName(String name) {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        // Student nu naam levu
        System.out.print("Enter Student Name: ");
        String nameInput = sc.nextLine();
        String name = s1.inputName(nameInput);

        // Marks levu
        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt(); 

        // Result display karvu
        String result = s1.average(m1, m2, m3);
        
        System.out.println("\n--- Student Report ---");
        System.out.println("Student Name: " + name);
        System.out.println("Status:       " + result);
        sc.close();
    }
}