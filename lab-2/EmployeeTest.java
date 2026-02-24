// Employee.java
  class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    // Constructor
     Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

     void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

     String getFirstName() {
        return firstName;
    }

     String getLastName() {
        return lastName;
    }

     double getMonthlySalary() {
        return monthlySalary;
    }

     double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Give a percentage raise
     void giveRaise(double percent) {
        monthlySalary += monthlySalary * (percent / 100.0);
    }
}

 class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("kunj", "kalathiya", 3000);
        Employee emp2 = new Employee("yash", "patel", 4000);

        // Display yearly salaries
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: $" + emp2.getYearlySalary());

        // Give 10% raise to each employee
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display yearly salaries after raise
        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: $" + emp2.getYearlySalary());
    }
}
