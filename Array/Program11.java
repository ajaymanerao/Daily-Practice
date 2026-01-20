package Array;

public class Program11 {

    public static void program11(int arr[]){
        int n=arr.length;
        //arr[0]=arr[0]+arr[n-1];
        //arr[n-1]=arr[0]-arr[n-1];
        //arr[0]=arr[0]-arr[n-1];
     
        for(int i=0;i<arr.length-1;i++){
             arr[i]=arr[i]+arr[i+1];
             arr[i+1]=arr[i]-arr[i+1];
             arr[i]=arr[i]-arr[i+1];
            
        }

        
         

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        program11(arr);
        
    }
    
}
