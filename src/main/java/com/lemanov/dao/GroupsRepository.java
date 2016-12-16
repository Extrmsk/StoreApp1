package com.lemanov.dao;

import com.lemanov.model.Groups;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Extr on 16.12.2016.
 */
public interface GroupsRepository extends CrudRepository<Groups, Long> {
    List<Groups> findByName(String name);
}
