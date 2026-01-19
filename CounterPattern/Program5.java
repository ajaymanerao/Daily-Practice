package CounterPattern;

public class Program5 {
    public static void P1(int N){
        //int num=1;
        for(int i=1;i<=N;i++){
            int num=i;
            int gap=N-1;

            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num=num+gap;
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}
