package jsf.dao;

import jsf.domain.ItemOfBook;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */
public interface ItemOfBookDao {
    public List<ItemOfBook> getAll();
    public void AddItem(ItemOfBook itemOfBook);
    public void deleteItem(ItemOfBook itemOfBook);
}
