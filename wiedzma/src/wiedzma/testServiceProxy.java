package wiedzma;

public class testServiceProxy {
	
	
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			 String test = " ";
			 for (int i = 5; i > a; i--) {
			        test = test + ' ';
			    }
			    for (int b = 1; b <= a; b++) {
			        test = test + b + ' ';
			    }
		System.out.println(test);
	   
	}}

}

