import java.util.Scanner;

public class secondtask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        int i;

        for ( i = 1; i <= numSubjects; i++) {

            System.out.print("Enter marks for subject " + (i) + " (out of 100): ");

            int marks = scanner.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks. Please enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }
            totalMarks += marks;

        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;

        if (averagePercentage >= 90)
         {
            grade = "A+";
        }
         else if (averagePercentage >= 80)
          {
            grade = "A";
        } 
        else if (averagePercentage >= 70) 
        {
            grade = "B";
        } 
        else if (averagePercentage >= 60) 
        {
            grade = "C";
        }
         else if (averagePercentage >= 50)
          {
            grade = "D";
        }
         else
          {
            grade = "F";
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks+" out of "+(i-1)*100);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

       

    }
}
