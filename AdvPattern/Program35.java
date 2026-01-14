// 11111
//  2222
//   333
//    44
//     5
//    44
//   333
//  2222
// 11111


package AdvPattern;

public class Program35 {

     public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for (int j = 1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=N;j>=i;j--){
                    System.out.print(i);
                }
            }else{
                 for (int j = 1; j <=2*N-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=(i-N)+1;j++){
                    System.out.print(2*N-i);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }

    
}
