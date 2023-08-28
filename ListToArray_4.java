package Task_12;
import java.util.ArrayList;
import java.util.List;
public class ListToArray_4 {
public static void main(String[] args) {
	List name = new ArrayList();
	name.add("saranya");
	name.add("shadana");
	name.add("priya");
	name.add("maitra");
	name.add("kanika");
	
	System.out.println(name);
	String[] arr = new String[name.size()];
	name.toArray(arr);
	System.out.println("array: ");
	for(String a:arr) {
		System.out.println(a);
	}
	
}
}
