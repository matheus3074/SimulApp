package com.simulapp.Interfaces;

import com.simulapp.entities.Users;

import java.util.List;
public interface UsersRepository {
    public Users searchByCode(Long id);
    public List<Users> buscar();
    public void addUsers(Users users);
    public void removeUsers(Long id);
    public void updateUsers(Long id, Users users);
    public boolean estaVazio();
}
