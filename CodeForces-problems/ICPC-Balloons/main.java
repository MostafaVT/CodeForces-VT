import java.util.Scanner;
public class main {
    static Scanner sc = new Scanner(System.in);
    public static void solve(){
        int len = sc.nextInt();
        String s = sc.next();
        int res=0;
        boolean isFound;
        for (int j = 1; j < s.length(); j++) {
            isFound = false;
            char val = s.charAt(j);
            for (int k = j-1; k >= 0; k--) {
             if (val==s.charAt(k)) {
                isFound = true;
                break;    
             } 
            }
            if (!isFound) {
                res+=2;
            }else{
                res++;
            }     
        }
        System.out.println(res+2);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0) {
            solve();
        }
    }
}