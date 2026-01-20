package Array;

public class Program18 {
    public static void program18(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            while(num>=10){
                num /=10;
            }

             arr[i]=num;
        }


        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

    }

    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374};
        program18(arr);

        
    }
    
}
