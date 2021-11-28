import java.util.Scanner;

public class Array_deletion {

    public static void main(String[] args)
    {
    int arr[]={10,20,40,30,60};
    int delete_element=20;

    for(int i=0;i<arr.length;i++){

if(delete_element==arr[i]){

    for(int j=i;j<arr.length-1;j++){

        arr[j]=arr[j+1];

}
break;

}

    }

    for(int i=0;i<arr.length-1;i++){

System.out.print(arr[i]  + " ");

    }
    }
}
