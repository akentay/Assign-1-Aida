import java.util.ArrayList;
import java.util.List;

public class Neighbor {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String group;
    private String colour;
    private String nation;

    public Neighbor(String name, String surname, int age, String email,
                    String group, String colour, String nation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.group = group;
        this.colour = colour;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return name + " " + surname + " | Age: " + age +
                " | Email: " + email +
                " | Group: " + group +
                " | Colour: " + colour +
                " | Nation: " + nation;
    }

    public static Neighbor createNeighbor(String name, String surname, int age, String email,
                                          String group, String colour, String nation) {
        return new Neighbor(name, surname, age, email, group, colour, nation);
    }

    public static void main(String[] args) {
        List<Neighbor> neighbors = new ArrayList<>();

        neighbors.add(createNeighbor("Aigerim", "Smailova", 25, "aigerim@mail.com", "A1", "Blue", "Kazakh"));
        neighbors.add(createNeighbor("Ivan", "Petrov", 30, "ivan.petrov@mail.com", "B2", "Green", "Russian"));
        neighbors.add(createNeighbor("John", "Smith", 28, "john.smith@mail.com", "C3", "Red", "American"));

        for (Neighbor n : neighbors) {
            System.out.println(n);
        }
    }
}
