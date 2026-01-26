package Array;

public class Program20 {
    public static void program20(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int digit=0;
           

            int firstdigit=num;
            while(firstdigit>=10){
                firstdigit=firstdigit/10;
                digit++;
            }

            int power=(int)Math.pow(10, digit);  //1234
            int rem=num%power;                     //1234%1000=234
            arr[i]=rem*10+firstdigit;              //234*10+1=2341
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374};
        program20(arr);

    }
    
}
