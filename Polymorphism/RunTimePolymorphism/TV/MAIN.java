public class MAIN{
public static void main(String [] args){
TV tv=new TV();
tv.turnOn();
tv.setChannel(75);
tv.setVolume(5);
tv.channelUp();
tv.volumeUp();
tv.getTVDetails();
}
}


/*
command:-----
C:\Users\Ajay\Desktop\VM\Polymorphism\RunTimePolymorphism\TV
javac MAIN.java
java MAIN

output:------
Channel :76
TV Volume :6
TV on/off :true
*/


