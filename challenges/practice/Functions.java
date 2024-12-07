package challenges.practice;

public class Functions {
    public static void main(String[] args) {
        System.out.println("Test Cases for Practice #1");
        System.out.println(isEven(3));
        System.out.println(isEven(128));

        System.out.println("Test Cases for Practice #2");
        int[] num = {5, 10, 15};
        System.out.println(average(num));

        System.out.println("Test Cases for Practice #3");
        System.out.println(desc("Mohamamd", 15, 10));

        System.out.println("Test Cases for Practice #4:");
        System.out.println(expt(3.0, 3));
        System.out.println(expt(2.0, 6));

        System.out.println("Factorial");
        System.out.println(factorial(5));

        System.out.println("Test Cases for HW #2:");
        int[] arr = {0, 0, 0};
        System.out.println(expAvg(arr, 0)); 
    }

    // Practice 1
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Practice 2
    public static double average(int[] num) {
        double sum = 0;

        for (int i = num.length; i < num.length; i++) {
            sum += num[i];
        }

        return sum / num.length;
    }

    // Practice 3
    public static String desc(String name, int age, int grade) {
        return name + " is " + age + " years old " + " and is in grade " + grade;
    }

    // Practice 4
    public static double expt(double base, int exp) {
        double output = 1.0;

        for (int i = 0; i < exp; i++) {
            output *= base;
        }

        return output;
    }

    // HW 1
    public static double expAvg(int[] num, int exp) {
        double result = average(num);
        
        return expt(result, exp);
    }

    // HW 2
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static double loopsum(int n){
        if (n == 0 ) {
            return 0;
        }

        return (n + (loopsum(n-1)));
    }
}
