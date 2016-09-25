package jsf.dao;

import jsf.domain.Worker;

import java.util.List;

/**
 * Created by mmilcic on 5.7.2016..
 */
public interface WorkerDAO {
    public void addWorker(Worker worker);
    public List<Worker> listWorkers();
    public Worker getWorker(int workerId);
}
