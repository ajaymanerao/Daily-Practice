import java.util.*;
public class MAIN{

public static void main(String [] args){

EVM evm=new EVM();
Scanner sc=new Scanner(System.in);

evm.powerOn();
evm.displayParties();

System.out.print("Enter number of voters: ");
int voters=sc.nextInt();

for(int i=0;i<voters;i++){
System.out.print("Enter vote on below parties: ");
int vote=sc.nextInt();
evm.GiveVote(vote);
}

System.out.println ();
System.out.println ("--------------***Final Vote Counting***---------------------- ");
evm.countVotes();
System.out.println();
System.out.println("---------------***WINNER***--------------------- ");

evm.showWinner();
}


}