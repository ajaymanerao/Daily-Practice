package Array;

public class Program17 {
    public static void program17(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println("("+arr[i]+", "+arr[j]+", "+arr[k]+") = "+sum);
                    }
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[]={3,6,9,12,15};
        int sum=30;
        program17(arr, sum);
        
    }
    
}
