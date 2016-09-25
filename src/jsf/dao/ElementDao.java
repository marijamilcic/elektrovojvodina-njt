package jsf.dao;

import jsf.domain.Element;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface ElementDao {
    public void add(Element element);
    public List<Element> findAll();
}
