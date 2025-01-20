public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter a year to check if leap year: ");
            int year = scanner.nextInt();
            
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
            
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid year");
        }
    }
}