package Array;

public class Program21 {
    public static void program21(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num= arr[i];
            int newnum=0;
            while(num!=0){
                int d=num%10;
                newnum=newnum*10+d;
                num /=10;
            }

            arr[i]=newnum;
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }


    }



    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374};
        program21(arr);

        
    }
    
}
