import java.util.Scanner;




public class Array_insertion {

    public static void main(String[] args) {
    int arr[] ={10,20,30,40,50};
    int pos=2;
    int element= 85;

        for (int i = arr.length-1; i >pos-1; i--) {
            arr[i] = arr[i-1];
            
        }
        arr[pos-1]= element;
        for(int i=0;i<arr.length;i++){

            System.out.println( arr[i]);
        }

    

        
       
    }
}
