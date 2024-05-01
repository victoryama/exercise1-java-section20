package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//passando obj MyComparator no sort
		/* list.sort(new MyComparator()); */
		
		//sintaxe de classe anonima, declarar variavel comparator e iniciar, permite instanciar uma classe anonima entre as chaves
		/*
		 * Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); }
		 * 
		 * }; list.sort(comp);
		 */
		
		//expressao Lambda com chaves
		/*
		 * Comparator<Product> comp = (p1, p2) -> { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 * list.sort(comp);
		 */
		
		//expressao Lambda sem chaves
		/*
		 * Comparator<Product> comp = (p1, p2) ->
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 * list.sort(comp);
		 */
		
		//expressao Lambda no argumento
		 list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
