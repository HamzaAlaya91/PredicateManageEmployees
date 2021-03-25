package packageTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExemple {
	
	// Some exemples for Predicate (Integer and String)
	
	Predicate<Integer> p = a -> (a>10) ; // creating predicate
	
	Predicate<String> str = s -> s.startsWith("a"); // creating predicate
	

	public static void main(String[] args) {
		
		
		PredicateExemple predicateClass = new PredicateExemple();
		
		System.out.println(predicateClass.p.test(5)); // calling predicate function
		
		
		System.out.println(predicateClass.str.test("sami")); // calling predicate function
		
		
		/* 
		Exemple tableau
		filtre dans un nouveau tableau les entiers superieur à 10
		 */
		
		List<Integer> list = Arrays.asList(1,5,8,12,4,36,47,87,5,6);
		
		List<Integer> collect = list.stream().filter(x -> x>10).collect(Collectors.toList());
		
		System.out.println(collect);
	
	}

}
