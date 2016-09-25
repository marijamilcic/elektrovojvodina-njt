package jsf.service;

import jsf.domain.Allocation;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface AllocationService {
    public void add(Allocation allocation);
    public List<Allocation> getAll();
}
