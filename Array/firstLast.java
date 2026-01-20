package Array;

public class firstLast {
    public static void firstLast(int arr[]){
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
        firstLast(arr);

    }
    
}
