package CounterPattern;

public class Program2 {
    public static void P1(int N){
        int num=N*(N+1)/2;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num--;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}
