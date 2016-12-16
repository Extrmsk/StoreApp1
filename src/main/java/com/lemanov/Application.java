package com.lemanov;

import com.lemanov.dao.GroupsRepository;
import com.lemanov.dao.ItemsRepository;
import com.lemanov.model.Groups;
import com.lemanov.model.Items;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Extr on 16.12.2016.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(ItemsRepository itemsRep, GroupsRepository groupsRep) {
        return (args) -> {
            Groups auto = new Groups("Auto");
            Groups clothes = new Groups("Clothes");
            Groups computers = new Groups("Computers");
            Groups books = new Groups("Books");

            groupsRep.save(auto);
            groupsRep.save(clothes);
            groupsRep.save(computers);
            groupsRep.save(books);

            itemsRep.save(new Items("Toyota", 11000, 5, auto));
            itemsRep.save(new Items("Nissan", 8000, 7, auto));
            itemsRep.save(new Items("Honda", 12000, 3, auto));
            itemsRep.save(new Items("Boots", 150, 30, clothes));
            itemsRep.save(new Items("Jackets", 120, 20, clothes));
            itemsRep.save(new Items("Jeans", 200, 40, clothes));
            itemsRep.save(new Items("IBM", 1200, 4, computers));
            itemsRep.save(new Items("AMD", 860, 5, computers));
            itemsRep.save(new Items("Kipling", 50, 2, books));
            itemsRep.save(new Items("Pushkin", 60, 1, books));

            System.out.println("Get all items:");
            for (Items item : itemsRep.findAll()) {
                System.out.println(item.toString());
            }
        };
    }
}
