// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		 int seed = Integer.parseInt(args[0]);
		 String mod = args[1];
		 int newSeed = 1;
		 int line = 1;
		 int count = 0;

		 if (mod.equals("v") || mod.equals("V")) {
			
			if(newSeed % 2 == 0){
				System.out.print(newSeed + " ");
				newSeed /= 2;
				count++;
			}
			else{
				System.out.print(newSeed + " ");
				newSeed = (newSeed*3) + 1;
				count++;
			}

			for(int i = 0; i != seed; i++) { 
			while (newSeed != 1) {
			if(newSeed % 2 == 0){
				System.out.print(newSeed + " ");
				newSeed /= 2;
				count++;
			}
			else{
				System.out.print(newSeed + " ");
				newSeed = (newSeed*3) + 1;
				count++;
			}
			}
			count++;
			System.out.print(newSeed + " ");
			System.out.print("(" + count + ")");
			System.out.println();
			count = 0;
			line ++;
			newSeed = line;
			}
			System.out.println("Every one of the first " + seed  + "hailstone sequences reached 1");
		}
		if(mod.equals("c") || mod.equals("C")) {
		System.out.println("Every one of the first " + seed +  " hailstone sequences reached 1");
		}
		

		

	}
}
