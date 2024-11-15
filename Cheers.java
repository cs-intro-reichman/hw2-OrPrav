// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheerWord = args[0];
                int repeat = Integer.parseInt(args[1]);
                String letters = "AEFHILMNORSXaefhilmnorsx";
                String allUeerWord = "";

                for(int i=0 ; i < cheerWord.length() ; i++ ){
                        int s = cheerWord.indexOf(cheerWord.charAt(i)); // the index of the letter I'm checking
                        char c = Character.toUpperCase(cheerWord.charAt(i)); // the uppercase of the letter I'm changing
                        allUeerWord = allUeerWord + c;
                        boolean check = false;

                        for(int j=0 ; j< 12 ; j++){
                            if (s == letters.indexOf(letters.charAt(j))) {
                                System.out.println("Give me an " + c + ": " + c + "!");  
                                check = true; // this letter is getting an
                                break;
                            }
                        }   
                        if(!check){
                                System.out.println("Give me a " + s + ": " + s + "!");
                        }                         
                }

               // if (s =='A' || s =='E' || s =='F' || s =='H' || s =='I' || s =='L' || s =='M' || s =='N' || s =='O' || s ==  'R'|| s =='S' || s =='X' ||
              //  s =='a' || s =='e' || s =='f' || s =='h' || s =='i' || s =='l' || s =='m' || s =='n' || s =='o' || s ==  'r'|| s =='s' || s =='x')

               System.out.println("What does that spell?");
                for(int i=0; i< repeat ; i++ ){
                        System.out.println(allUeerWord + "!!!");
                }
        
        }
}
