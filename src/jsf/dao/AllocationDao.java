package jsf.dao;

import jsf.domain.Allocation;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface AllocationDao {
    public void add(Allocation allocation);
    public List<Allocation> findAll();
}
