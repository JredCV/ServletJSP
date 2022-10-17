package isil.pe.proyjsp.controller;

import isil.pe.proyjsp.dao.UserDao;
import isil.pe.proyjsp.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UpdateUserServlet", value = "/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/updateuser.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao dao = new UserDao();
        String dni = request.getParameter("dni");
        User user = new User();

        user.setNomCli(request.getParameter("nomCli"));
        user.setApeCli(request.getParameter("apeCli"));
        user.setEmail(request.getParameter("email"));
        user.setUsername(request.getParameter("username"));
        user.setPass(request.getParameter("pass"));

        try {
            int rowsAffected = dao.updateUser(dni, user);

            if(rowsAffected>0){
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/success.jsp");
                request.setAttribute("rowsaffected", "El cliente de dni "+ dni + " fue actualizado correctamente");
                requestDispatcher.forward(request, response);
            }else{
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
                request.setAttribute("message", "El cliente de dni "+ dni + " no existe");
                requestDispatcher.forward(request, response);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
