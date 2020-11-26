package edu.nf.Git_hw.controller;

import com.google.gson.Gson;
import edu.nf.Git_hw.dao.UserDao;
import edu.nf.Git_hw.dao.impl.UserDaoImpl;
import edu.nf.Git_hw.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

/**
 * @author roy
 */
@WebServlet("/list")
public class ListUserServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listUser();
        String json=new Gson().toJson(list);
        res.setContentType("application/json;charset=utf-8");
        res.getWriter().println(json);
    }
}
