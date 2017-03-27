package com.project.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test0100 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		int i=1;
		list.add("name"+(i++));
		list.add("name"+(i++));
		list.add("name"+(i++));
		list.add("name"+(i++));
		list.add("name"+(i++));
		list.add("name"+(i++));
		list.add("name"+(i++));
		list.add("name"+(i++));
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			String print=iterator.next();
			if(print.equals("name4")){
				iterator.remove();
			}
			System.out.println(print);
		}
		System.out.println(list.size());
		double d;
		d=3*0.1;
		System.out.println(d);
	}
}
