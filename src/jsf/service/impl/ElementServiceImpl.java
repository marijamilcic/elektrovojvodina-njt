package jsf.service.impl;

import jsf.dao.ElementDao;
import jsf.domain.Element;
import jsf.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@Service
@Repository
public class ElementServiceImpl implements ElementService{
    @Autowired
    private ElementDao elementDao;

    @Override
    public void add(Element element) {
        elementDao.add(element);
    }

    @Override
    public List<Element> findAll() {
        return elementDao.findAll();
    }
}
