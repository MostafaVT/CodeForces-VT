import java.util.*;
public class main {
    public static void main(String[] args)  {
        //input-data
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j]=sc.nextInt();
            }    
        }

        //base

        int one_cords_matrix[] = one_search(matrix);

        // System.out.print(one_cords_matrix[0]);
        // System.out.print(",");
        // System.out.print(one_cords_matrix[1]);
        // System.out.println();

        int steps=0;


        while(one_cords_matrix[0] != 2 || one_cords_matrix[1] != 2 ){
            if(one_cords_matrix[0] < 2 ){
                swapRow(matrix, one_cords_matrix[0],one_cords_matrix[0]+1);
                steps++;
               // System.out.println("swaped rows down");
                one_cords_matrix[0]++; 
            }else if (one_cords_matrix[0] > 2) {
                swapRow(matrix, one_cords_matrix[0],one_cords_matrix[0]-1);
                steps++;
               // System.out.println("swaped rows up");
                one_cords_matrix[0]--;
            }
            else if(one_cords_matrix[1] < 2){    
                swapCol(matrix, one_cords_matrix[1],one_cords_matrix[1]+1);
                steps++;
               // System.out.println("swaped columns right");
                one_cords_matrix[1]++;         
            }else if(one_cords_matrix[1] > 2){
                swapCol(matrix, one_cords_matrix[1],one_cords_matrix[1]-1);
                steps++;
                //System.out.println("swaped columns left");
                one_cords_matrix[1]--;
            }
        }
        showArr(matrix);

        // System.out.print(one_cords_matrix[0]);
        // System.out.print(",");
        // System.out.print(one_cords_matrix[1]);
        // one_search(matrix);
        
        // System.out.print(one_cords_matrix[0]);
        // System.out.print(",");
        // System.out.print(one_cords_matrix[1]);
    }
    //debugging 2D-array 5x5
    public static void showArr(int[][] arr){
        System.out.println("Debug:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    //swapping-Rows
    public static void swapRow(int[][]arr,int r1,int r2){   //r1 <---> r2
        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                temp = arr[r1][i];
                arr[r1][i] = arr[r2][j];
                arr[r2][j] = temp;                
            }    
        }
    }
    //swapping-columns
    public static void swapCol(int[][]arr,int c1,int c2){   //c1 <---> c2
        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                temp = arr[i][c1];
                arr[i][c1] = arr[j][c2];
                arr[j][c2] = temp;               
            }    
        }
    }
    //searching-for-1
    public static int[] one_search(int[][]arr){      
        int one_cords[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
              if(arr[i][j]==1){
                one_cords[0]=i;
                one_cords[1]=j;
              }
            }    
        }
        return one_cords;
    }
    
    
}
