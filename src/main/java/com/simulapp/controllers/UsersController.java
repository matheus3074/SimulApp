package com.simulapp.controllers;

import com.simulapp.entities.Users;
import com.simulapp.facades.UsersFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersFacade usersFacade;

    public UsersController(UsersFacade userFacade) {
        this.usersFacade = userFacade;
    }

    @GetMapping
    public List<Users> listUsers() {
        return usersFacade.listUsers();
    }

    @GetMapping("/{id}")
    public Users getUsers(@PathVariable int id) {
        return usersFacade.getUsersForId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUsers(@RequestBody Users user) {
        usersFacade.saveUsers(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsers(@PathVariable int id) {
        usersFacade.deleteUsers(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateUsers(@PathVariable int id,@RequestBody Users user){
        usersFacade.updateUsers(id, user);
    }
}
