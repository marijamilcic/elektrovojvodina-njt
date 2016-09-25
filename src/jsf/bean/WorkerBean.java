package jsf.bean;

import jsf.domain.Worker;
import jsf.service.WorkerService;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.print.DocFlavor;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="workerBean")
@Scope
@Component
public class WorkerBean {

    @Autowired
    private WorkerService workerService;
    private Worker worker;

    private String name;

    private String surname;

    private String proffesionalsm;

    private String status;

    List<Worker> workers;

    public String getProffesionalsm() {
        return proffesionalsm;
    }

    public void setProffesionalsm(String proffesionalsm) {
        this.proffesionalsm = proffesionalsm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Saved"));
    }

//    public void reset() {
//        RequestContext.getCurrentInstance().;
//    }

    public void resetFail() {

        worker.name = null;
        worker.surname=null;
        worker.professionalism=null;
        worker.status=null;

        FacesMessage msg = new FacesMessage("Model reset, but it won't work properly.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public WorkerService getWorkerService() {
        return workerService;
    }

    public void setWorkerService(WorkerService workerService) {
        this.workerService = workerService;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public WorkerBean() {
        worker = new Worker();
    }

    @PostConstruct
    public void init(){
        workers = workerService.listWorkers();
    }

    public void addWorker(){
        workerService.addWorker(worker);
    }

    public Worker getWorker(int workerId){
       return workerService.getWorker(workerId);
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
