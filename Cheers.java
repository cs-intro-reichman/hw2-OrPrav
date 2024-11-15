// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String letters = args[0];
                int repeat = Integer.parseInt(args[1]);

                for(int i=0 ; i < letters.length() ; i++ ){
                        char s = letters.charAt(i);
                        if (s =='A' || s =='E' || s =='F' || s =='H' || s =='I' || s =='L' || s =='M' || s =='N' || s =='O' || s ==  'R'|| s =='S' || s =='X'){
                        System.out.println("Give me an " + s + ": " + s + "!");  
                        }else{
                        System.out.println("Give me a " + s + ": " + s + "!");  
                        }
                }
               System.out.println("What does that spell?");
                for(int i=0; i< repeat ; i++ ){
                        System.out.println(letters + "!!!");
                }

        }
}
