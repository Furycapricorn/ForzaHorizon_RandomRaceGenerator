import java.util.*;
/*
 * This program is used to provide the user with random parameters for a Forza Horizon 4 race.
 * 
 * @author Maximilian Hartmann
 * @version 0.0
 */

/*
 * Comment for myself:
 * Autoarten: 			32
 * Rennarten: 			5 Straﬂe Rally Querfeld Nacht Drag
 * Leistungsklassen:	7
 */
public class ForzaRR_Logic {
	private static Map<Integer, String> carClass = new HashMap<Integer, String>(){{
		put(0, "Sports Utility Heroes");
		put(1, "Offroad");
		put(2, "Offroad Buggies");
		put(3, "Extreme Offroad");
		put(4, "Cult Classics");
		put(5, "Rods and Customs");
		put(6, "Retro Muscle");
		put(7, "Modern Muscle");
		put(8, "Vans & Utility");
		put(9, "Retro Saloons");
		put(10, "Super Saloons");
		put(11, "Classic Rally");
		put(12, "Rally Monsters");
		put(13, "Retro Rally");
		put(14, "Modern Rally");
		put(15, "Retro Hot Hatch");
		put(16, "Hot Hatch");
		put(17, "Super Hot Hatch");
		put(18, "European Sports Cars");
		put(19, "Asian Sports Cars");
		put(20, "Classic Racers");
		put(21, "Rare Classics");
		put(22, "Retro Supercars");
		put(23, "GT Cars");
		put(24, "Super GT");
		put(25, "Modern Super Cars");
		put(26, "Hypercars");
		put(27, "Extreme Track Toys");
		put(28, "Classic Muscle");
		
		
	}};;
	final static Map<Integer, String> performanceClass = new HashMap<Integer, String>(){{
		put(0, "D");
		put(1, "C");
		put(2, "B");
		put(3, "A");
		put(4, "S1");
		put(5, "S2");
		put(6, "X");
	}};
	private static Map<Integer, String> raceType = new HashMap<Integer, String>(){{
		put(0, "Street");
		put(1, "Dirt");
		put(2, "Drag");
		put(3, "Offroad");
		put(4, "Urban");
	}};;
	//The main, that starts the Tester
	
	public static void main(String[]args){
		System.out.println("-- Testprogram started --\n\n");
		logicTester();
		System.out.println("\n-- Finished --");
		
	}
	
	private static Map logicTester(){
		Map<String, String> randomRace = new HashMap<String, String>();
		System.out.println("\n-- Generating race type --");
		randomRace.put("Race Type", raceType.get(getRandomInt(raceType.size()-1)));
		System.out.println("Race Type: " + randomRace.get("Race Type"));
		System.out.println("\n-- Generating Car class --");
		randomRace.put("Car Class", carClass.get(getRandomInt(carClass.size()-1)));
		System.out.println("Car Class: " + randomRace.get("Car Class"));
		System.out.println("\n-- Generating performance class -- ");
		randomRace.put("Performance Class", performanceClass.get(getRandomInt(performanceClass.size()-1)));
		System.out.println("Performance Class: " + randomRace.get("Performance Class"));
		return randomRace;
	}
	
	private static int getRandomInt(int max){
		System.out.println("Random value in int from " +0+" to "+ max + ":");
	    int random_int = (int)(Math.random() * (max  + 1));
	    System.out.println("RandomInt = "+random_int);
		return random_int;
	}
}	