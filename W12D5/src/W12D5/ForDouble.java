package W12D5;

import java.util.List;
import java.util.ArrayList;

import java.util.Collections;


public class ForDouble {
	
	public static void main(String Args[]) {
	
		List<Double> lists = new ArrayList<Double>();
		lists.add(0.006);
		lists.add(0.98);
		lists.add(1.6);
		lists.add(1.76);
		lists.add(2.6);
		lists.add(3.86);
		
		Collections.sort(lists);
		System.out.println("");
		System.out.println("");
		System.out.println("Asscending order of the sorted data  :"+lists);
		
		Collections.reverse(lists);
		System.out.println("");
		System.out.println("");
		System.out.println("Descending order of the sorted data  :"+lists);
	}

}
