package W12D5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForString {

	public static void main(String Args[]) {
		
		List<String> lists = new ArrayList<String>();
		lists.add("Sahas");
		lists.add("Kiran");
		lists.add("Poti");
		lists.add("Vicky");
		lists.add("Madhu");
		lists.add("Santhu");
		lists.add("Jawa");
		lists.add("Mahi");
		lists.add("Srinu");
		lists.add("Bava");
		
		Collections.sort(lists);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Alphabetic order of the sorted data  :"+lists);
		
		Collections.reverse(lists);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Reverse alphabetic order of sorted data :"+lists);
	}
}
