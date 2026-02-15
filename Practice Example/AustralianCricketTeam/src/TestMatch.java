class TestMatch extends Game{

double calculateIncome(int numGames){
return numGames*50000;
}

double calculateBonus(String performance, String grade){
if(performance.equals("best")){
return 20000;
}else if(performance.equals("good")){
return 10000;
}else{
return 5000;
}
}
}