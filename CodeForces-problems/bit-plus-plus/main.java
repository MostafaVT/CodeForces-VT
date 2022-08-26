import java.util.*;
public class main {
    public static void main(String[] args) {
        //input-data
        Scanner sc = new Scanner(System.in);
        int stat_num = sc.nextInt();
        String arr_cmds[] = new String[stat_num];
        for(int i=0;i<stat_num;i++){
            arr_cmds[i] = sc.next();
        }
        //BASE
        int x_val = 0;
        for(int i=0;i<stat_num;i++){
            if(arr_cmds[i].equalsIgnoreCase("X++")||
                arr_cmds[i].equalsIgnoreCase("++X")){

                x_val++;   

            }else{

                x_val--;

            }
        }
        System.out.println(x_val);
    }
}
