package Array;

public class Program23 {
    public static void program23(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int sum=0;
            while(num!=0){
                int d=num%10;
                sum +=d;
                num /=10;
            }

            arr[i]=sum;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[]= {123,235,6754,3257,64,2367,288,35,645,374,56};
        program23(arr);
        
    }
    
}
