package CounterPattern;

public class Program4 {
    public static void P1(int N){
        int num=1;
        int start=N*(N+1)/2;
        for(int i=1;i<=N;i++){
            int temp= start-i+1;
            for(int j=1;j<=i;j++){
                System.out.print(temp+"\t");
                temp++;
            }
            start=start-i;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}
