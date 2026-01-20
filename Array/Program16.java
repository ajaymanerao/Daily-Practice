package Array;

public class Program16 {
    public static void program16(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("("+arr[i]+","+arr[j]+") = "+sum);
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int arr[]={4,8,12,16};
        int sum=20;
        program16(arr, sum);
    }
    
}
