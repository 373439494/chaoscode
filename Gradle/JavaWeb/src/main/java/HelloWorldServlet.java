import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class HelloWorldServlet extends HttpServlet{  
  
    private static final long serialVersionUID = 1L;  
  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        PrintWriter out = resp.getWriter();  
        out.print("<html><head><title>example</title></head><body>Hello World Test!!!</body><html>");  
        out.flush();  
        out.close();  
        super.doGet(req, resp);  
    }     
}  