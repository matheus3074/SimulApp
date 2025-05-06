package com.simulapp.facades;

import com.simulapp.applications.UsersApplication;
import com.simulapp.entities.Users;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersFacade {
    private final UsersApplication usersApplication;

    public UsersFacade(UsersApplication usersApplication) {
        this.usersApplication = usersApplication;
    }

    public List<Users> listUsers() {
        return usersApplication.obterTodosUsuarios();
    }

    public Users getUsersForId(int id) {
        return usersApplication.obterUsuarioPorId(id);
    }

    public void saveUsers(Users user) {
        usersApplication.criarUsuario(user);
    }

    public void deleteUsers(int id) {
        usersApplication.excluirUsuario(id);
    }

    public void updateUsers(int id, Users user) {
        usersApplication.atualizarUsuarios(id, user);
    }
}
