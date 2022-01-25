import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2]*2 + dp[i - 1]) % 10007 ;
        }
        System.out.print(dp[n]);
    }
}
/* 2+n 타일링2 */
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] dp = new int[n + 1];
//    dp[0] = 1;
//    dp[1] = 1;
//    for (int i = 2; i <= n; i++) {
//        dp[i] = (dp[i - 2]*2 + dp[i - 1]) % 10007 ;
//    }
//    System.out.print(dp[n]);
//}
/* 2+n 타일링 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007 ;
//        }
//        System.out.print(dp[n]);
//    }
/* 1 만들기 */
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            int[] dp = new int[x+1];
//            dp[1] = 0;
//            for(int i = 2; i <= x ;i ++) {
//                dp[i] = Integer.MAX_VALUE;
//                if(i % 3 == 0 ) {
//                    dp[i] = Math.min(dp[i],dp[i/3]+1);
//                }
//                if(i % 2 == 0) {
//                    dp[i] = Math.min(dp[i],dp[i/2]+1);
//                }
//                dp[i] = Math.min(dp[i],dp[i-1]+1);
//            }
//            System.out.print(dp[x]);
//    }

