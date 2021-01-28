/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutil;

/**
 *
 * @author VotraOrllati
 */
public class Database {
    
    String url;
    String user;
    String pass;
    String driver;
    
    public Database(){
        this.url="jdbc:oracle:thin:@localhost:1521:XE";
        this.user="JSPCRUD";
        this.pass="1234";
        this.driver="oracle.jdbc.driver.OracleDriver";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    
}
