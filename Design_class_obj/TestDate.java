package Design_class_obj;

class Date{
    private int year;
    private int month;
    private int day;

    private boolean isvalidDay(int day){
        return day >= 1 && day <= 31;  
    }

    private boolean isvalidMonth(int month){
         return month >= 1 && month <= 12;
    }

    private boolean isvalidYear(int year){
        return year >= 1000 && year <= 9999;
    }


    Date(int year,int month, int day){
        setDate(year, month, day);
    }
    int getYear(){
        return year;
    }
    int getMonth(){
        return month;
    }

    int getDay(){
        return day;
    }

    void setYear(int year){
        if(isvalidYear(year)){
            this.year=year;
        }else{
            System.out.println("Invalid Year");
        }
    }

    void setMonth(int month){
        if (isvalidMonth(month)) {
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }
    }

    void setDay(int day){
         if (isvalidDay(day)) {
            this.day = day;
        } else {
            System.out.println("Invalid Day");
        }
    }

    public String toString(){
       return String.format("%02d/%02d/%04d", month, day, year);
    }
    
    void setDate(int year,int month, int day){
        if(isvalidYear(year) && isvalidMonth(month) && isvalidDay(day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }else{
            System.out.println("Invalid Date");
        }
    }
}


public class TestDate {
    public static void main(String[] args) {
        Date d=new Date(2003,5,28);
        System.out.println("Day: "+d.getDay());
        System.out.println("Month: "+d.getMonth());
        System.out.println("Year: "+d.getYear());
        System.out.println("Date: "+d);
         

    }
    
}
