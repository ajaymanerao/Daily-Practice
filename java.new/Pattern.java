import java.util.Scanner;

public class Pattern {
    public static void PrintNumber(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }


public static void PrintRev(int N){
    int num=N;

    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num);
        }
        System.err.println();
        num--;

    }
} 

public static void PrintIncNumb(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void Printrev(int N){
    for(int i=1;i<=N;i++){
        for(int j=i;i>=1;i--){
            System.out.print(j);
        }
        System.out.println();
        i++;
    }
}

// 1
// 22
// 333
// 4444
// 55555

public static void Program2(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
    }
}

// 5
// 44
// 333
// 2222
// 11111

public static void Program3(int N){
    for(int i=N; i>=1; i--){
        for(int j=1; j<=(N-i+1);j++){
            System.out.print(i);
        }
        System.out.println();
    }
}

// 1
// 12
// 123
// 1234
// 12345

public static void Program4(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

// 1
// 21
// 321
// 4321
// 54321

public static void Program5(int N){
    for(int i=1;i<=N;i++){
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void Progarm6(int N){
    for(int i=N;i>=1;i--){
      for(int j=1;j<=(N-i+1);j++){
       System.out.print(i);
    }
    System.out.println();
    } 
} 

// 5
// 54
// 543
// 5432
// 54321

public static void Program7(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=N-i+1;j--){
            System.out.print(j);
        }  
    System.out.println();
    }
}

// 5
// 44
// 333
// 2222
// 11111

public static void Program8(int N){
    for(int i=N;i>=1;i--){
        for(int j=i;j<=N;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}   

// A
// BB
// CCC
// DDDD
// EEEEE

public static void Program9(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+i));
        }
        System.out.println();
    }
}

// e
// dd
// ccc
// bbbb
// aaaaa

public static void Program10(int N){
    for(int i=N;i>=1;i--){
        for(int j=1;j<=N-i+1;j++){
            System.out.print((char)(96+i));
        }
        System.out.println();
    }
}

// A
// AB
// ABC
// ABCD
// ABCDE


public static void Program11(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+j));
        }
        System.out.println();
    }
}


// a
// ba
// cba
// dcba
// edcba

public static void Program12(int N){
    for(int i=1;i<=N;i++){
        for(int j=i;j>=1;j--){
            System.out.print((char)(96+j));
        }
        System.out.println();
    }
}


// E
// ED
// EDC
// EDCB
// EDCBA

public static void Program13(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=N-i+1;j--){
            System.out.print((char)(64+j));
        }
        System.out.println();
    }
}


// *****
// ****
// ***
// **
// *
public static void Program14(int N){
    for(int i=N;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


// 11111
// 2222
// 333
// 44
// 5

public static void Program15(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=i;j--){
            System.out.print(i);
        }
        System.out.println();
    }
}


// 55555
// 4444
// 333
// 22
// 1

public static void Program16(int N){
    for(int i=N;i>=1;i--){
        for(int j=N;j>=N-i+1;j--){
            System.out.print(i);

        }
        System.out.println();
    }
}

// 12345
// 1234
// 123
// 12
// 1
public static void Program17(int N){
    for(int i=N;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }

}

// 12345
// 2345
// 345
// 45
// 5
public static void Program18(int N){
    for(int i=1;i<=N;i++){
        for(int j=i;j<=N;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

// 54321
// 4321
// 321
// 21
// 1
public static void Program19(int N){
    for(int i=N;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
    }
}


// 54321
// 5432
// 543
// 54
// 5

public static void Program20(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=i;j-- ){
            System.out.print(j);
        }
        System.out.println();
    }
}

// ABCDE
// ABCD
// ABC
// AB
// A
public static void Program21(int N){
    for(int i=N;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+j));
        }
        System.out.println();

    }
}

// AAAAA
// BBBB
// CCC
// DD
// E

public static void Program22(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=i;j--){
            System.out.print((char)(64+i));
        }
        System.out.println();

    }
}

// edcba
// edcb
// edc
// ed
// e

