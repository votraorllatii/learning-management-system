/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.UserRoles;

/**
 *
 * @author VotraOrllati
 */
public class UserRolesRepository extends EntMngClass implements UserRolesInterface {

    @Override
    public void addUserRoles(UserRoles ur) {
        try {
            em.getTransaction().begin();
            em.persist(ur);
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
    public void updateUserRoles(UserRoles ur) {
        try {
            em.getTransaction().begin();
            em.merge(ur);
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
    public void deleteUserRoles(int id) {
        try {
            em.getTransaction().begin();
            UserRoles ur = getUserRoles(id);
            em.remove(ur);
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
    public UserRoles getUserRoles(int usersId) {
        return em.find(UserRoles.class, usersId);
    }

    @Override
    public List<UserRoles> findAll() {
        return em.createNamedQuery("UserRoles.findAll").getResultList();
    }

}
