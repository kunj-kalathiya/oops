class Date {

    int month;
    int day;
    int year;

    // Constructor
    Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    void setMonth(int month) {
        this.month = month;
    }

    int getMonth() {
        return month;
    }

    void setDay(int day) {
        this.day = day;
    }

    int getDay() {
        return day;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }

    // Method to display date
    void DisplayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
class DateTest {
  public static void main(String[] args) {
        // Create Date object
        Date date = new Date(8, 15, 2025);

        // Display date
        date.DisplayDate();

        // Change date values
        date.setMonth(12);
        date.setDay(31);
        date.setYear(2026);

        // Display updated date
        date.DisplayDate();
    }
}


