import java.util.*;
    class LinearArray{
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
                itemCount++;                       
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
        public void delete(int x) {                    // fake deletion ?! , yeah
                                                         // ___---> cuz it just not printing it LOL XD!!
            int pos = this.linearSearch(x);         //why (this.) ?
            if(pos == -1) {
                System.out.println("NOT FOUND!");
            }else {
                for(int i=pos;i<itemCount-1;i++) {
                    array[i] = array[i+1];
                }
                itemCount--;
            }
        }
        public void displayArray() {
            for(int i=0;i<itemCount;i++) {                  //array.length if we want to see the actual array
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
}
public class PA1EX1{
    public static void main(String[] args){
  
        LinearArray a = new LinearArray(10);

        a.insertLast(3);
        a.insertLast(7);
        a.insertFirst(8);

        a.displayArray();

        System.out.println("Count: " + a.itemCount);
        System.out.println("Position of 8: " + a.linearSearch(8));
        System.out.println("Position of 5: " + a.linearSearch(5));

        a.delete(33);
        a.delete(3);

        a.displayArray();

        System.out.println("Count: " + a.itemCount);

    }
}
