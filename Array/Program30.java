package Array;

public class Program30 {
    public static void program30(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]); 
            arr[i]=diff;
        }

        for(int j=0;j<arr.length-1;j++){
            System.out.print(arr[j]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46};
        program30(arr);

    }
    
}
