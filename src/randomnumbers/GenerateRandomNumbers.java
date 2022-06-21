package randomnumbers;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new TreeSet<Integer>();
		for (int i = 0; i<7; i++) {
			
		}
		
		while( mySet.size()!=500) {
			mySet.add(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
			
		}
		
		System.out.println(mySet);
		System.out.println(mySet.size());
		Object[] mysetArray = mySet.toArray();
		System.out.println(mysetArray[0]);
		
		
	}

}
