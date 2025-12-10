package Level1.Ex2;

import Level1.Ex1.OnlineWorker;

public class Main {
    public static void main(String[] args) {
        OnlineWorker o = new OnlineWorker("J", "P", 34.4);
        DeprecatedExample de = new DeprecatedExample(o);

        System.out.println(de.getOnlineWorkerSalary(160));
    }
}
