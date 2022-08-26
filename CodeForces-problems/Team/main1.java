import java.util.*;
public class main1 {
    public static void main(String[] args){
        //input-data
        Scanner sc = new Scanner(System.in);
        int num_Qs = sc.nextInt();
        int[][] arr_Ag = new int[num_Qs][3];
        for(int i=0;i<num_Qs;i++){
            for(int j=0;j<3;j++){
                arr_Ag [i][j] = sc.nextInt();
            }
        }
        //base
        int qs_to_be_solved=0;
        for(int i=0;i<num_Qs;i++){
            int agreeCounter = 0;
            for(int j=0;j<3;j++){
                if(arr_Ag[i][j]==1){
                    agreeCounter++;
                } 
            }
            if(agreeCounter>=2){
                qs_to_be_solved++;
            }
        }
        System.out.println(qs_to_be_solved);

    }
    // //debugging
    // public static void showArr(int[][] arr){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println();
    //         for(int j=0;i<arr[i].length;i++){  
    //             System.out.print(arr[i][j]);
    //             System.out.print(" ");
    //         }
    //     }
    // }
}
