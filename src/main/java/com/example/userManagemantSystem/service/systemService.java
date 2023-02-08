package com.example.userManagemantSystem.service;

import com.example.userManagemantSystem.model.userManagementSystem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service


public class systemService {
    private static List<userManagementSystem> systems=new ArrayList<>();
    private static int systemcounter=0;

    //UserManagementSystem(int userId, String name, String userName, String address, long phoneNumber)
    static {
        systems.add(new userManagementSystem(++systemcounter,"Sandeep","liecaster","karthika ho","9048057329"));
        systems.add(new userManagementSystem(++systemcounter,"Aemon","aameon","targaryans","906669000"));
        systems.add(new userManagementSystem(++systemcounter,"arya","AryaStark","Winterfell","9862416822"));
        systems.add(new userManagementSystem(++systemcounter,"tyrion lannister","tyriontheIMP","lannister","978545874"));
    }

    public static userManagementSystem findSystemByName(String name){
        Predicate<? super userManagementSystem> predicate= system -> system.getName()==name;
        userManagementSystem system=systems.stream().filter(predicate).findFirst().get();
        return system;
    }

    public userManagementSystem findSystemById(int UserId){
        Predicate<? super userManagementSystem> predicate= system -> system.getUserId()==UserId;
        userManagementSystem system=systems.stream().filter(predicate).findFirst().get();
        return system;
    }

    public static List<userManagementSystem> findAll(){
        return systems;
    }

    public static void addUserManagementSystem(userManagementSystem system){
        systems.add(system);
    }

    public static void updateSystems(String name, userManagementSystem newsystem){
        userManagementSystem system=findSystemByName(name);
        system.setUserId(newsystem.getUserId());
        system.setName(newsystem.getName());
        system.setUserName(newsystem.getUserName());
        system.setAdress(newsystem.getAdress());
    }

    public static void deleteSystem(String name){
        Predicate<? super userManagementSystem> predicate= system -> system.getName()==name;
        systems.removeIf(predicate);
    }

}