package com.creseliana.weatherforecast.servlet;

import com.creseliana.weatherforecast.model.Role;
import com.creseliana.weatherforecast.model.User;
import com.creseliana.weatherforecast.service.UserService;
import com.creseliana.weatherforecast.service.UserServiceImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

/**
 * @author Valeria Sterzhanova
 */
public class LoginServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() {
        userService = new UserServiceImpl();
    }

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = userService.getUser(username, password);

        if (user != null) {
            req.getSession().setAttribute("user", user);
            resp.sendRedirect(user.getRole() == Role.ADMIN ? "admin" : "home");
            return;
        }

        if (userService.userExistsByUsername(username)) {
            req.setAttribute("passwordErrorMessage", "Incorrect password");
        } else {
            req.setAttribute("usernameErrorMessage", "Invalid username");
        }

        req.setAttribute("username", username);
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
