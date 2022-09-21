import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_num = sc.nextInt();
        String og_name = "Timur";
        for (int i = 0;i < test_num; i++) {
            int str_len = sc.nextInt();
            String str = sc.next();
            boolean flag = false;
            for (int j = 0;j < str_len; j++){
                for (int k = 0; k < og_name.length(); k++) {
                    if (str.charAt(j) == og_name.charAt(k)) {
                        flag = true;
                        break;
                    }            
                }
            }
            
        }
    }
}
