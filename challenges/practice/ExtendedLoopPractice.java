package challenges.practice;

public class ExtendedLoopPractice {
    public static void main(String[] args) {
        double[] arr = {40, 60, 70, 80, 100}; // Changed to double[]
        
        // Call grade method and print the results
        double[] updatedGrades = grade(arr);
        for (double grade : updatedGrades) {
            System.out.println(grade);
        }
    }

    public static double average(double[] num) {
        double sum = 0;

        // Corrected the loop to iterate properly
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        return sum / num.length; // Return the correct average
    }

    public static double[] grade(double[] grades) {
        double avg = average(grades);

        // Corrected the loop to iterate properly
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > avg) {
                grades[i] = grades[i] / 2; // Halve grades above average
            } else if (grades[i] < avg) {
                grades[i] = grades[i] * 2; // Double grades below average

                if (grades[i] > 100) { // Cap grades at 100
                    grades[i] = 100;
                }
            }
        }

        return grades; // Return the updated grades array
    }
}