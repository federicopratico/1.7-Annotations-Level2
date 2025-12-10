package Level1.Ex2;

import Level1.Ex1.OnlineWorker;

public class DeprecatedExample {
    OnlineWorker onlineWorker;
    public DeprecatedExample(OnlineWorker onlineWorker) {
        this.onlineWorker = onlineWorker;
    }
    
    @SuppressWarnings({})
    public double getOnlineWorkerSalary(double hours) {
        return  onlineWorker.calculatePlainSalary(hours);
    }
    
}
