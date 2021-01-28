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
public interface UserRolesInterface {

    void addUserRoles(UserRoles ur);

    void updateUserRoles(UserRoles ur);

    void deleteUserRoles(int id);

    UserRoles getUserRoles(int usersId);

    List<UserRoles> findAll();
}
