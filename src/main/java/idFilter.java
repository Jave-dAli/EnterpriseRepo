import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class idFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        System.out.println("In doFilter");
        int aid = Integer.parseInt(servletRequest.getParameter("aid"));
        if(aid > 1)
            filterChain.doFilter(servletRequest, servletResponse);
        else
            out.print("Invalid ID");
    }
}
