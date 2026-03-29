package com.roxia.roxia.repository;

import com.roxia.roxia.model.ItemRx;
import com.roxia.roxia.model.ItemRxId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<ItemRx, ItemRxId> {

}
