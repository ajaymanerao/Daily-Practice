package Array;

public class MergeArray {
    public static void mergeArray(int arr1[], int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        int a=m+n;
        int arr3[]=new int[a];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr3[m+i]=arr2[i];
        }

        for(int x:arr3){
        System.out.print(x+" ");
        }

    }


    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        mergeArray(arr1, arr2);

    }
    
}
