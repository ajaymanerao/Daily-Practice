class EVM extends Machine implements VoteProcess{

private String [] parties={"BJP", "Congress", "NCP", "ShivSena", "AAP"};

private int[] votes=new int[5];

public void displayParties(){
for(int i=0;i<parties.length;i++){
System.out.println((i+1)+"-"+parties[i]);
}
}

public void GiveVote(int partyId){
if(partyId>=1 && partyId<=5){
votes[partyId-1]++;
totalVotes++;
System.out.println("Vote Successfully!");
}else{
System.out.println("Invalid Party!");
}
}

public void countVotes(){
 
System.out.println("Vote Counting");
for(int i=0; i<parties.length;i++){
System.out.println(parties[i]+" : "+votes[i]);
}
}


public void showWinner(){
int max=votes[0];
int winnerIndex=0;
for(int i=1;i<votes.length;i++){
if(votes[i]>max){
max=votes[i];
winnerIndex=i;
}
}

System.out.println("Winner is : "+parties[winnerIndex]+"  Congratulations!");
}
}