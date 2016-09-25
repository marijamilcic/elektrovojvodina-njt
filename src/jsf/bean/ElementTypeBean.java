package jsf.bean;

import jsf.domain.ElementType;
import jsf.service.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
@ManagedBean(name="elementTypeBean")
@Scope
@Component
public class ElementTypeBean {
    @Autowired
    private ElementTypeService elementTypeService;
    private ElementType elementType;

    public ElementTypeService getElementTypeService() {
        return elementTypeService;
    }

    public void setElementTypeService(ElementTypeService elementTypeService) {
        this.elementTypeService = elementTypeService;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }
    public ElementTypeBean(){
        elementType = new ElementType();
    }

    public void addElementType(){
        elementTypeService.add(elementType);
        elementType = new ElementType();
    }

    public List<ElementType> getElementTypeList(){
        return elementTypeService.getAll();
    }
}
