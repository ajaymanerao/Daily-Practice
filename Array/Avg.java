package Array;

public class Avg {
    public static void avgArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        int avg=sum/arr.length;
        for(int i=0;i<arr.length;i++){
            if(avg<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,7,9,2,6};
        avgArray(arr);   
    }   
}
