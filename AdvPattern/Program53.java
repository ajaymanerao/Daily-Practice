package AdvPattern;

public class Program53 {
     public static void P1(int N){
        for(int i=1;i<=N;i++){
            
                //int count=2;
                if(i==1){
                    for(int j=1;j<=N;j++){
                        System.out.print(j);

                    }
                    for(int k=N-1;k>=1;k--){
                        System.out.print(k);
                    }
                    
                    System.out.println();

                }else{
                    for(int x=i;x<=N;x++){
                        System.out.print(x);

                    }
                    for(int y=1;y<=(2*i)-3;y++){
                        System.out.print(" ");
                    }
                    for(int z=N;z>=i;z--){
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
