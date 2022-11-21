import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = t; i > 0; i--) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            double x = (m*n);
            if(m%2==0&&n%2==0){
                System.out.println((int)x/2);
            }else{
                System.out.println((int)((x/2.0)+0.5));
            }
        }
    }
}
