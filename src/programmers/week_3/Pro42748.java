package programmers.week_3;
import java.util.Arrays;

public class Pro42748 {
    public static void main(String[] args) {
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array,commands);
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] narr =new int[(commands[i][1]-commands[i][0])+1];
            int cnt=0;
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                narr[cnt]=array[j];
                cnt++;
            }
            Arrays.sort(narr);
            answer[i]=narr[commands[i][2]-1];
        }
        return answer;
    }
}
