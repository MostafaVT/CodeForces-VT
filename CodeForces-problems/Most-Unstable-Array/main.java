import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int i = numCases; i > 0; i--) {
            int len = sc.nextInt();
            int sum = sc.nextInt();
            if (len==1) {
                System.out.println(0);
            }else {
                if (len==2) {
                    System.out.println(sum);
                } else {
                    System.out.println(2*sum);     
                }                
            }
        }
    }
}
