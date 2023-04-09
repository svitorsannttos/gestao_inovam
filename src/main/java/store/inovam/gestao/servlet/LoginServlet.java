package store.inovam.gestao.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import store.inovam.gestao.model.LoginModel;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        if(!login.isEmpty() && !senha.isEmpty()){
            LoginModel loginModel = new LoginModel();
            loginModel.setLogin(login);
            loginModel.setSenha(senha);
        }else {
            RequestDispatcher redirecionar = request.getRequestDispatcher("login.jsp");
            request.setAttribute("msg", "Login ou senha nulos");
            redirecionar.forward(request,response);
        }
    }
}
