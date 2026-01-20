package Array;

public class Program12 {
    public static void program12(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i]+arr[i-1];
            arr[i-1]=arr[i]-arr[i-1];
            arr[i]=arr[i]-arr[i-1];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        //50 10 20 30 40 
        int arr[]={10,20,30,40,50};
        program12(arr);
        
    }
    
}
