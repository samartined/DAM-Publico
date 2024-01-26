package com.example.servlets;

import com.example.model.Cliente; // Agrega esta importación
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException; // Add this import

import org.hibernate.Session;

import util.HibernateUtil;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String accion = request.getParameter("accion");
        System.out.println("accion: " + accion);
        if (accion != null) {
            switch (accion) {
                case "mostrar":
                    request.getRequestDispatcher("mostrarClientes.jsp").forward(request, response);
                    break;

                case "alta":
                    request.getRequestDispatcher("altaClientes.jsp").forward(request, response);
                    break;
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("nombre");
        System.out.println("accion: " + accion);
        if (accion != null) {
            switch (accion) {
                case "alta":
                    Session session = null;
                    try {
                        String nombre = request.getParameter("nombre");
                        String telefono = request.getParameter("telefono");
                        String email = request.getParameter("email");
                        String direccion = request.getParameter("direccion");

                        session = HibernateUtil.getSessionFactory().openSession();
                        session.beginTransaction();

                        Cliente cliente = new Cliente(nombre, telefono, email, direccion); // Ajusta el nombre del
                                                                                           // objeto
                        session.save(cliente);

                        session.getTransaction().commit();
                    } catch (Exception e) {
                        e.printStackTrace(System.err);
                    } finally {
                        if (session != null) {
                            session.getTransaction().rollback();
                        }
                    }
                    break;
            }
        }
    }
}
