#include <iostream>
#include <string>
using namespace std;


// int recRevana(int x){
//     if (x==0){
//         return 1;
//     }else{
//         if(x>9){
//             return res*(x%10);
//         }
//     }

// }




int main(){

   int x = 1403;
   int res = 1;
   int rem;
   bool flag = true;

  while (x!=0){

    while(flag){
        if(!(x%10==0)){
            x = x /10;
        }else{
            flag=false;
        }        
    }

    res = res * (x % 10);
    x = x / 10;
   
     

  }
  cout<<res;

 
   

   

    return 0;
}