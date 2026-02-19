package Practice;
import java.util.Arrays;

public class CountFreqInArray {
   public static void countFreqArray(int arr[]){
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        int count=0;
        for(int j=i;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        i=i+(count-1);
        System.out.println(arr[i]+" : "+count);
    }
}

          

     
     
      
    



 

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,1};
        countFreqArray(arr);
    }
    
}
