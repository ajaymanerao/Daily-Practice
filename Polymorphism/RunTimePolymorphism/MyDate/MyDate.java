public class MyDate{
private int year;
private int month;
private int day;
public static final String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun",
                                       "Jul","Aug","Sep","Oct","Nov","Dec"};
public static final String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday",
                                     "Thursday","Friday","Saturday"};
public static final int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

public boolean isLeapYear(int year){
if((year%4==0 && year % 100 != 0) || (year % 400 == 0)){
return true;
}
return false;
}

public boolean isValidDate(int year, int month, int day){
if(month<1 || month>12){
return false;
}

int maxDays=DAYS_IN_MONTHS[month-1];
if(month==2 && isLeapYear(year)){
maxDays=29;
}

return day>=1 && day <=maxDays;
}

public MyDate(int year, int month, int day){
this.year=year;
this.month=month;
this.day=day;
}

public void setDate(int year, int month, int day){
this.year=year;
this.month=month;
this.day=day;
}

public int getYear(){
return year;
}

public int getMonth(){
return month;
}

public int getDay(){
return day;
} 

public void setYear(int year){
this.year=year;
}

public void setMonth(int month){
this.month=month;
}

public void setDay(int day){
this.day=day;
}

public MyDate nextDay(){
day++;
int max=DAYS_IN_MONTHS[month-1];
if(month==2 && isLeapYear(year)){
max=29;
}
if(day>max){
day=1;
nextMonth();
}
return this;
}

public MyDate nextMonth(){
month++;
if (month > 12) {
month = 1;
year++;
}
return this;
}

public MyDate nextYear() {
year++;
return this;
}

public MyDate previousDay(){
day--;
if(day<1){
previousMonth();
day=DAYS_IN_MONTHS[month-1];
}
return this;
}

public MyDate previousMonth(){
month--;
if(month<1){
month=12;
year--;
}
return this;
}

public MyDate previousYear(){
year--;
return this;
}

public void getMyDateDetails(){
System.out.println("Year  : " + year);
System.out.println("Month : " + MONTHS[month - 1]);
System.out.println("Day   : " + day);
System.out.println("Next day :"+nextDay());
System.out.println("Next month :"+nextMonth());
System.out.println("Next year :"+nextYear());
}


}