package Level1.Ex1;

public class Worker {
    private String name;
    private String surname;
    private double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public double calculateSalary(double workedHours) {
        return pricePerHour * workedHours;
    }
}
