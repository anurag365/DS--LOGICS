import java.util.Scanner;

 public class reverse_Array {
    
    public static void main(String[] args)
    {
        int arr[]={5,25,62,50,655};

    System.out.println("Original array");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.print("\n");

    System.out.println("ARRAY IN REVERSE ORDER");
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i] + " ");

    }
    }

}
