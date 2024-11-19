package challenges;

public class ExtendedLoopPractice {
    public static void main(String[] args) {
        int[] arr = {40, 60, 70, 80, 100};
        return grades(arr);
    }

    public static double average(int[] num) {
        double sum = 0;

        for (int i = num.length; i < num.length; i++) {
            sum += num[i];
        }

        return sum / num.length;
    }

    public static double grade(int[] grades) {
        double avg = average(grades);
        
        for (int i = grades.length; i < grades.length; i++) {
            if (grades[i] > avg) {
                grades[i] = grades[i] / 2;
            } else if (grades[i] < avg) {
                grades[i] = grades[i] * 2;

                if (grades[i] > 100) {
                    grades[i] = 100;
                }
            }
        }

        return grades;
    }
}
