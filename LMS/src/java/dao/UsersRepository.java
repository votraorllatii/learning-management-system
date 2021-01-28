/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Users;

/**
 *
 * @author VotraOrllati
 */
public class UsersRepository extends EntMngClass implements UserInterface {

    @Override
    public void addUser(Users u) {
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public void updateUser(Users u) {
        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            em.getTransaction().begin();
            Users u = getUsers(id);
            em.remove(u);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                //throw new EmployeesException("Data already exists!");
            } else {
                //throw new EmployeesException("Create : "+thro.getClass()+" - "+thro.getMessage());
            }
        }
    }

    @Override
    public Users getUsers(int usersId) {
        return em.find(Users.class, usersId);
    }

    @Override
    public List<Users> findAll() {
        return em.createNamedQuery("Users.findAll").getResultList();
    }

}
