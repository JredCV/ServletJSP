package isil.pe.proyjsp.dao;

import isil.pe.proyjsp.dao.mysql.MySQLConnection;
import isil.pe.proyjsp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public int addUser(User user) throws Exception{

            MySQLConnection mySQLConnection = new MySQLConnection();
            Connection con = mySQLConnection.getConnection();
            int rowsAffected =0;

            String queryInsert = "insert into tbl_user (document,mail,username,pass) values(?,?,?,?)";

            PreparedStatement ps= con.prepareStatement(queryInsert);
            
            ps.setString(1,user.getDocument());
            ps.setString(2,user.getMail());
            ps.setString(3,user.getUsername());
            ps.setString(4,user.getPass());

            rowsAffected = ps.executeUpdate();
            return rowsAffected;

    }

    public List<User> getUsers() throws Exception{
            MySQLConnection mySQLConnection = new MySQLConnection();
            Connection con = mySQLConnection.getConnection();

            String querySelect = "SELECT * FROM tbl_user";
            Statement st = con.createStatement();
            ResultSet resultSet= st.executeQuery(querySelect);

            List<User> listUsers = new ArrayList<>();

            while (resultSet.next()){
                    User user = new User();
                    user.setDocument(resultSet.getString("document"));
                    user.setMail(resultSet.getString("mail"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPass(resultSet.getString("pass"));
                    listUsers.add(user);
            }
            return  listUsers;
    }
}
