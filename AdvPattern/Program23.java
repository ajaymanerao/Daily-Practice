//     1
//    12
//   123
//  1234
// 12345
//  1234
//   123
//    12
//     1


package AdvPattern;

public class Program23 {

    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*N)-i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1(5);
        
    }

    
}
