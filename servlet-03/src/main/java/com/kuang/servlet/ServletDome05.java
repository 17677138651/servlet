package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServletDome05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用当前对象的context类中的getResourceAsStream方法将资源变成一个流
        InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        //创建一个Properties对象用来输出io流
        Properties prop = new Properties();
        prop.load(is);//拿到is数据流
        String user = prop.getProperty("username");//获取他的属性
        String pwd = prop.getProperty("password");//获取他的属性

        resp.getWriter().print(user+":"+pwd);//使用resp将其发送到前端


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
