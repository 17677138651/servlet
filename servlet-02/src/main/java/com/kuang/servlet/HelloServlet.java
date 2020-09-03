package com.kuang.servlet;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet  extends HttpServlet {
    //由于get或者post只是请求实现的不同方式，可以互相调用，业务逻辑都一样
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        // ServletOutputStream outputStream = resp.getOutputStream();
        //响应的文本类型:html
        response.setContentType("text/html");
        //获取响应的输出流
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello world!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<<h1>fake</h1>");
        out.println("</body>");
        out.println("<html>");

    }
}
