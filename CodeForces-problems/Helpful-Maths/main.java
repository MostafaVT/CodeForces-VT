import  java.util.*;

import javax.lang.model.util.ElementScanner14;

public class main {
    public static void main(String[] args) {
        // input-data
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // base
        int num_numbers = (int) Math.ceil(input.length()/2.0);
        int ones_count=0;
        int twos_count=0; 
        int threes_count=0;
        String res ="";
   
        for(int i=0;i<input.length();i++){
            if (input.charAt(i) == '1') {
                ones_count++;
            }else if(input.charAt(i) == '2'){
                twos_count++;
            }else if(input.charAt(i) == '3'){
                threes_count++;
            }
        }

        // debuging
        // System.out.println();

        // System.out.println(ones_count);
        // System.out.println(twos_count);
        // System.out.println(threes_count);
        // System.out.println(num_numbers);

        // System.out.println();

        for(int i=0;i<num_numbers;i++){
            if(ones_count>0){
                res+= 1 +"+";
                ones_count--;
            }else if(twos_count>0){
                res+= 2 +"+";
                twos_count--;
            }else{
                res+= 3 +"+";
                threes_count--;
            }
        }
        
        System.out.println(res.substring(0,res.length()-1));
    }
}
