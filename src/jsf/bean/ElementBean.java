package jsf.bean;

import jsf.domain.Element;
import jsf.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@ManagedBean(name="elementBean")
@Scope
@Component
public class ElementBean {
    @Autowired
    private ElementService elementService;
    private Element element;

    public ElementService getElementService() {
        return elementService;
    }

    public void setElementService(ElementService elementService) {
        this.elementService = elementService;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }
    public ElementBean(){
        element = new Element();
    }

    public void addElement(){
        elementService.add(element);
        element = new Element();
    }

    public List<Element> getElementList(){
        return elementService.findAll();
    }
}
