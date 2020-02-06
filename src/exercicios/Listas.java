package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //List <tipo de dados> nome = new classe que implementa a lista
		
		list.add("Maria");
		list.add("Ana");
		list.add("Sancho");
		list.add("Dom Quixote");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		//list.remove("Maria");
		//list.remove(2);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("Index of Sancho: " + list.indexOf("Sancho"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
