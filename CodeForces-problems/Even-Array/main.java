import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        for (int i = 0; i < numTestCases; i++) {
            int arr_len = sc.nextInt();
            int nums[] = new int[arr_len];
            int inti_evens_num=0;
            for (int j = 0; j < nums.length; j++) {
                nums[j]=sc.nextInt();
                if (nums[j]%2==0) {
                    inti_evens_num++;
                }
            }
            int swapCounter = 0;
            if (inti_evens_num != arr_len-arr_len/2) {  //Math.ceil((double)arr_len/2.0)
                System.out.println(-1);
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j]%2 == 0) && j%2!=0) {
                        swapCounter++;
                    }                   
                }
                System.out.println(swapCounter);
            }
        }
    }
    // public static void showArr(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void swapWihtAdj(int arr[],int i) {
    //     int temp;
    //     temp = arr[i];
    //     arr[i] = arr[i+1];
    //     arr[i+1] = temp;
    // }
}


//  0 1 2 3 4
// [5,6,3,2,4]
// [1,5,]