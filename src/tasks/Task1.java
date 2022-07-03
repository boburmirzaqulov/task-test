package tasks;

public class Task1 {
    public static int getStepCount(int[][] table){
        int n = 0,m = 0,size= table.length/2;
        boolean b = false;
        tableFor:
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 1) {
                    n = i;
                    m = j;
                    break tableFor;
                }
            }
        }
        return Math.abs(size-n) + Math.abs(size-m);
    }
}
