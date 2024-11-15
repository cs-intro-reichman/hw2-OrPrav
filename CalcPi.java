// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int input = Integer.parseInt(args[0]);
		double approximated = 0;

		for (int i = 0; i < input; i++) {
            double term = 1.0 / (2 * i + 1);  // 1/(2n + 1)
            if (i % 2 == 0) {
                approximated += term; 
            } else {
                approximated -= term;  
            }
        }

		approximated= approximated*4;
			if (input !=0){
				System.out.println("pi according to Java: " + Math.PI);
				System.out.println("pi, approximated: " + approximated);
				} 
				else{
				System.out.println("pi according to Java: " + Math.PI);
				System.out.println("the input is 0");
				}
		

	}
}
