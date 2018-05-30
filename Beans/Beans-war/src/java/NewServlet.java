/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sagar.NewSessionBean;

/**
 *
 * @author pro_ge3k
 */
public class NewServlet extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      PrintWriter out=response.getWriter();
      NewSessionBean bean=new NewSessionBean();
      String a=request.getParameter("a");
       String b=request.getParameter("b");
       Double valueA=Double.parseDouble(a);
       Double valueB=Double.parseDouble(b);
       
       out.println("Add:"+bean.add(valueA, valueB));
       out.println("Sub:"+bean.sub(valueA, valueB));
       out.println("Mul:"+bean.mul(valueA, valueB));
       out.println("Div:"+bean.div(valueA, valueB));
       
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
