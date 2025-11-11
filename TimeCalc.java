public class TimeCalc {
    public static void main(String[] args) {
        int minutesToAdd = Integer.parseInt (args[1]); // the number of minutes to add
		int inputHour = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));// the hour part of the input time
		int inputMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));// the minutes part of the input time
        //System.out.println("Hour: " + inputHour );
        //System.out.println("Minutes: " + inputMinutes );
        //System.out.println("Minutes to add: " + minutesToAdd );
        int totalMinutes = (inputHour*60) + inputMinutes + minutesToAdd;// total minutes after adding
        int totalHours = totalMinutes / 60;// total hours after adding
        int newHours = totalHours % 24;// new hours in 24-hour format
        int newMinutes = totalMinutes - (totalHours * 60);// new minutes
        //System.out.println("New hours:" + newHours );
        //System.out.println("New minutes:" + newMinutes );
        String minutesString = Integer.toString(newMinutes);// string representation of new minutes
        String hoursString = Integer.toString(newHours);// string representation of new hours
        // Adding leading zero if needed
        if (newHours < 10) {
            hoursString = "0" + newHours;
        }
        // Adding leading zero if needed
		if (newMinutes < 10) {
			minutesString = "0" + newMinutes;
		}
        System.out.println(hoursString + ":" + minutesString);
    }
}
