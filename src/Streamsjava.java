
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streamsjava {

	// TODO Auto-generated method stub

	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;

			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		// there is no life for intermediate operation if there is no terminal operation
		// terminal operation will execute only if intermediate operation(filter)
		// returns true
		// we can create stream
		// how to use filter in stream API
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		// Stream.of("Abijeet","Don","Alekhya","Adam","Ram").filter(s->s.startsWith("A"));

		// OR We can write in body also

		Long d = Stream.of("Abijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();
		System.out.println(d);
		// Print all the names of Arraylist
		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}
//Fiter is basically to get subset of results
	
	@Test
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		//Print names of which have last letter as 'a; with uppercase
		 Stream.of("Abijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		 
		 //print first letter as A with uppercase and sorted
		 
		 List<String> names1=Arrays.asList("Abijeet", "Don", "Alekhya", "Adam", "Ram");
		 names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		 //Merging two different lists
		 Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
	//newStream.sorted().forEach(s->System.out.println(s));
	boolean flag=newStream.anyMatch((s->s.equalsIgnoreCase("Adam")));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	}
	@Test
	public void streamCollect()
	{
		 List<String> ls=Stream.of("Abijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->s.endsWith("a"))
				 .map(s->s.toUpperCase())
	  .collect((Collectors.toList()));
	  System.out.println(ls.get(0));
	  
	  
	  List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
	  //Print unique number from this array//sort the array-3rd index-1,2,3,5,7,9
	  values.stream().distinct().forEach(s->System.out.println(s));
	  
	  List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	  System.out.println(li.get(2));
	  
	  
	  
	}
	
	
}
