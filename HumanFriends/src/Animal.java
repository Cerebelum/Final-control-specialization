import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Animal {

    String name;
    LocalDate birthDate;
    List<String> commands;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }
}