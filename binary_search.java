import java.util.Scanner;

public class binary_search {
    public static void main(String[] args){

        int arr[]={2,4,6,8,10,12,15,19,23,26};
        int search_item = 19;
        int li=0;
        int hi= arr.length-1;
        int mi= (li+hi)/2;

        while(li<=hi){

        
        if(arr[mi]==search_item){

            System.out.println("element is found at" + mi + "index position");
            break;
        }
        else if(arr[mi]<search_item){
            li = mi+1;

        }
        else{
            hi=mi-1;
        }
        mi=(li+hi)/2;
    }
    if(li>hi){
        System.out.println("Element not found");
    }
         
        

        
    }

}
