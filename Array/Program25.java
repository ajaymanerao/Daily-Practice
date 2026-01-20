package Array;

public class Program25 {
    public static void program25(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int rev=0;
            while(num!=0){
                int d=num%10;
                rev=rev*10+d;
                num/=10;
            }

            arr[i]=rev;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
        program25(arr);
        
    }
    
}
