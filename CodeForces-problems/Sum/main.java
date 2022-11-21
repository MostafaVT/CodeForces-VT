import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t > 0; t--) {
            int input1 = sc.nextInt(); 
            int input2 = sc.nextInt(); 
            int input3 = sc.nextInt(); 
            if (input2+input3==input1||input1+input3==input2||input1+input2==input3) {
                System.out.println("Yes");
            } else {
                System.out.println("No");            
            }
        }
    }
}
