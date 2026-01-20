package Array;

public class program14 {
    public static void program13(int arr[]){
        //arr[0]=Integer.MIN_VALUE;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

//-------------------------OR----------------------------
     

   public static void program13b(int arr[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println(max);
   }





    public static void main(String[] args) {
        int arr[]={12,45,67,23,89,34};
        program13b(arr);
    }
    
}
