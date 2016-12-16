package com.lemanov.controller;

import com.lemanov.dao.GroupsRepository;
import com.lemanov.dao.ItemsRepository;
import com.lemanov.model.Groups;
import com.lemanov.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Extr on 16.12.2016.
 */

@RestController
public class StoreController {
    @Autowired
    private ItemsRepository itemsRep;
    @Autowired
    private GroupsRepository groupsRep;

    @RequestMapping ("/getAllGroups")
    public List<Groups> getAllGroups() {
        return (List<Groups>) groupsRep.findAll();
    }
    @RequestMapping ("/getAllItems")
    public List<Items> getAllItems() {
        return (List<Items>) itemsRep.findAll();
    }

}
