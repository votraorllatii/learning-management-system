/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

/**
 *
 * @author VotraOrllati
 */
public class RegisterDao {

    DBUtil db = new DBUtil();
    Connection con = null;
    UserSession us = null;

    public boolean Check(String username, String email) {
        try {
            con = db.getConnection();
            //String query = "insert into Users (Name, LastName, Email, Password)";
            String query = "select User_id from Users where name = ? or Email = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, email);

            ResultSet rs = ps.executeQuery();
//            boolean name = true;
            while (rs.next()) {
                //us = new UserSession(rs.getString("U_Name"), rs.getInt("Role_id"));
                return true;
            }

        } catch (Exception e) {

        }
        return false;
    }
}
