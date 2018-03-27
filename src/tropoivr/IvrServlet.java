package tropoivr;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.voxeo.tropo.Tropo;

@WebServlet(value="/ivr")
public class IvrServlet extends HttpServlet{
    
 @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 Tropo tropo =new Tropo();
	 tropo.say("hello guys");
	 tropo.render(response);
	 
}
}
