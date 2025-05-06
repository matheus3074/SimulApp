package com.simulapp.applications;

import com.simulapp.Interfaces.UsersRepository;
import com.simulapp.entities.Users;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersApplication {
    private final UsersRepository usersRepository;

    public UsersApplication(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> obterTodosUsuarios() {
        return usersRepository.buscar();
    }

    public Users obterUsuarioPorId(long id) {
        return usersRepository.searchByCode(id);
    }

    public void criarUsuario(Users users) {
        usersRepository.addUsers(users);
    }

    public void excluirUsuario(long id) {
        usersRepository.removeUsers(id);
    }

    public void atualizarUsuarios(int id, Users users) {
        usersRepository.updateUsers((long) id, users);
    }
}
