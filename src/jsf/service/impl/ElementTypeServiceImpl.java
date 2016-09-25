package jsf.service.impl;

import jsf.dao.ElementTypeDao;
import jsf.domain.Element;
import jsf.domain.ElementType;
import jsf.service.ElementService;
import jsf.service.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class ElementTypeServiceImpl implements ElementTypeService{

    @Autowired
    private ElementTypeDao elementTypeDao;


    @Override
    public void add(ElementType elementType) {
        elementTypeDao.add(elementType);
    }

    @Override
    public List<ElementType> getAll() {
        return elementTypeDao.findAll();
    }
}
