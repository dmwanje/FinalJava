package com.mwanje;

import com.mwanje.HibernateUtil;
import com.mwanje.model.UsersEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

@WebServlet("/users")
public class LibServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsersEntity user = new UsersEntity();
        user.setFirstName("Daniel");
        user.setLastName("Mwanje");
        user.setEmail("danmwa@byui.com");
        user.setPassword("root");
        user.setCreated(new Timestamp(System.currentTimeMillis()));

        Session session = HibernateUtil.getFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
        request.getRequestDispatcher("WEB-INF/templates/users.jsp").forward(request, response);
    }
}