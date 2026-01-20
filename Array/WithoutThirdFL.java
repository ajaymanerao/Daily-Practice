package Array;

// A[0]=A[0]+A[1]; //1=n+1  or n-1 according condition
// A[1]=A[0]-A[1];
// a[0]=A[0]-A[1];

public class WithoutThirdFL {
    public static void firstLast(int arr[]){
        int n=arr.length;
            arr[0]=arr[0]+arr[n-1];
            arr[n-1]=arr[0]-arr[n-1];
            arr[0]=arr[0]-arr[n-1];

        for(int i=0;i<arr.length;i++){
             
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={7,14,21,28,35};
        firstLast(arr);  
    }
    
}
