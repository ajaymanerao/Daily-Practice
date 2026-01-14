package AdvPattern;

public class Program8 {

    public static void P1(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=i;j--){
            if(j%2==0){
                System.out.print((char)(96+j));

            }else{
                System.out.print((char)(64+j));
            }
             
        }
        System.out.println();
    }
     for(int i=N-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            if(j%2==0){
                System.out.print((char)(96+j));

            }else{
                System.out.print((char)(64+j));
            }
        }
        System.out.println();
    }
    
}

    public static void main(String[] args) {
        P1(5);
        
    }
    
}
