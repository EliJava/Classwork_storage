package lesson140313.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestDogs {

	public static void main(String[] args) {
		List<Dog> dogs = new LinkedList<Dog>();
	
		Dog dog1 = new Dog("Sharik", 10, 4, 5);
		Dog dog2 = new Dog("Lord", 20, 9, 40);
		Dog dog3 = new Dog("Sausage", 6, 10, 3);
		Dog dog4 = new Dog("Mylord", 20, 9, 40);
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		
		Dog[] dogsArray = new Dog[3];
		
		for (int i = 0; i < dogsArray.length; i++) {
			dogsArray[i] = dogs.get(i);
			System.out.println(dogsArray[i].name);
		}
		
		Collections.sort(dogs);
		
		for (Dog dog : dogs) {
			System.out.println(dog.name);
		}
		
		Arrays.sort(dogsArray);
		
		for (Dog dog : dogsArray) {
			System.out.println(dog.name);
		}
		
		System.out.println(dog1.compareTo(dog2));
		System.out.println(dog2.compareTo(dog3));
		System.out.println(dog2.compareTo(dog4));
		System.out.println(dog4.compareTo(dog4));
	}
	
}
