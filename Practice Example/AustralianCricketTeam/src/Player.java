class Player{
private String name;
private int age;
private String gender;
private int numGames;
private String performance;
private String grade;


Player(String name, int age, String gender, int numGames, String performance, String grade){
this.name=name;
this.age=age;
this.gender=gender;
this.numGames=numGames;
this.performance=performance;
this.grade=grade;
}

public void displayDetails(String matchType){
Game game;

if(matchType.equals("TestMatch")){
game =new TestMatch();
}else{
game =new WorldCup();
}

double income = game.calculateIncome(numGames);
double bonus = game.calculateBonus(performance, grade);


System.out.println("Player Name: " + name);
System.out.println("Age: " + age);
System.out.println("Gender: " + gender);
System.out.println("Match Type: " + matchType);
System.out.println("Income: " + income);
System.out.println("Bonus: " + bonus);
} 
}