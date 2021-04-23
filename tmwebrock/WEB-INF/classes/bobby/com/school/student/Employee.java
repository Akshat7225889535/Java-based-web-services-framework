package bobby.com.school.student;
import com.thinking.machines.webrock.annotations.*;
@Path("/employee")
public class Employee
{
@Path("/view")
public void view()
{
	System.out.println("View Service");
}
}