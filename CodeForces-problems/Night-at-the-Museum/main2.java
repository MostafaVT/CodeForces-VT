import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int res=0;
        char var = 'a';
        int i;
        for ( i = 0; i < input.length(); i++) {
            int diff = Math.abs(var-input.charAt(i));
           // System.out.println(diff);
            if (diff < 13) {
                res += diff;
            } else {
                res += 26 - diff;
            }
            var = input.charAt(i);
        }
        System.out.println(res);
        //System.out.println(i);
    }
}
