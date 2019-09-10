package automation;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> one =new ArrayList<>();
		
		one.add(10);
		one.add(20);
		one.add(30);
		one.add(40);
		System.out.println(one);
		
		ArrayList<Integer> two =new ArrayList<>();
		two.addAll(one);
		two.add(100);
		two.add(200);
		System.out.println(two);
		one.removeAll(two);
		System.out.println(one);
		
	}
}
