// AAAAA
//  bbbb
//   CCC
//    dd
//     E
//    dd
//   CCC
//  bbbb
// AAAAA


package AdvPattern;

public class Program41 {
     public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){

                 
                for (int j = 1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=N;j>=i;j--){
                    if(i%2==0){
                        System.out.print((char)(96+i));
                    }else{
                        System.out.print((char)(64+i));
                    }
                    
                }
            }else{
                 for (int j = 1; j <=2*N-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=(i-N)+1;j++){
                    if(i%2==0){
                        System.out.print((char)(96+(2*N-i)));
                    }else{
                        System.out.print((char)(64+(2*N-i)));
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
