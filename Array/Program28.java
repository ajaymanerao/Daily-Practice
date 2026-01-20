package Array;

public class Program28 {
    public static void program28(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num%4==0){
                arr[i]= -1;
            }else if(num%5==0){
                arr[i]= -2;
            }else if( num%4==0 && num%5==0){
                arr[i]= -3;
            }else{
                arr[i]= num;
            }

             

        }
         

    }
    

    public static void main(String[] args) {
        int arr[]= {10,14,24,12,18,26,20,23,22,15,26};
        program28(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
