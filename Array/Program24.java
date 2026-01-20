package Array;

public class Program24 {
    public static void program24(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int sum=0;
            int digit=0;
            while(num!=0){
                int d=num%10;
                sum +=d;
                digit++;
                num /=10;
            }

            arr[i]=sum/digit;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[]= {123,235,6754,3257,64,2367,288,35,645,374,56};
        program24(arr);
        
    }
    
    
}
