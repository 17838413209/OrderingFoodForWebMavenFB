package com.hzlx.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *
 * @author: 橙子
 * @Date: 2023/4/12 11:13
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(urlPatterns = "/test.do")
public class TestController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<h1 style='color:red'>Hello Maven</h1>");

    }
}
