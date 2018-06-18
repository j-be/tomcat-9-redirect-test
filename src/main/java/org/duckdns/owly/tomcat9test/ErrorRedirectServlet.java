package org.duckdns.owly.tomcat9test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ErrorRedirectServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // This is not necessary to reproduce the bug, it doesn't solve it either though.
        response.setStatus(302);
        response.sendRedirect("error.html");
    }
}
