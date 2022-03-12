package com.creseliana.weatherforecast.servlet;

import com.creseliana.weatherforecast.service.UserService;
import com.creseliana.weatherforecast.service.UserServiceImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

/**
 * @author Valeria Sterzhanova
 */
public class AdminServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() {
        userService = new UserServiceImpl();
    }

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute("userList", userService.getAll());
        req.getRequestDispatcher("admin.jsp").forward(req, resp);
    }
}
