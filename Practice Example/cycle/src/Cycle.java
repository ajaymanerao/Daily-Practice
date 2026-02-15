public class Cycle{
void ride(){
System.out.println("Cycle is ride");
}
}

class Unicycle extends Cycle{
void ride(){
System.out.println("Riding a Unicycle with one wheel");
}
}

class Bicycle extends Cycle{
void ride(){
System.out.println("Riding a Bicycle with two wheel");
}
}

class Tricycle extends Cycle{
void ride(){
System.out.println("Riding a Tricycle with three wheels");
}

}