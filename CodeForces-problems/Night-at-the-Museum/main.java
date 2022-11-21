import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                       'n','o','p','q','r','s','t','u','v','w','x','y','z',
                      };
        String input = sc.nextLine();
        int i=0,j=0,k=25,clockwise_prev=0,anti_clockwise_prev=0;
        int anti_clockwise_moves = 0,clockwise_moves = 0;
        int res=0;
        boolean anti_clockwise_flag,clockwise_flag;
        while(input.length() > i){
            clockwise_flag=true;
            anti_clockwise_flag=true;
            while(clockwise_flag){
                if(j < alph.length){
                    if(input.charAt(i)!=alph[j]){
                        j++;
                        clockwise_moves++;
                    }else{
                        clockwise_prev = j;
                        clockwise_flag=false;
                    }
                }else{
                    int n;
                    for ( n = 0; n< alph.length ; n++) {
                        if(input.charAt(i)!=alph[n]){
                            clockwise_moves++;
                        }else{
                            clockwise_prev = n;
                            break;
                        }
                    }
                    clockwise_flag=false;
                }
            }
            System.out.println("clockwise_moves: "+clockwise_moves);
            while(anti_clockwise_flag){
                if(k>-1){
                    if(input.charAt(i)!=alph[k] ){
                        k--;
                        anti_clockwise_moves++;      
                    }else{
                        anti_clockwise_prev = k;
                        anti_clockwise_flag=false;
                    }
                }else{
                    int n;
                    for ( n = alph.length-1; n > 0 ; n--) {
                        if(input.charAt(i)!=alph[n]){
                            anti_clockwise_moves++;
                        }else{
                            anti_clockwise_prev = n;
                            break;
                        }
                    }
                    anti_clockwise_flag=false;
                }
            }
            System.out.println("anti_clockwise_moves: "+anti_clockwise_moves);
            if(anti_clockwise_moves<clockwise_moves){
                res+=anti_clockwise_moves;
                if(k==-1 & j==26){
                    k=0;
                    j=25;
                }else if(k==-1){
                    k=0;
                    j=anti_clockwise_prev;
                }else if(j==26){
                    k=anti_clockwise_prev;
                    j=25;
                }else{
                    k = anti_clockwise_prev;
                    j = anti_clockwise_prev;
                }
            }else{
                res+=clockwise_moves;
                if(k==-1 & j==26){
                    k=0;
                    j=25;
                }else if(k==-1){
                    k=0;
                    j=clockwise_prev;
                }else if(j==26){
                    k=clockwise_prev;
                    j=25;
                }else{
                    k = clockwise_prev;
                    j = clockwise_prev;
                }
            }
            i++;
        }
        System.out.println(res);


//--------------------------------------------------------------------------------------------------

        // for ( i = 0; i < input.length(); i++) {
        //     clockwise_moves=0;
        //     for ( j = pointer; input.charAt(i)!=alph[j]; j--) {
        //        // System.out.println("x1");

        //         if (j<=0){
        //             for (l =  alph.length; input.charAt(i)!=alph[l-1]; l--) {   
        //                 clockwise_moves++;
        //                 //System.out.println("x2");
        //             }
        //             clockwise_prev = l;
        //             break;
        //         }else{
        //             clockwise_moves++;
        //             clockwise_prev = j;
        //         }
        //     }
        //     anti_clockwise_moves=0;
        //     for ( k = pointer; input.charAt(i)!=alph[j]; k++) {
        //         //System.out.println("y");

        //         if (k>=alph.length-1){
        //             for (m =  0; input.charAt(i)!=alph[m]; m++) {   
        //                 anti_clockwise_moves++;
        //                // System.out.println("y");

        //             }
        //             anti_clockwise_prev = m;
        //             break;
        //         }else{
        //             anti_clockwise_moves++;
        //             anti_clockwise_prev = k;
        //         }
        //     }
        //     if(anti_clockwise_moves<clockwise_moves){
        //         res+=anti_clockwise_moves;
        //         pointer = anti_clockwise_prev;
        //     }else{
        //         res+=clockwise_moves;
        //         pointer = clockwise_prev;
        //     }
        // }
        //System.out.println(res);
    }
}
