import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1)
        {
            System.out.println("Ehab");
        }else if (n==2) {
            System.out.println("Mahmoud");
        }
        else
        {
            if(n%2 != 0){
                System.out.println("Ehab");
            }
            else{
                System.out.println("Mahmoud");
            }
        }
    }
}
