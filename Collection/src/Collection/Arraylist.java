package Collection;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>(20);
		ArrayList<Integer> l2 = new ArrayList<>(List.of(10,23,4,5));
		l1.add(10);
		l1.add(0, 12);
		l1.addAll(l2);
		System.out.println(l1);

	}

}
