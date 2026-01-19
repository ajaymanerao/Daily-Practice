package AdvPattern;

public class Program54 {
     public static void P1(int N){
        for(int i=1;i<=N;i++){
            
                //int count=2;
                if(i==1){
                     for(int j=N;j>=1;j--){
                        System.out.print(j);

                    }
                    for(int k=2;k<=N;k++){
                        System.out.print(k);
                    }
                    
                    
                    System.out.println();

                }else{
                    for(int x=N;x<=N-i+1;x++){
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
