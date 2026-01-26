package TwoArray;

public class MinorDigSum {
    public static void minorDig(int arr[][]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i][n-1-i];
        }
        System.out.println("Sum of minor diagonal: "+sum);
    } 

    public static void main(String[] args) {
        int arr[][]={{1,0,2,3},{4,5,6,7},{8,9,1,2},{3,4,5,6}};
        minorDig(arr);
    }
    
}
