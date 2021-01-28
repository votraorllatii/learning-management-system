/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author VotraOrllati
 */
public class DBUtil {
    Connection connection = null;
    
    public Connection getConnection() throws SQLException
    {
        DriverManager.registerDriver(new SQLServerDriver());
        return DriverManager.getConnection("jdbc:sqlserver://VOTRAORLLATI\\SQLEXPRESS;databaseName=LMS","sa", "sa");
    }
}
