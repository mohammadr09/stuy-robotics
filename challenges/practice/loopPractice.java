package challenges.practice;

public class loopPractice {
    public static void main(String[] args) {
        for(int i = 50; i > 0; i = i - 2) {
            System.out.println(i);
        }

        int n = 50;
        while (n > 0) {
            System.out.println(n);
            n -= 2;
        }

        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }

        int i = 1;
        while(i < 100) {
            System.out.println(i);
            i += 2;
        }

        for (int x = 1; x <= 100; x++) {
            if(x % 3 == 0) {
                System.out.println("Stuy");
            } else if (x % 5 == 0) {
                System.out.println("Pulse");
            } else if (x % 5 == 0 && x % 3 == 0) {
                System.out.println("Stuy Pulse");
            } else {
                System.out.println(x);
            }
        }
      }
}