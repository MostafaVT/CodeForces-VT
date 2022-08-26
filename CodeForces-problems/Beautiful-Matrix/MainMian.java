import java.util.*;
public class MainMian {
    public static void main(String[] args) {
        //input-data
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j]=sc.nextInt();
            }    
        }
        //base
        double x = 0;
        int inti_cords[] = one_search(matrix);
    
        if((inti_cords[0] == 0 && inti_cords[1] == 0)){         //oga--boga
            System.out.println(4); 
        }else if((inti_cords[0] == 0 && inti_cords[1] == 4)){   //oga--boga
            System.out.println(4); 
        }else if((inti_cords[0] == 4 && inti_cords[1] == 0)){   //oga--boga
            System.out.println(4); 
        }else if((inti_cords[0] == 4 && inti_cords[1] == 4)){   //oga--boga
            System.out.println(4);
        }
        else{
            x = (Math.ceil(Math.sqrt(Math.pow((double)(2-inti_cords[0]),2.0)+Math.pow((double)(2-inti_cords[1]),2.0))));
            System.out.println((int)x);
        }
        
    }
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