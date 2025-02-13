import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class nameFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        System.out.println("In nameFilter");
        String aname = servletRequest.getParameter("aname");
        if (aname.isEmpty())
            out.println("Name field can not be empty");
        else if (aname.length() < 3)
            out.println("Input length too small");
        else if (aname.length() > 30)
            out.println("Input length too long");
        else
            filterChain.doFilter(servletRequest, servletResponse);

    }
}
