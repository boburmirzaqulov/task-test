import tasks.Task1;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,1,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0}
        };
        System.out.println(Task1.getStepCount(nums));
    }
}
