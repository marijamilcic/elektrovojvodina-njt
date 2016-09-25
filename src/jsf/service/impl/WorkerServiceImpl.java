package jsf.service.impl;

import jsf.dao.WorkerDAO;
import jsf.domain.Worker;
import jsf.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerDAO workerDAO;

    @Override
    public void addWorker(Worker worker) {
        workerDAO.addWorker(worker);
    }

    @Override
    public List<Worker> listWorkers() {
        return workerDAO.listWorkers();
    }

    @Override
    public Worker getWorker(int workerId) {
        return workerDAO.getWorker(workerId);
    }
}
