package AdvPattern;

public class Program58 {
    public static void P1(int N){
     for(int i=N;i>=1;i--){
            
                //int count=2;
                if(i==1){
                
                        for(int k=5;k>=1;k--){
                            System.out.print(k);
                        }
                        for(int l=2;l<=N;l++  ){
                            System.out.print(l);
                        }
                     
                     
                    
                    System.out.println();

                }else{
                    for(int x=N-i+1;x>=1;x--){
                        System.out.print(x);

                    }
                    for(int y=1;y<=(2*i)-3;y++){
                        System.out.print(" ");
                    }
                    for(int z= 1;z<=N-i+1;z++){
                        System.out.print(z);

                    }
                    System.out.println();
                
                     
                }
                 

            
             
        }
    }
    public static void main(String[] args) {
        P1(5);
    }
    
}
