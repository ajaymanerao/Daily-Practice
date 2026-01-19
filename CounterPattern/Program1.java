package CounterPattern;

public class Program1 {
    public static void P1(int N){
        int num=1;
        int row=5;
        for(int i=1;i<=N;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num++;
                
            }
            
            System.out.println();
        }

    }



    public static void main(String[] args) {
        P1(5);
        
    }
    
}
