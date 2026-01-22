package Array;

public class Program31 {
    public static void program31(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                int temp=arr[i];
                arr[i]= arr[arr.length-j];
                arr[arr.length-j]=temp;
            }
        }
    }


    public static void reversewithoutThirdVariable(int arr[]){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

        }
    } 

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={11,22,33,44};
        display(arr);
    
        
    }
    
}