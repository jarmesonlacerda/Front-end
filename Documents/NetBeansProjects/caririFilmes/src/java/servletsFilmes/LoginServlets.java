/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletsFilmes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VINICIUS HENRIQUE
 */
@WebServlet(name = "LoginServlets", urlPatterns = {"/LoginServlets"})
public class LoginServlets extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws IOException,ServletException {
                String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        User user = new User(userName, password);

        ServletContext context;  
        context = getServletContext();

        String messageResString;
        messageResString = null;
        if (user.getName().equalsIgnoreCase("joao") && user.getPassword().equals("123")) {
            HttpSession session = req.getSession();
            session.setAttribute("userLogged", user);
            resp.sendRedirect("home.jsp");
        } else {
            req.setAttribute("loginErrorMsg", "Login Inválido!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);
        }
    }
 }
