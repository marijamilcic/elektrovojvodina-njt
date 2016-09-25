package jsf.service.impl;

import jsf.dao.AllocationDao;
import jsf.domain.Allocation;
import jsf.service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class AllocationServiceImpl  implements AllocationService{

    @Autowired
    private AllocationDao allocationDao;
    @Override
    public void add(Allocation allocation) {
        allocationDao.add(allocation);
    }

    @Override
    public List<Allocation> getAll() {
        return allocationDao.findAll();
    }
}
