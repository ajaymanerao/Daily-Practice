package Array;

public class Program29 {
     public static void program29(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num%6==0){
                arr[i]= -1;
            }else if(containSix(num)){
                arr[i]= -2;
            }else if( num%6==0 && containSix(num)){
                arr[i]= -3;
            }else{
                arr[i]= num;
            }

        }
         
    }

    public static boolean containSix(int num){
        while(num>0){
            if(num%10==6){
                return true;

            }
            num /=10;

        }
        return false;
    }
    

    public static void main(String[] args) {
        int arr[]= {15,23,18,26,72,36,49,38,60,17,22,46};
        program29(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
