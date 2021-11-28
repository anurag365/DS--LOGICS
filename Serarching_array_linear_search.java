import java.security.Key;
import java.util.Scanner;

public class Serarching_array_linear_search {

 public static int linearsearch(int[]arr, int element){
     for(int i=0;i<arr.length;i++){
             if(arr[i]==element){


                return i;
             }



     }

     return-1;
}

   

    public static void main(String[] args) {

        int[] a={20,10,33,55,570};
        int element =33;
        System.out.println(element + " is found at index " +  linearsearch(a, element));
    }
}
