import java.util.*;
public class PA1EX1{
    public class LinearArray{
        int itemCount;
        int array[];
        public LinearArray(int maxSize){
            itemCount=0;
            array = new int[maxSize];
        }
        public void insertLast(int x){
            if(itemCount<array.length){
                array[itemCount++]=x;
            }else{
                System.out.println("Array is Full");
            }
        }
        public void insertFirst(int x) {
            if(itemCount<array.length){
                for(int i=itemCount;i>0;i--) {
                    array[i]=array[i-1];
                }
                array[0]=x;
                itemCount=x;    //wot??
            }else{
                System.out.println("Array is Full");
            }
        }
        public int linearSearch(int x) {
            for(int i=0;i<itemCount;i++) {
                if(array[i]==x) {
                    return i;
                }
            }
            return -1;
        }
        public void delete(int x) {
            int pos = this.linearSearch(x); //why this.?
            if(pos == -1) {
                System.out.println("NOT FOUND!");
            }else {
                for(int i=pos;i<itemCount-1;i++) {
                    array[i]=array[i+1];
                }
                itemCount--;
            }
        }
        public void displayArray() {
            System.out.println("Array: ");
            for(int i=0;i<itemCount;i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        
    
    }
}
