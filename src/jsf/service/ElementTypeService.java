package jsf.service;

import jsf.domain.ElementType;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface ElementTypeService {
    public void add(ElementType elementType);
    public List<ElementType> getAll();
}
