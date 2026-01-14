import java.util.*;
public class Assignment1 {


// Q1. Day of the Week Write a program that takes an integer (1–7) and prints the corresponding day of the week using a switch statement. 
// Example: Input 1 → Output Monday.

    public static void Program1(int N){
        switch (N) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break; 
            case 5:
                System.out.println("Friday");
                break; 
            case 6:
                System.out.println("Saturday");
                break;  
            case 7:
                System.out.println("Sunday");
                break;            
            default:
                System.out.println("This day does not Exit");
                break;
        }
    }

// Q2. Month Name Write a program that takes an integer (1–12) and prints the corresponding month name. 
// Example: Input 12 → Output December.

    public static void Program2(int N){
        switch (N) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
                
            case 3:
                System.out.println("March");
                break;
                
            case 4:
                System.out.println("April");
                break;
                
            case 5:
                System.out.println("May");
                break;
                
            case 6:
                System.out.println("June");
                break;
                
            case 7:
                System.out.println("July");
                break;
                
            case 8:
                System.out.println("Aug");
                break;
                
            case 9:
                System.out.println("Sept");
                break;
                
            case 10:
                System.out.println("Oct");
                break;
                
            case 11:
                System.out.println("Nov");
                break; 
            case 12:
                System.out.println("Dec");
                break;       
        
            default:
                System.out.println("This Month does not exit");
                break;
        }

    }


//  Q3. Calculator Write a program that takes two numbers and an operator (+, -, *, /)
//  and performs the calculation using a switch statement. Example: Input 10, 5, * → Output 50.

    public static void Program3(int num1, int num2, char symbol){
        switch(symbol){
            case '+':
                System.out.println(num1+num2);
                break;
             case '-':
                System.out.println(num1+num2);
                break;
             case '*':
                System.out.println(num1+num2);
                break;
             case '/':
                System.out.println(num1+num2);
                break;
             case '%':
                System.out.println(num1+num2);
                break;
            default:
                System.out.println("This is not operator");
                break;                  

        }
    }

// Q4. Grade Evaluation Write a program that takes a character grade (A, B, C, D, F)
// and prints a message like “Excellent”, “Good”, “Average”, “Poor”, “Fail” using switch.

    public static void Program4(char letter){
        switch(letter){
            case 'A':
                System.out.println("Average");
                break;
             case 'B':
                System.out.println("Bottle");
                break;
             case 'c':
                System.out.println("Cat");
                break;
             case 'D':
                System.out.println("Dog");
                break;
             case 'E':
                System.out.println("Elephant");
                break;
            default:
                System.out.println("This is letter is not present");
                break;                  

        }
    }

// Q5. Traffic Light Write a program that takes a string (Red, Yellow, Green) 
// and prints the action (Stop, Ready, Go) using switch.

    public static void Program5(String color){
        switch(color){
            case "Red":
                System.out.println("Stop");
                break;
             case "Yellow":
                System.out.println("Ready");
                break;
             case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("This is letter is not present");
                break;                  

        }
    }

// Q6. Vowel or Consonant Write a program that takes a character input 
// and uses switch to check if it is a vowel (a, e, i, o, u) or a consonant.

     public static void Program6(char letter){
        switch(letter){
            case 'a':
                System.out.println("It is a vowel");
                break;
             case 'e':
                System.out.println("It is a vowel");
                break;
             case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;        
            default:
                System.out.println("It's not vowel it a consonant");
                break;                  

        }
    }

// Q8. Number to Word Write a program that takes a digit (0–9) 
// and prints its word form. Example: Input 4 → Output Four.


    public static void Program8(int N){
        switch (N) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
                
            case 3:
                System.out.println("Three");
                break;
                
            case 4:
                System.out.println("Four");
                break;
                
            case 5:
                System.out.println("Five");
                break;
                
            case 6:
                System.out.println("Six");
                break;
                
            case 7:
                System.out.println("Seven");
                break;
                
            case 8:
                System.out.println("Eight");
                break;
                
            case 9:
                System.out.println("Nine");
                break;
                
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("This Month does not exit");
                break;
        }

    }




    
    public static void Program9(int N){
        switch (N) {
            case 1:
                System.out.println("Jan-Winter ");
                break;
            case 2:
                System.out.println("Feb-Winter ");
                break;
                
            case 3:
                System.out.println("March-Summer");
                break;
                
            case 4:
                System.out.println("April-Summer");
                break;
                
            case 5:
                System.out.println("May-Summer");
                break;
                
            case 6:
                System.out.println("June-Monsoon");
                break;
                
            case 7:
                System.out.println("July-Monsoon");
                break;
                
            case 8:
                System.out.println("Aug-Monsoon");
                break;
                
            case 9:
                System.out.println("Sept-Autumn");
                break;
                
            case 10:
                System.out.println("Oct-Autumn");
                break;
                
            case 11:
                System.out.println("Nov-Autumn");
                break; 
            case 12:
                System.out.println("Dec-Winter ");
                break;       
        
            default:
                System.out.println("This Month does not exit");
                break;
        }

    }




    





 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int N=sc.nextInt();
        //Program1(N);
        //Program2(N);
        // int num1=sc.nextInt();
        // int num2=sc.nextInt();
        // char symbol=sc.next().charAt(0);
        // Program3(num1, num2, symbol);
        //char letter=sc.next().charAt(0);
        //Program4(letter);
        //String color=sc.next();
        //Program5(color);
        //char letter=sc.next().charAt(0);
        //Program6(letter);
        //int N=sc.nextInt();
        //Program8(N);
        int N=sc.nextInt();
        Program9(N);




    }
}
