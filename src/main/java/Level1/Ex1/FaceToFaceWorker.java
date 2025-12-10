package Level1.Ex1;

import java.time.LocalDateTime;

public class FaceToFaceWorker extends Worker {
    private static final double GAS_COST = 300;

    public FaceToFaceWorker(String name, String surname, double pricePerHour) {
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
        return (getPricePerHour() * monthlyWorkedHours) +  GAS_COST;
    }
}
