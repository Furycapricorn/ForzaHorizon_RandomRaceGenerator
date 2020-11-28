import java.util.*;
/** Git
 * This program is used to provide the user with random parameters for a Forza Horizon 4 race.
 * 
 * @author Maximilian Hartmann
 * @version 0.1
 */

/*
 * Comment for myself:
 * Autoarten: 			32
 * Rennarten: 			5 Straﬂe Rally Querfeld Nacht Drag
 * Leistungsklassen:	7
 */
public class ForzaRR_Logic {
	private static Map<Integer, String> carClass = new HashMap<Integer, String>(){{
		put(0, "Sports_Utility_Heroes");	//
		put(1, "Offroad");					//
		put(2, "Offroad_Buggies");			//
		put(3, "Extreme_Offroad");			//
		put(4, "Cult_Cars"); 			//
		put(5, "Rods_and_Customs");			//
		put(6, "Retro_Muscle");				//
		put(7, "Modern_Muscle");			//
		put(8, "Vans_&_Utility"); 			//
		put(9, "Retro_Saloons"); 			//
		put(10, "Super_Saloons"); 			//
		put(11, "Classic_Rally");			//
		put(12, "Rally_Monsters");			//
		put(13, "Retro_Rally");				//
		put(14, "Modern_Rally");			//
		put(15, "Retro_Hot_Hatch");			//
		put(16, "Hot_Hatch");				//
		put(17, "Super_Hot_Hatch");			//
		put(18, "Modern_Sportscars");		//
		put(19, "Classic_Sportscars");		//
		put(20, "Tracktoys");				//
		put(21, "Rare_Classics"); 			//
		put(22, "Retro_Supercars"); 		//
		put(23, "GT_Cars");					//
		put(24, "Super_GT");				//
		put(25, "Modern_Supercars");		//
		put(26, "Hypercars");				//
		put(27, "Extreme_Tracktoys");		//
		put(28, "Classic_Muscle");			//
		put(29, "Anithing_Goes");			//
		put(30, "Hypercars");				//
		put(31, "Retro_Sportscars"); 		//
		put(32, "Trucks");			 		//
		put(33, "Vintage_Racers"); 			//
		//     
		
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
	
	public static Map logicTester(){
		Map<String, String> randomRace = new HashMap<String, String>();
		System.out.println("\n-- Generating race type --");
		randomRace.put("RT", raceType.get(getRandomInt(raceType.size()-1)));
		System.out.println("Race Type: " + randomRace.get("RT"));
		System.out.println("\n-- Generating Car class --");
		randomRace.put("CC", carClass.get(getRandomInt(carClass.size()-1)));
		System.out.println("Car Class: " + randomRace.get("CC"));
		System.out.println("\n-- Generating performance class -- ");
		randomRace.put("PC", performanceClass.get(getRandomInt(performanceClass.size()-1)));
		System.out.println("Performance Class: " + randomRace.get("PC"));
		return randomRace;
	}
	
	private static int getRandomInt(int max){
		System.out.println("Random value in int from " +0+" to "+ max + ":");
	    int random_int = (int)(Math.random() * (max  + 1));
	    System.out.println("RandomInt = "+random_int);
		return random_int;
	}
}	