package Practice;

import java.util.Arrays;

public class UniqueElement {
    public static void UniqueElement(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            i=i+(count-1);
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,4,5,4,6,7,8,2};
        UniqueElement(arr);
    }
}
