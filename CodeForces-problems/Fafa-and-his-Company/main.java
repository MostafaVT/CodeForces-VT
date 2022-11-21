import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i=1,j=0;
        while((Math.ceil(input/2))>=i){
            if ((input-i)%i==0) {
                j++;
            }
            i++;
        }
        System.out.println(j);
    }
}