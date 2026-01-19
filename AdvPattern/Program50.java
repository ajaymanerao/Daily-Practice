package AdvPattern;

public class Program50 {
    public static void P1(int N){
        for(int i=1;i<=N;i++){
            
                //int count=2;
                if(i==1){
                    for(int j=1;j<2*N-i;j++){
                    System.out.print(i);
                     
                    }
                    System.out.println();

                }else{
                    for(int x=i;x<=N;x++){
                        System.out.print(i);

                    }
                    for(int y=1;y<=(2*i)-3;y++){
                        System.out.print(" ");
                    }
                    for(int z=i;z<=N;z++){
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
