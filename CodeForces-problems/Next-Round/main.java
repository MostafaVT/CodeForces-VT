import java.util.*;
public class main {
    public static void main(String[] args){
        //input-data
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] score_arr = new int[n];
        for(int i=0;i<n;i++){
            score_arr[i] = sc.nextInt();
        }
        //base
        int adv_count = 0;
        for(int i=0;i<n;i++){   
            if(score_arr[k-1] <= score_arr[i] && score_arr[i] != 0 ){
            adv_count++;
            }     
        }
        System.out.println(adv_count);
    }     
}
