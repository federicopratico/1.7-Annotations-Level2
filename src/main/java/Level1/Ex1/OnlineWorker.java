package Level1.Ex1;

public class OnlineWorker extends Worker {
    private static final double FLAT_INTERNET_RATE = 50.60;

    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    /**
     * @deprecated
     * @param monthlyWorkedHours
     * @return
     */
    @Deprecated
    public double calculatePlainSalary(double monthlyWorkedHours) {
        return getPricePerHour() * monthlyWorkedHours;
    }

    @Override
    public double calculateSalary(double monthlyWorkedHours) {
        return (getPricePerHour() * monthlyWorkedHours) + FLAT_INTERNET_RATE;
    }
}
