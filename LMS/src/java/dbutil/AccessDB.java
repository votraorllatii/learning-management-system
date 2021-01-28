/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ws.rs.NotFoundException;

/**
 *
 * @author VotraOrllati
 */
public class AccessDB {

    Database db = new Database();
    String sql = "";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public AccessDB() {

    }

    public int validate(String username, String pass) {
        int nivel = 0;

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            sql = "select * from Members where username='" + username + "' and pass='" + pass + "'";
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nivel = rs.getInt("nivel");
             
            }
            con.close();
            rs.close();
            return nivel;
        } catch (SQLException | ClassNotFoundException e) {
                 return nivel;
        }
       
    }

}
