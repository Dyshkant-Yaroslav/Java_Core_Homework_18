package ua.lviv.desctop.min;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		 List<Integer> list = new ArrayList<Integer>();
	        addToList(list);
	        System.out.println(list.get(0));
		
		

	}
	public static void addToList(List list) {
		list.add("Java");
		}
}
