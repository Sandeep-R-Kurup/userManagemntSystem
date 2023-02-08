package com.example.userManagemantSystem.controller;

import com.example.userManagemantSystem.model.userManagementSystem;
import com.example.userManagemantSystem.service.systemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/UserManagementSystem/")
public class SystemController {
    private final systemService service;


    public SystemController(systemService service) {
        this.service = service;
    }

    @PostMapping("/add_userManagementSystem")
    public void addUserManagementSystem(@RequestBody userManagementSystem system){
        systemService.addUserManagementSystem(system);
    }

    @GetMapping("/find_system/name/{name}")
    public userManagementSystem findSystemByName(@PathVariable String name){
        return systemService.findSystemByName(name);
    }

    @GetMapping("/find_all")
    public List<userManagementSystem> findAll(){
        return systemService.findAll();
    }

    @PutMapping("update_System/name/{name}")
    public void updateSystems(@PathVariable String name,@RequestBody userManagementSystem system){
        systemService.updateSystems(name,system);
    }

    @DeleteMapping("delete_System/name/{name}")
    public void deleteSystem(@PathVariable String name){
        systemService.deleteSystem(name);
    }

}