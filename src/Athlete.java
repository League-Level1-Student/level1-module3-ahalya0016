public class Athlete {
	static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber = 0;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber += nextBibNumber++;

    }

	public static void main(String[] args) {
        //create two athletes
    	Athlete athlete1 = new Athlete("Bob", 9);
    	Athlete athlete2 = new Athlete("Joe", 10);
        //print their names, bibNumbers, and the location of their race. 
 
    	System.out.println(athlete1.name);
    	System.out.println(athlete2.name);
    	System.out.println(athlete1.bibNumber);
    	System.out.println(athlete2.bibNumber);
    	System.out.println(raceLocation);
    	
    }
}
