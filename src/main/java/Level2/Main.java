package Level2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jhon", "Doe", 45);
        Person p1 = new Person("Alvaro", "Sanchez", 34);

        try {
            JSONSerialize.serialize(p);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try {
            JSONSerialize.serialize(p1);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
