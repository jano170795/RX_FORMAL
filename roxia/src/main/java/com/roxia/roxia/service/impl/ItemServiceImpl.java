package com.roxia.roxia.service.impl;


import com.roxia.roxia.model.ItemRx;
import com.roxia.roxia.repository.ItemRepo;
import com.roxia.roxia.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private ItemRepo repoItem;
    public ItemServiceImpl(ItemRepo repoItem){
        this.repoItem = repoItem;
    }

    @Override
    public ItemRx validAndReturn(int id) {
        return null;
    }

    @Override
    public ItemRx save(ItemRx item) {
        return repoItem.save(item);
    }

    @Override
    public ItemRx update(Integer id, ItemRx book) {
        return null;
    }

//    @Override
//    public ItemRx update(Integer id, ItemRx item) {
//        item.setIdItem(id);
//        return repoItem.save(book);
//    }

    @Override
    public List<ItemRx> findAll() {
        return repoItem.findAll();
    }

    @Override
    public ItemRx findById(Integer id) {
        return null;
    }

//    @Override
//    public Boolean delete(Integer id) {
//
//        if(repoItem.existsById(id)) {
//            repoItem.deleteById(id);
//            return true;
//        }
//        return false;
//    }
}
