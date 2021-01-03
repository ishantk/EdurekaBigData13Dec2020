package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		
		ArrayList<String> emailList = new ArrayList<String>();
		emailList.add("john@example.com");
		emailList.add("fionna@example.com");
		emailList.add("sia@example.com");
		emailList.add("anna@example.com");
		emailList.add("kim@example.com");
		emailList.add("john@example.com");
		emailList.add("sia@example.com");
		
		System.out.println("EMAIL LIST IS:");
		System.out.println(emailList);
		System.out.println();
		
		//Set<String> emailSet = new HashSet<String>();
		//HashSet<String> emailSet = new HashSet<String>();
		//TreeSet<String> emailSet = new TreeSet<String>();
		LinkedHashSet<String> emailSet = new LinkedHashSet<String>();
		
		emailSet.add("john@example.com");
		emailSet.add("fionna@example.com");
		emailSet.add("sia@example.com");
		emailSet.add("anna@example.com");
		emailSet.add("kim@example.com");
		emailSet.add("john@example.com");
		emailSet.add("sia@example.com");
		
		System.out.println("EMAIL SET IS:");
		System.out.println(emailSet);
		System.out.println();

		System.out.println("Iteration");
		Iterator<String> itr = emailSet.iterator();
		
		while(itr.hasNext()) {
			String email = itr.next();
			System.out.println(email);
		}
		
		System.out.println("Size of set is: "+emailSet.size());
		emailSet.remove("kim@example.com");
		
		if(emailSet.contains("kim@example.com")) {
			System.out.println("kim@example.com FOUND");	
		}else {
			System.out.println("kim@example.com NOT FOUND");
		}

	}

}
