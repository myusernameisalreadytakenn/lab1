/**
 * C2 = 1 O1 = "-"
 * C3 = 1 C = 1
 * C5 = 0 O2 = "*"
 * C7 = 1 тип індексів i та j = short
 */
public class lab1 {
    public static void main(String[] args) {
        double S = 0;
        int a = 2;
        int n = 3;
        int b = 2;
        int m = 3;
        final int C = 1;
        for (short i = (short)a; i <= n; i++) {
            for (short j = (short)b; j <= m; j++) {
                S = S + ((double)(i*j)/(i-C));
            }
        }
        System.out.println(S);
    }
}