package AdvPattern;

public class program59 {
    public static void P1(int N){
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                for(int j=1;j<=N;j++){
                    for(int k=1;k<=N;k++){
                        System.out.print("*");
                    }
                    for(int sp=1;sp<=N;sp++){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }else{
                 for(int j=1;j<=N;j++){
                    for(int sp=1;sp<=N;sp++){
                        System.out.print(" ");
                    }
                    for(int k=1;k<=N;k++){
                        System.out.print("*");
                    }
                     

                     
               }
 

            }
            System.out.println();
           
        }
        
    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}
