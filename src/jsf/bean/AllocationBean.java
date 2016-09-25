package jsf.bean;

import jsf.dao.AllocationDao;
import jsf.domain.Allocation;
import jsf.model.Student;
import jsf.service.AllocationService;
import jsf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@ManagedBean(name="allocationBean")
@Scope
@Component
public class AllocationBean {
    @Autowired
    private AllocationService allocationService;
    private Allocation allocation;

    public AllocationService getAllocationService() {
        return allocationService;
    }

    public void setAllocationService(AllocationService allocationService) {
        this.allocationService = allocationService;
    }

    public Allocation getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    public AllocationBean(){
        allocation = new Allocation();
    }

    public void addAlloation(){
        allocationService.add(allocation);
        allocation = new Allocation();
    }

    public List<Allocation> getAllocationList(){
        //return new ArrayList<Student>();
        return allocationService.getAll();
    }
}
