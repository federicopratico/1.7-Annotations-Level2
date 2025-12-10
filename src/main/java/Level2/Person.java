package Level2;

@SerializeToJSON(directory = ".")
public class Person {
    String name;
    String surname;
    int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
