package org.guvi.task5.quest1;

import java.util.stream.Stream;

public class StreamMap {
	
	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("aBc","d","ef");
		names.map(name -> name.toUpperCase()).forEach(name -> {
			System.out.println(name);
		});
	}

}
