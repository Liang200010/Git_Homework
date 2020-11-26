package edu.nf.Git_hw.controller;

import com.google.gson.Gson;
import edu.nf.Git_hw.dao.UserDao;
import edu.nf.Git_hw.dao.impl.UserDaoImpl;
import edu.nf.Git_hw.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason
 * @date 2020/11/26
 */
@WebServlet("/add")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        Integer age=Integer.parseInt(req.getParameter("age"));
        String tel=req.getParameter("tel");
        Users users=new Users();
        users.setUserName(name);
        users.setAge(age);
        users.setTel(tel);
        UserDao dao=new UserDaoImpl();
        List<Users> list = new ArrayList<>();
        list.add(users);
        dao.register(list);
        String json=new Gson().toJson(200);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
