package webapp;
import java.util.ArrayList;
import java.util.List;
public class todoService {
	private static List<todos> todoslist = new ArrayList<todos>();
	/**static{
		todoslist.add(new todos("Learn Web Application Development"));
		todoslist.add(new todos("Learn Spring MVC"));
		todoslist.add(new todos("Learn Spring RestFul API"));

	}**/
	public List<todos> retrieveTodos(){
		return todoslist;
	}
	
	public todoService() {
		
	}
	
	public void addTodo(todos todo) {
		todoslist.add(todo);
	}
	
	public void delete(todos todo) {
		todoslist.remove(todo);
	}
	
}
