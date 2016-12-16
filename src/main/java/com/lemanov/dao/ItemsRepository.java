package com.lemanov.dao;

import com.lemanov.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Extr on 16.12.2016.
 */
public interface ItemsRepository extends CrudRepository <Items, Long> {
    List<Items> findByName(String name);
}
