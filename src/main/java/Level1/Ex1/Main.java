package Level1.Ex1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Joe", "Cipriani", 25.60);
        OnlineWorker onlineWorker = new OnlineWorker("Jane", "Capriati", 30.20);
        FaceToFaceWorker faceToFaceWorker = new FaceToFaceWorker("Alan", "Rossi", 17.50);

        double workedHours = 160;

        System.out.println("//////// WORKER ////////");
        System.out.println("Worker Name: " + worker.getName());
        System.out.println("Worker Surname: " + worker.getSurname());
        System.out.println("Worker Salary/hour: " + worker.getPricePerHour());
        System.out.println("Worker Salary: " + worker.calculateSalary(workedHours));

        System.out.println("//////// FACE TO FACE WORKER ////////");
        System.out.println("FaceToFace Name: " + faceToFaceWorker.getName());
        System.out.println("FaceToFace Surname: " + faceToFaceWorker.getSurname());
        System.out.println("FaceToFace Salary/hour: " + faceToFaceWorker.getPricePerHour());
        System.out.println("FaceToFace Salary: " + faceToFaceWorker.calculateSalary(workedHours));

        System.out.println("//////// ONLINE WORKER ////////");
        System.out.println("OnlineWorker Name: " + onlineWorker.getName());
        System.out.println("OnlineWorker Surname: " + onlineWorker.getSurname());
        System.out.println("OnlineWorker Salary/hour: " + onlineWorker.getPricePerHour());
        System.out.println("OnlineWorker Salary: " + onlineWorker.calculateSalary(workedHours));

    }
}
