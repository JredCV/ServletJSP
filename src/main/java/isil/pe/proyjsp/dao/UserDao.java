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

            String queryInsert = "INSERT INTO cliente (nomCli,apeCli,dni,email,username,pass) " +
            "VALUES (?,?,?,?,?,?)";

            PreparedStatement ps= con.prepareStatement(queryInsert);
            
            ps.setString(1,user.getNomCli());
            ps.setString(2,user.getApeCli());
            ps.setString(3,user.getDni());
            ps.setString(4,user.getEmail());
            ps.setString(5,user.getUsername());
            ps.setString(6,user.getPass());

            rowsAffected = ps.executeUpdate();
            return rowsAffected;

    }

    public List<User> getUsers() throws Exception{
            MySQLConnection mySQLConnection = new MySQLConnection();
            Connection con = mySQLConnection.getConnection();

            String querySelect = "SELECT * FROM cliente";
            Statement st = con.createStatement();
            ResultSet resultSet= st.executeQuery(querySelect);

            List<User> listUsers = new ArrayList<>();

            while (resultSet.next()){
                    User user = new User();

                    user.setNomCli(resultSet.getString("nomCli"));
                    user.setApeCli(resultSet.getString("apeCli"));
                    user.setDni(resultSet.getString("dni"));
                    user.setEmail(resultSet.getString("email"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPass(resultSet.getString("pass"));
                    listUsers.add(user);
            }
            return  listUsers;
    }

        public int updateUser(String dni,User user) throws Exception{
                MySQLConnection mySQLConnection = new MySQLConnection();
                Connection con = mySQLConnection.getConnection();

                String querySelect = "SELECT * FROM cliente WHERE dni = ?";

                PreparedStatement ps = con.prepareStatement(querySelect);
                ps.setString(1,dni);
                ResultSet resultSet = ps.executeQuery();

                int count=0;
                while(resultSet.next()){
                        count++;
                }

                if(count==0){
                        return 0;
                }else{
                        String queryUpdate = "UPDATE cliente SET nomCli=?," +
                                "apeCli=?," +
                                "email=?," +
                                "username=?," +
                                "pass=? " +
                                "WHERE dni=?";

                        PreparedStatement psUpdate = con.prepareStatement(queryUpdate);
                        psUpdate.setString(1,user.getNomCli());
                        psUpdate.setString(2,user.getApeCli());
                        psUpdate.setString(3,user.getEmail());
                        psUpdate.setString(4,user.getUsername());
                        psUpdate.setString(5,user.getPass());
                        psUpdate.setString(6,dni);

                        return psUpdate.executeUpdate();
                }
        }

        public User getUserByDni(String dni) throws Exception{
                MySQLConnection mySQLConnection = new MySQLConnection();
                Connection con = mySQLConnection.getConnection();

                String querySelect = "SELECT * FROM cliente WHERE dni = ?";

                PreparedStatement ps = con.prepareStatement(querySelect);
                ps.setString(1,dni);
                ResultSet resultSet = ps.executeQuery();

                User user = new User();

                while(resultSet.next()){
                        user.setNomCli(resultSet.getString("nomCli"));
                        user.setApeCli(resultSet.getString("apeCli"));
                        user.setDni(resultSet.getString("dni"));
                        user.setEmail(resultSet.getString("email"));
                        user.setUsername(resultSet.getString("username"));
                        user.setPass(resultSet.getString("pass"));
                        break;
                }

                return user;

        }
}
