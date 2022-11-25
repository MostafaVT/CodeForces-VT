import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int len = sc.nextInt();
            int[] array = new int[2*len]; 
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }

            int[] res_array = new int[len];


            // int r = 0;
            // for(int j = 0; j < res_array.length; j++)
            // {
            //     int k;
            //     boolean flag = false;
            //     for(k = 0; k < array.length; k++)
            //     {
            //         if(res_array[j] == array[k])
            //         {
            //             flag = true;
            //             array[k] = -1;
            //             break;
            //         }
            //     }
            //     if(!flag)
            //     {
            //         res_array[j] = array[r++];
            //     }
            // }
//__________________________________________________________________________
            // int num,m=0;
            // for (int j = 0; j < array.length && array[j]!=0; j++) {
            //     num = array[j];
            //     array[j]=0;
            //     for (int k = j+1; k < array.length; k++) {
            //         if (num==array[k]) {
            //             array[k] = 0;
            //         }
            //     }
            //     if(m<len){
            //         res_array[m++]=num;
            //     }else{
            //         break;
            //     }
            // }
// _________________________________________________________________________
            int k;
            for (int j = 0; j < array.length; j++) {
                boolean flag = false;
                for (k = 0; res_array[k]!=0 ; k++) {
                    if(res_array[k]==array[j]){
                        array[j] = 0;
                        flag = true;
                        break;
                    }
                }
                if (!flag  && array[j]!=0) {
                    res_array[k] = array[j];
                }
            }
//_________________________________________________________________________
            for (int j = 0; j < res_array.length; j++) {
                System.out.print(res_array[j]+" ");
            }
            System.out.println();
        }
    }
}
