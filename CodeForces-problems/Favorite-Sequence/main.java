import java.util.Scanner; 
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t > 0; t--) {
            int len = sc.nextInt();
            int[] array = new int[len]; 
            for (int i = 0; i < array.length; i++) {
                array[i]=sc.nextInt();
            }
            int[] res_array = new int[len];
            for (int k=0,i=0,j=array.length-1; i < array.length/2 ; i++,k+=2,j--) {
                res_array[k] = array[i];
                res_array[k+1] = array[j];
            }
            for (int i = 0; i < res_array.length; i++) {
                System.out.print(res_array[i]+" ");
            }
            System.out.println();
        }
    }
}
