package Basics2;

public class MyForloopSum {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 30; i++) {

            int oldSum = sum;          // sum before adding
            sum = sum + i;             // update sum

            System.out.println(oldSum + " + " + i + " = " + sum);
        }

        System.out.println("Final Sum = " + sum);
    }
}
