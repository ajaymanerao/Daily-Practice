package AdvPattern;

public class Program51 {
    public static void P1(int N){
        for(int i=N;i>=1;i--){
            
                //int count=2;
                if(i==5){
                    for(int j=1;j<=2*N-1;j++){
                    System.out.print(i);
                     
                    }
                    System.out.println();

                }else{
                    for(int x=1;x<=i;x++){
                        System.out.print(i);

                    }
                    for(int y=1;y<=2*(N-i)-1;y++){
                        System.out.print(" ");
                    }
                    for(int z=1;z<=i;z++){
                        System.out.print(i);

                    }
                    System.out.println();
                
                     
                }
                 

            
             
        }
    }



    public static void main(String[] args) {
        P1(5);
        
    }
    
}
