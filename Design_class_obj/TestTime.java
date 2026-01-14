package Design_class_obj;

class Time{
    private int second=0;
    private int minute=0;
    private int  hour=0;

    boolean isvalidSecond(){
        return second>=0 && second <=59;
    }

     boolean isvalidMinute(){
        return minute>=0 && minute <=59;
    }

     boolean isvalidHour(){
        return hour>=0 && hour <=23;
    }

    Time(){}
    Time(int second, int minute, int hour){
        setTime(second, minute, hour);
    }

    int getHour(){
        return hour;
    }

    int getSecond(){
        return second;
    }

    int getMinute(){
        return minute;
    }

    void setHour(int hour){
        this.hour=hour;
    }

    void setMinute(int minute){
        this.minute=minute;
    }

    void setSecond(int second){
        this.second=second;
    }

    public String toString(){
        return hour+":"+minute+":"+second;
    }

    void setTime(int second, int minute, int hour){
        if(isvalidSecond() && isvalidMinute() && isvalidHour()){
            this.second=second;
            this.minute=minute;
            this.hour=hour;
        }else{
            System.out.println("Invalid Time format");
        }
    }


}

public class TestTime {
    public static void main(String[] args) {
        
        Time t=new Time(155, 15, 52);
        System.out.println(t);

    }
    
}
