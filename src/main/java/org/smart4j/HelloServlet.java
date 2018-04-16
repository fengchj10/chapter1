package org.smart4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created  by  Angevin.
 * Date: 2018-03-22 14:44
 * description:
 *
 * @author Angevin
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        DateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date ());
        req.setAttribute("currentTime", currentTime);
        req.getRequestDispatcher("/jsp/hello.jsp").forward(req,
                resp);
    }

}

