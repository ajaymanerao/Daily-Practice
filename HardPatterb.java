import java.security.SecurityPermission;

public class HardPatterb {


// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15   

    public static void counterPattern(int N){
        int count=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }

    }

// 15  
// 14      13
// 12      11      10
// 9       8       7       6
// 5       4       3       2       1

    public static void counterPattern1(int N){
        int count=N*(N+1)/2;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count--;
            }
            System.out.println();
        }

    }

// 1
// 3       2
// 6       5       4
// 10      9       8       7
// 15      14      13      12      11


     public static void counterPattern2(int N){
       int cnt=1;
        for(int i=1;i<=N;i++){
            int c=cnt;

            for(int j=1;j<=i;j++){
                 
                System.out.print(c+"\t");
                c--;
                
            }
            cnt =cnt+(i+1);
            System.out.println();
        }

    }

// 15
// 13      14
// 10      11      12
// 6       7       8       9
// 1       2       3       4       5    


      public static void counterPattern3(int N){
        int count=N*(N+1)/2;

        for(int i=1;i<=N;i++){
            int c=count;

            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c++;
            }
            count=count-(i-1);
            System.out.println();
        }

    }

// 1
// 2       6
// 3       7       10
// 4       8       11      13
// 5       9       12      14      15

    
      public static void counterPattern4(int N){
        int count=1;

        for(int i=N;i>=1;i--){
            int c=count;

            for(int j=N;j>=i;j--){
                
                System.out.print(c+"\t"); 
                c=c+(j-1);
                
            }
            count++;
            System.out.println();
            

        }

    }

// 5
// 4       9
// 3       8       12
// 2       7       11      14
// 1       6       10      13      15


     public static void counterPattern5(int N){
        int count=N;

        for(int i=N;i>=1;i--){
            int c=count;

            for(int j=N;j>=i;j--){
                
                System.out.print(c+"\t"); 
                c=c+(j);
                
            }
            count--;
            System.out.println();
            

        }

    }


    public static void main(String[] args) {
        int N=5;
        //counterPattern(N);
        //counterPattern1(N);
        //counterPattern2(N);
        //counterPattern3(N);
        //counterPattern4(N);
        counterPattern5(N);
        
    }
    
}
