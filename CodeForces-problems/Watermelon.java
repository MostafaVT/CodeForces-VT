import java.util.*;
public class Watermelon{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int kilos_bought;
        kilos_bought = scanner.nextInt();
        if (kilos_bought %2 ==0 && kilos_bought != 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}