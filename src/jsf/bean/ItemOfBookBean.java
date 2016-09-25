package jsf.bean;

import jsf.domain.ItemOfBook;
import jsf.service.ItemOfBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@ManagedBean(name="itemBookBean")
@Scope
@Component
public class ItemOfBookBean {

    @Autowired
    private ItemOfBookService itemOfBookService;
    private ItemOfBook itemOfBook;

    public ItemOfBookService getItemOfBookService() {
        return itemOfBookService;
    }

    public void setItemOfBookService(ItemOfBookService itemOfBookService) {
        this.itemOfBookService = itemOfBookService;
    }

    public ItemOfBook getItemOfBook() {
        return itemOfBook;
    }

    public void setItemOfBook(ItemOfBook itemOfBook) {
        this.itemOfBook = itemOfBook;
    }

    public ItemOfBookBean() {
        itemOfBook = new ItemOfBook();
    }

    public List<ItemOfBook> getList(){
        return itemOfBookService.getAll();
    }

    public void add(){
        itemOfBookService.AddItem(itemOfBook);
    }

    public void delete(){
        itemOfBookService.deleteItem(itemOfBook);
    }
}
