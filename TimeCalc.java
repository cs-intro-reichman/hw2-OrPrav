public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
       
        int hours = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int minutes = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');

        int newTime = (hours * 60) + minutes + minutesToAdd;
        int totalHours = newTime/60; 
        int newHours =  totalHours % 24;
        int newMinutes = newTime - (totalHours*60);

        if (newHours<10 && newMinutes<10) {
            System.out.println("0" + newHours + ":0" + newMinutes);
        }else{
            if (newHours<10) {
                System.out.println("0" + newHours + ":" + newMinutes);
        }
        else{
            if (newMinutes<10) {
                System.out.println(newHours + ":0" + newMinutes);
             }
            else{
             System.out.println(newHours + ":" + newMinutes);
            }
          }
        }    
    }
}