package jsf.service.impl;

import jsf.dao.ItemOfBookDao;
import jsf.domain.ItemOfBook;
import jsf.service.ItemOfBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marij on 9/24/2016.
 */

@Service
@Repository
public class ItemOfBookServiceImpl implements ItemOfBookService {

    @Autowired
    private ItemOfBookDao itemOfBookDao;

    @Override
    public List<ItemOfBook> getAll() {
        return itemOfBookDao.getAll();
    }

    @Override
    public void AddItem(ItemOfBook itemOfBook) {
        itemOfBookDao.AddItem(itemOfBook);
    }

    @Override
    public void deleteItem(ItemOfBook itemOfBook) {

    }
}
