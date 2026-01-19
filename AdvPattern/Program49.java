package AdvPattern;
public class Program49 {
     public static void P1(int N){
        int val=N;
        for(int i=1;i<=2*N;i++){
            if(i<=N){
                for(int j=N;j>i;j--){
                    System.out.print(" ");
                }
                
                for(int j=1;j<=(2*i-1);j++){
                    if(j<=i){
                        System.out.print(j);
                    }else{
                        System.out.print(2*i-j);
                    }
                }
                      
                    
            }
            else{
                for(int sp=1;sp<i-N;sp++){
                    System.out.print(" ");
                }
                
                for(int j=1;j<=2*val-1;j++){
                    if(j<=i){
                        System.out.print(j);
                    }else{
                        System.out.print(2*i-j);
                    }
                     
                }
                val--;

            }
            System.out.println();
                 
            } 
             
        }

    


    public static void main(String[] args) {
        P1(5);
        
    }
    
    
}
