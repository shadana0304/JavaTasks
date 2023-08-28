package Task_12;
import java.util.ArrayList;
import java.util.List;
public class RemoveElements_2 {
public static void main(String[] args) {
	
	List<String> name = new ArrayList();
	name.add("saranya");
	name.add("shadana");
	name.add("priya");
	name.add("maitra");
	name.add("kanika");
	System.out.println(name);
	
	
	System.out.println(name.removeAll(name));
	
}
}
