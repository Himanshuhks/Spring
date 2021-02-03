package LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
// lifecycle method also called call back methods
public class StudentDao {

    // implements InitializingBean , DisposableBean can be used to for call back methods as well.
    private String driver;

    private String url;
    private String name;
    private String pass;
    private Connection con;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //@PostConstruct // framework calls the method also called init method
    public void init() throws SQLException, ClassNotFoundException {
        System.out.println("Init method");
        createConnection();
    }
    public void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        con = DriverManager.getConnection(url,name,pass);
    }

    public void selectAll() throws SQLException, ClassNotFoundException {
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from hostel");
        System.out.println("Printing All data");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int fee = resultSet.getInt(3);
            System.out.println(id + " " + name + " " + fee);
        }
        closeConnection();
    }

    public void deleteRow(int id) throws SQLException, ClassNotFoundException {
        Statement statement = con.createStatement();
        statement.executeUpdate("delete from hostel where id =" + id);
        System.out.println("Record Deleted");
        closeConnection();
    }
    //@PreDestroy
    public void closeConnection() throws SQLException {
        System.out.println("destroyed");
        con.close();
    }
}
