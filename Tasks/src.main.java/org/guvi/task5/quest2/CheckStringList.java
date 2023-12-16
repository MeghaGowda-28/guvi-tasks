package org.guvi.task5.quest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckStringList {
	
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> listWithoutEmptyString = new ArrayList<>();
		
		stringList.stream().filter(string -> !string.isEmpty()).forEach(string -> {
			listWithoutEmptyString.add(string);
		});
		System.out.println(listWithoutEmptyString);
	}

}
