import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();
            for (int j = 1; j < n; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.print(1);
            System.out.println();
         }
    }
}
