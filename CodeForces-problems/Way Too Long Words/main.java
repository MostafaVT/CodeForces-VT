import java.util.*;
public class main {
    public static void main(String[] args){
        //input-data
        Scanner sc = new Scanner(System.in);   
        //System.out.println("How many words ?");
        int num_words = sc.nextInt();
        String[] arr_of_words = new String[num_words];
        for(int i = 0;i<num_words;i++){
            //System.out.println("Enter a word : ");
            arr_of_words[i] = sc.next();
        }
        //base
        for(int i=0;i<arr_of_words.length;i++){
            if(arr_of_words[i].length()>10){
                arr_of_words[i] = arr_of_words[i].charAt(0)+
                                ""+
                                (arr_of_words[i].substring(1,arr_of_words[i].length()-1)).length()+
                                ""+
                                arr_of_words[i].charAt(arr_of_words[i].length()-1);
            }

        }
        //display
        showArr(arr_of_words);
    }
    //data-displayer
    public static void showArr(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
