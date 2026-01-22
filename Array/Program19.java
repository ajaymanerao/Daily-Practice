package Array;

public class Program19 {
    public static void program19(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int lastdigit=num%10;

            int firstdigit=num;
            while(firstdigit>=10){
                firstdigit=firstdigit/10;
            }

            arr[i]=firstdigit*10+lastdigit; 
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374};
        program19(arr);

    }
    
}
