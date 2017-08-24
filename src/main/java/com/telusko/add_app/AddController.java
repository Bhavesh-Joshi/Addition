package com.telusko.add_app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/add"})
public class AddController extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        int result  = Integer.parseInt(req.getParameter("t1")+req.getParameter("t2"));
        pw.println("<h1>Result: "+result+"</h1>");
    }
    
}
