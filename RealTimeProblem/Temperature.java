package RealTimeProblem;
import java.util.Scanner;

public class Temperature {
    public static void allTemperatue(int arr[][]){ 
    System.out.println("Time(AM/PM)"+" "+"Temperature");
    for(int i=0;i<arr.length;i++){
        String time=(arr[i][2]==0)? "AM" :"PM";
        System.out.print(arr[i][0]+" "+time+"\t:   "+arr[i][1]+"°C |");
    }
    }

    public static void maxTemp(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i][1]){
                 max=arr[i][1];
            }
        }
        System.out.println("Maximum Temperatue is : "+max+"°C");
    }

    public static void minTemp(int arr[][]){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max>arr[i][1]){
                 max=arr[i][1];
            }
        }
        System.out.println("Maximum Temperatue is : "+max+"°C");
    }

    public static void avgTemp(int arr[][]){
        int sumAM=0;
        int countAM=0;
        int sumPM=0;
        int countPM=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][2]==0){
                sumAM+=arr[i][1];
                countAM++;
            }else{
                sumPM +=arr[i][1];
                countPM++;
            }

        }
        int avgAM=sumAM/countAM;
        System.out.println("Average Temp in AM: "+avgAM);
        int avgPM=sumPM/countPM;
        System.out.println("Average Temp in PM :"+avgPM);

        int avg=(avgAM+avgPM)/2;
        System.out.println("Average Temp in a day: "+avg);
    }

     public static void rainCheck(int arr[][]){
         System.out.println("Rain Time : ");
        for(int i=0;i<arr.length;i++){
            String time=(arr[i][2]==0)? "AM" :"PM";
            if(arr[i][1]<10){
                 int temp=arr[i][1];
                 System.out.print(arr[i][0]+time+" : "+temp+"°C | ");
            }
             
        }
         
    }

    public static void countRain(int arr[][]){
       int count=0;
        for(int i=0;i<arr.length;i++){
            String time=(arr[i][2]==0)? "AM" :"PM";
            if(arr[i][1]<10){
                count++;
            }
        }
           System.out.println("Number Of times rain: "+count);
         
    }


    public static void main(String[] args) {
        //int AM=0;
        //int PM=1;
        //{Time, Temperature, AM/PM}
        int arr[][]={{1,15,0},{2,18,0},{3,20,0},{4,20,0},{5,21,0},{6,22,0},{7,8,0},{8,23,0},{9,24,0},{10,25,0},{11,26,0},{11,28,0}, {12,30,0},
                    {1,31,1},{2,33,1},{3,44,1},{4,43,1},{5,38,1},{6,34,1},{7,30,1},{8,28,1},{9,15,1},{10,9,1},{11,9,1},{11,12,1}, {12,13,1}};


       System.out.println("1. Print All Temperatue.");
       System.out.println("2. Print Maximum Temperatue.");
       System.out.println("3. Print Minimum Temperature.");
       System.out.println("4. Average Temperature in a Day.");
       System.out.println("5. Rain check.");
       System.out.println("6. Number of of times rain comes in a day.");

       Scanner sc=new Scanner(System.in);
       int choice=sc.nextInt();
       switch (choice) {
        case 1:
            allTemperatue(arr);
            break;
        case 2:
            maxTemp(arr);
            break; 
            
        case 3:
            minTemp(arr);
            break;
        case 4:
            avgTemp(arr);
            break;       
            
        case 5:
            rainCheck(arr);
            break; 
        case 6:
            countRain(arr);
            break;       
       
        default:
            break;
       }
    }
    
}
