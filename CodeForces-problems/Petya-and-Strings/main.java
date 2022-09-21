import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        int z = x.compareToIgnoreCase(y);
        int r = z < 0 ? -1 : z > 0 ? 1 : 0 ;     
        System.out.println(r);
    }
}
