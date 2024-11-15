// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheerWord = args[0];
                int repeat = Integer.parseInt(args[1]);
                String letters = "AEFHILMNORSX";
                String allUeerWord = "";

                for(int i=0 ; i < cheerWord.length() ; i++ ){
                        char currentChar = Character.toUpperCase(cheerWord.charAt(i)); // the uppercase of the letter I'm changing
                        allUeerWord = allUeerWord + currentChar;
                        boolean check = false;
                        
                        for(int j=0 ; j< 12 ; j++){
                            if (currentChar == letters.charAt(j)) {
                                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");  
                                check = true; // this letter is getting an
                                break;
                            }
                        }   
                        if(!check){
                                System.out.println("Give me a  " + currentChar + ": " + currentChar + "!");
                        }                         
                }

               System.out.println("What does that spell?");
                for(int i=0; i< repeat ; i++ ){
                        System.out.println(allUeerWord + "!!!");
                }
                //Expected:%0AGive me a  C: C!%0AGive me an H: H!%0AGive me an E: E!%0AGive me a  C: C!%0AGive me a  K: K!%0AWhat does that spell?%0A
                //Actual:%0AGive me a C: C!%0AGive me an H: H!%0AGive me an E: E!%0AGive me a C: C!%0AGive me a K: K!%0AWhat does that spell?

        }
}
