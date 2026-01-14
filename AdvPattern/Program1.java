// 1
// 22
// 333
// 4444
// 55555
// 4444
// 333
// 22
// 1

package AdvPattern; 
public class Program1 {

public static void P1(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
     for(int i=N-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        P1(5);
        
    }
    
}
