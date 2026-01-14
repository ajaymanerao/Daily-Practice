public class Temperature {

    public static void main(String[] args) {
        int arr[]={40,45,35,20,25,50,52,56,70};
         

        for(int i=0;i<arr.length;i++){
        int large=arr[i];
            for(int j=i+1;j<=i+2;j++){
              if(large<arr[j]){
                large=arr[j];
              
            }
        }

        System.out.println(large);
            }
        }
    }
    

