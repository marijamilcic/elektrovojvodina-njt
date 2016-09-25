package jsf.service;

import jsf.domain.Worker;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface WorkerService {
    public void addWorker(Worker worker);
    public List<Worker> listWorkers();
    public Worker getWorker(int workerId);
}
