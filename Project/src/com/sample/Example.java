package com.sample;

import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Example {

	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		arrayList.add("Sanket");
		arrayList.add(2563);
		arrayList.add(null);
		arrayList.add(869);
		
		arrayList.forEach((al)->System.out.println(al));
	}
}
