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
public class LoginDao {
    
        DBUtil db = new DBUtil();
        Connection con = null;
        UserSession us = null;
        
        
        
        public boolean Check(String username,String pas){
          try {
           con = db.getConnection();
            String query = "Select Name,Password,Role_Id from Users where Name = ? and Password = ? and Role_Id = ?";
            int roliId = 1;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pas);
            ps.setString(3, roliId+"");
            ResultSet rs = ps.executeQuery();
//            boolean name = true;
            while(rs.next()){
                //us = new UserSession(rs.getString("U_Name"), rs.getInt("Role_id"));
               return true;
            }
           
          } catch (SQLException ex) {
              Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
            
        
        }
    
}
