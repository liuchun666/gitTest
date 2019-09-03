package main.java.test;

import test.MyBatisTest;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Author:邓世友
 * Date: 2019/2/27 9:03
 */
@WebServlet(name = "DispatchServlet",urlPatterns = {"/Dispatch.action"})
public class DispatchServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("--进入doGet方法");
        MyBatisTest myBatisTest = new MyBatisTest();
        myBatisTest.excute();
        System.out.println("--退出doGet方法");
    }
}
