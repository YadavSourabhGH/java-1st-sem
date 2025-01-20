public class DayNameFromNumber {
    public static String getDayName(int dayNumber) {
        if (dayNumber < 1 || dayNumber > 7) {
            throw new IllegalArgumentException("Day number must be between 1 and 7");
        }
        
        switch (dayNumber) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid day";
        }
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter day number (1-7): ");
            int dayNumber = scanner.nextInt();
            
            String dayName = getDayName(dayNumber);
            System.out.println("Day " + dayNumber + " is " + dayName);
            
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid number between 1 and 7");
        }
    }
}