package AdvPattern;

public class Program55 {
    public static void P1(int N){
     for(int i=N;i>=1;i--){
            
                //int count=2;
                if(i==1){
                    for(int j=1;j<=2*N-i;j++){
                        if(j<=N){
                            System.out.print(j);

                        }else{
                            //for(int a=N-1;a>=1;a--){
                                System.out.print(2*N-j);

                            //}
                        }
                     
                     
                    }
                    System.out.println();

                }else{
                    for(int x=1;x<=N-i+1;x++){
                        System.out.print(x);

                    }
                    for(int y=1;y<=(2*i)-3;y++){
                        System.out.print(" ");
                    }
                    for(int z=N-i+1;z>=1;z--){
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
