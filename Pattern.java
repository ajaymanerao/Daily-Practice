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

// abcde
// abcd
// abc
// ab
// a

public static void Program24A(int N){
    for(int i=N;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print((char)(96+j));
        }
        System.out.println();
    }
}


// EDCBA
// EDCB
// EDC
// ED
// E

public static void Program24B(int N){
    for(int i=1;i<=N;i++){
        for(int j=N;j>=i;j--){
            System.out.print((char)(64+j));
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


//     a
//    ba
//   cba
//  dcba
// edcba

public static void Program34A(int N){
    for(int i=1;i<=N;i++){
        for(int sp=N;sp>i;sp--){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print((char)(96+j));
        }
        System.out.println();

    }

}

//     E
//    ED
//   EDC
//  EDCB
// EDCBA

public static void Program34B(int N){
    for(int i=N;i>=1;i--){
        for(int sp=i;sp>1;sp--){
            System.out.print(" ");
        }
        for(int j=N;j>=i;j--){
            System.out.print((char)(64+j));
        }
        System.out.println();

    }

}


//     e
//    de
//   cde
//  bcde
// abcde


public static void Program34C(int N){
    for(int i=N;i>=1;i--){
        for(int sp=i;sp>1;sp--){
            System.out.print(" ");
        }
        for(int j=i;j<=N;j++){
            System.out.print((char)(96+j));
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
        for(int j=1;j>=N-i+1;j--){
            System.out.print(j);
        }
        System.out.println();

    }
}

// 12345
//  2345
//   345
//    45
//     5

public static void Program42(int N){
    for(int i=1;i<=N;i++){
        

       for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j<=N;j++){
            System.out.print(j);
        }
        System.out.println();

    }
}


// AAAAA
//  BBBB
//   CCC
//    DD
//     E

public static void Program43(int N){
    for(int i=1;i<=N;i++){
        

       for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j<=N;j++){
            System.out.print((char)(64+i));
        }
        System.out.println();

    }
}

// eeeee
//  dddd
//   ccc
//    bb
//     a

public static void Program44(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print((char)(96+i));
        }
    System.out.println();

    }
}

// ABCDE
//  ABCD
//   ABC
//    AB
//     A

public static void Program45(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+j));
        }
    System.out.println();

    }
}

// abcde
//  bcde
//   cde
//    de
//     e


public static void Program46(int N){
    for(int i=1;i<=N;i++){
       for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j<=N;j++){
            System.out.print((char)(96+j));
        }
    System.out.println();

    }
}

// EDCBA
//  EDCB
//   EDC
//    ED
//     E

public static void Program47(int N){
    for(int i=1;i<=N;i++){
       for(int sp=1;sp<i;sp++){
            System.out.print(" ");
        }
        for(int j=N;j>=i;j--){
            System.out.print((char)(64+j));
        }
    System.out.println();

    }
}

// edcba
//  dcba
//   cba
//    ba
//     a

public static void Program48(int N){
    for(int i=N;i>=1;i--){
         for(int sp=1;sp<=N-i;sp++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print((char)(96+j));
        }
    System.out.println();

    }
}

// 11111
// 00000
// 11111
// 00000
// 11111

public static void Program49(int N){
    for(int i=1;i<=N;i++){
        if(i%2==0){
            for(int j=1;j<=N;j++){
                System.out.print("0");
            } 
        }else{
            for(int j=1;j<=N;j++){
                System.out.print("1");
            }
        }
    System.out.println();
    }
    
}

// 10101
// 10101
// 10101
// 10101
// 10101

public static void Program50(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(j%2==0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    }
    
}

// bbbbb
// CCCCC
// ddddd
// EEEEE


public static void Program51(int N){
    for(int i=1;i<=N;i++){
        if(i%2==0){
            for(int j=1;j<=N;j++){
                System.out.print((char)(96+i));
            } 
        }else{
            for(int j=1;j<=N;j++){
                System.out.print((char)(64+i));
            }
        }
    System.out.println();
    }
    
}


// EEEEE
// ddddd
// CCCCC
// bbbbb
// AAAAA

public static void Program52(int N){
    for(int i=N;i>=1;i--){
        if(i%2==0){
            for(int j=1;j<=N;j++){
                System.out.print((char)(96+i));
            } 
        }else{
            for(int j=1;j<=N;j++){
                System.out.print((char)(64+i));
            }
        }
    System.out.println();
    }
    
}

// AbCdE
// AbCdE
// AbCdE
// AbCdE
// AbCdE

public static void Program53(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(j%2==0){
                System.out.print((char)(96+j));
            }else{
                System.out.print((char)(64+j));
            }
        }
        System.out.println();
    }
    
}


// EdCbA
// EdCbA
// EdCbA
// EdCbA
// EdCbA

public static void Program54(int N){
    for(int i=N; i>=1;i--){
        for(int j=N;j>=1;j--){
            if(j%2==0){
                System.out.print((char)(96+j));
            }else{
                System.out.print((char)(64+j));
            }
        }
    System.out.println();

    }
}

// 11111
// AAAAA
// 11111
// BBBBB
// 11111


public static void Program55(int N){
    int temp=1;
    for(int i=1;i<=N;i++){ 
        if(i%2==0){
             
            for(int j=1;j<=N;j++){
                System.out.print((char)(64+temp));  
            } 
            temp++;   
        }else{
            for(int k=1;k<=N;k++){
                System.out.print("1");
            }
        }
    System.out.println(); 
       
    }
    
}

// *****
// *   *
// *   *
// *   *
// *****

public static void Program56(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(i==1 || j==1 || i==5 || j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

// 11111
// 10001
// 10001
// 10001
// 11111


public static void Program57(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(i==1 || j==1 || i==5 || j==5){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

// 11111
// 11111
// 11011
// 11111
// 11111

public static void Program58(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(i==3 && j==3){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    }
}

// 11011
// 11011
// 00000
// 11011
// 11011

public static void Program59(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(i==3 || j==3){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        
        System.out.println();
    }
}

// 01110
// 10001
// 10001
// 10001
// 01110
public static void Program60(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
            if(i == 1 || i == N || j == 1 || j == N){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    }
}


// 1
// 10
// 101
// 1010
// 10101

public static void Program61(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            if(j%2==0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    }
}


// 1
// 00
// 111
// 0000
// 11111

public static void Program62(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            if(i%2==0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.println();
    }
}

// 1
// 11
// 101
// 1001
// 11111

public static void Program63(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            if(i==3 && j==2 || (i==4 && j==2) || (i==4 && j==3) ){
                System.out.print("0");
            }else{
                System.out.print("1");
            }

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
         //Program24A(N);
         //Program24B(N);
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
         //Program34A(N);
         //Program34B(N);
         //Program34C(N);
         //Program35(N);
         //Program36(N);
         //Program37(N);
         //Program38(N);
         //Program39(N);
         //Program40(N);
         //Program41(N);
         //Program42(N);
         //Program43(N);
         //Program44(N);
         //Program45(N);
         //Program46(N);
         //Program47(N);
         //Program48(N);
         //Program49(N);
         //Program50(N);
         //Program51(N);
         //Program52(N);
         //Program53(N);
         //Program54(N);
         //Program55(N);
         //Program56(N);
         //Program57(N);
         //Program58(N);
         //Program59(N);
         //Program60(N);
         //Program61(N);
         //Program62(N);
         Program63(N);
    }
}

 