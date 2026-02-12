package Practice;
import java.time.LocalDate;

public final class  ImmutableStudent {
    private final int id;
    private final String name;
    private final LocalDate dateOfBirth;
    private final int age;

    public ImmutableStudent(int id, String name, LocalDate dateOfBirth, int age) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Id: " + id +"\n"+
               "Name: " + name +"\n"+
               "Date Of Birth: " + dateOfBirth +"\n"+
               "Age: " + age;
    }

    public static void main(String[] args) {

        ImmutableStudent s1 = new ImmutableStudent(101, "Ajay",LocalDate.of(2003, 5, 28),  23);
        System.out.println(s1);
    }
}
