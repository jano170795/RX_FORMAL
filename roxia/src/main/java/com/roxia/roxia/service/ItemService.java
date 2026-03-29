package com.roxia.roxia.service;

import com.roxia.roxia.model.ItemRx;

import java.util.List;

public interface ItemService {

    ItemRx validAndReturn(int id);
    ItemRx save(ItemRx book);
    ItemRx update(Integer id, ItemRx book);
    List<ItemRx> findAll();
    ItemRx findById(Integer id);
    //Boolean delete(Integer id);

}
