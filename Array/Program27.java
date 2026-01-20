package Array;

public class Program27 {
    public static void program27(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int newnum=arr[i];
            int sum=0;
            while(num!=0){
                int d=num%10;
                sum +=d;
                num /=10;
            }

            arr[i]=newnum*10+sum;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[]= {123,235,6754,3257,64,2367,288,35,645,374,56};
        program27(arr);
        
    }
    
    
}
