package com.simulapp.repositories;

import com.simulapp.Interfaces.UsersRepository;
import com.simulapp.entities.Users;
import com.simulapp.repositories.JPA.UsersJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UsersRepositoryImpl implements UsersRepository {
    private final UsersJpa usersJpa;

    @Autowired
    public UsersRepositoryImpl(UsersJpa usersJpa) {
        this.usersJpa = usersJpa;
    }

    @Override
    public Users searchByCode(Long id) {
        return this.usersJpa.findById(id).orElse(null);  // Modificado para Long
    }

    @Override
    public List<Users> buscar() {
        return this.usersJpa.findAll();
    }

    @Override
    public void addUsers(Users users) {
        this.usersJpa.save(users);
    }

    @Override
    public void removeUsers(Long id) {
        this.usersJpa.deleteById(id);  // Modificado para Long
    }

    @Override
    public void updateUsers(Long id, Users users) {
        Users usersInDb = this.usersJpa.findById(id).orElse(null);
        if (usersInDb != null) {
            usersInDb.setNome(users.getNome());
            usersInDb.setEmail(users.getEmail());
            usersInDb.setSenha(users.getSenha());
            usersInDb.setDataCriacao(users.getDataCriacao());

            this.usersJpa.save(usersInDb);
        }
    }

    @Override
    public boolean estaVazio() {
        return this.usersJpa.count() == 0;
    }
}
