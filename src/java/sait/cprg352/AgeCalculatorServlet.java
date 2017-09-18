package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 698437
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ageString = request.getParameter("age");
        
        if(ageString == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        if(ageString.trim().isEmpty())
        {
            request.setAttribute("errorMessage", "Please enter your age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        else
        {
            try
            {
                int numberAge = Integer.parseInt(ageString);
                request.setAttribute("successMessage", "Your age on your next birthday will be " + (++numberAge));
            }
            catch(NumberFormatException e){}
            
            System.out.println("Please enter a valid number");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

}