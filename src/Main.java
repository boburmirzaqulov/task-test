import tasks.Task1;
import tasks.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TASK 1
        int[][] nums = new int[][]{
                {0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0}
        };
        System.out.println(Task1.getStepCount(nums));

        //TASK 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for Task-2:");
        System.out.println(Task2.lastDigit(scanner.nextInt()));


    }
}