public static void Program23(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=i;j--){
            System.out.print((char)(96+j));
        }
        System.out.println();

    }
}


// eeeee
// dddd
// ccc
// bb
// a

public static void Program24(int N){
    for(int i=N;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print((char)(96+i));
        }
        System.out.println();

    }
}

//     *
//    **
//   ***
//  ****
// *****

public static void Program25(int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
}

//     1
//    22
//   333
//  4444
// 55555
public static void Program26(int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();

    }
}

//     5
//    44
//   333
//  2222
// 11111

public static void Program27(int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(N-i+1);
        }
        System.out.println();

    }
}

//     1
//    21
//   321
//  4321
// 54321

public static void Program28(int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();

    }
}

//     1
//    12
//   123
//  1234
// 12345

public static void Program29(int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();

    }
}

//     5
//    54
//   543
//  5432
// 54321

public static void Program30(int N){
    for(int i=N;i>=1;i--){
        for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=N;j>=i;j--){
            System.out.print(j);
        }
        System.out.println();

    }
}

//     5
//    45
//   345
//  2345
// 12345

public static void Program31(int N){
    for(int i=N;i>=1;i--){
        for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j<=N;j++){
            System.out.print(j);
        }
        System.out.println();

    }
}

//     A
//    AB
//   ABC
//  ABCD
// ABCDE
public static void Program32 (int N){
    for(int i=N;i>=1;i--){
        for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=1;j<=N-i+1;j++){
            System.out.print((char)(64+j));
        }
        System.out.println();

    }
}

//     A
//    BB
//   CCC
//  DDDD
// EEEEE

public static void Program33 (int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+i));
        }
        System.out.println();

    }
}

//     e
//    dd
//   ccc
//  bbbb
// aaaaa

public static void Program34(int N){
     for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print((char)(96+(N-i+1)));
        }
        System.out.println();

    }
}

// *****
//  ****
//   ***
//    **
//     *

public static void Program35(int N){
    for(int i=1;i<=N;i++){
         for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=N;j>=i;j--){
            System.out.print( "*");
        }
        System.out.println();

    }
}


// 11111
//  2222
//   333
//    44
//     5
public static void Program36(int N){
    for(int i=1;i<=N;i++){
         for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=N;j>=i;j--){
            System.out.print(i);
        }
        System.out.println();

    }
}


// 54321
//  5432
//   543
//    54
//     5

public static void Program37(int N){
    for(int i=1;i<=N;i++){
         for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=N;j>=i;j--){
            System.out.print(j);
        }
        System.out.println();

    }
}

// 55555
//  4444
//   333
//    22
//     1
public static void Program38(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();

    }
}

// 12345
//  1234
//   123
//    12
//     1

public static void Program39(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();

    }
}

// 54321
//  4321
//   321
//    21
//     1

public static void Program40(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();

    }
}

// 54321
//  5432
//   543
//    54
//     5

public static void Program41(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=N;j>=N-i+1;j--){
            System.out.print(j);
        }
        System.out.println();

    }
}




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int N=sc.nextInt();
        //PrintNumber(N);
        //PrintRev(N);
        //PrintIncNumb(N);
        int N=5;
         //Printrev(N);
         //Program2(N);
         //Program3(N);
         //Program4(N);
         //Program5(N);
         //Progarm6(N);
         //Program7(N);
         //Program8(N);
         //Program9(N);
         //Program10(N);
         //Program11(N);
         //Program12(N);
         //Program13(N);
         //Program14(N);
         //Program15(N);
         //Program16(N);
         //Program17(N);
         //Program18(N);
         //Program19(N);
         //Program20(N);
         //Program21(N);
         //Program22(N);
         //Program23(N);
         //Program24(N);
         //Program25(N);
         //Program26(N);
         //Program27(N);
         //Program28(N);
         //Program29(N);
         //Program30(N);
         //Program31(N);
         //Program32(N);
         //Program33(N);
         //Program34(N);
         //Program35(N);
         //Program36(N);
         //Program37(N);
         //Program38(N);
         //Program39(N);
         //Program40(N);
          Program41(N);
    }
}

 