public class GradingSystem {
    public static String getGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter student's score (0-100): ");
            int score = scanner.nextInt();
            
            String grade = getGrade(score);
            System.out.println("\nResults:");
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid number.");
        }
    }
}