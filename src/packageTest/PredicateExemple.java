package packageTest;

import java.util.function.Predicate;

public class PredicateExemple {
	
	// Some exemples for Predicate (Integer and String)
	
	Predicate<Integer> p = a -> (a>10) ; // creating predicate
	
	
	Predicate<String> str = s -> s.startsWith("a"); // creating predicate
	
	
	

	public static void main(String[] args) {
		PredicateExemple predicateClass = new PredicateExemple();
		
		System.out.println(predicateClass.p.test(5)); // calling predicate function
		
		
		System.out.println(predicateClass.str.test("sami")); // calling predicate function
		
	}

}
