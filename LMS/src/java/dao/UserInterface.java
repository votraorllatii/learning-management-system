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
public interface UserInterface {
    
    void addUser(Users u);
    
    void updateUser(Users u);
    
    void deleteUser(int id);
    
    Users getUsers(int usersId);
    
    List<Users> findAll();
    
}
