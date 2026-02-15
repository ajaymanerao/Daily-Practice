class WorldCup extends Game{


double calculateIncome(int numGames){
return numGames *100000;
}

double calculateBonus(String performance, String grade){
if(performance.equals("best")){
return 30000;
}else if(performance.equals("good")){
return 20000;
}else{
return 10000;
}
}
}