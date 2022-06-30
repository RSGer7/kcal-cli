
import java.util.Scanner;

public class CalSingleMain {

	public static void main(String[] args) {
		
		//++++++++++++++++++++++++++++++++++++++++
		
		Scanner sc3 = new Scanner(System.in);
		
		//first element [][0] for search/input, second ([][1])for kcal per g, third ([][2]) for feedback
		//buffer is for entering extra amounts of calories
		String myData[][]= {
				{"buffer",			"1","Buffer, 1g = 1 kcal"},
				{"brötchen", 	"2.6", "Brötchen, 80g pro Stück" },
				{"butter", 		"7.4", "Butter, 10-20g pro Portion"},
				{"kartoffeln",	"0.73","Kartoffeln"},
				{"hafer",		"3.5","Haferflocken"},
				{"hühnerfleisch",	"2.4","Hühnerfleisch"},
				{"hähnchenfleisch",	"2.4","Hähnchenfleisch"},
				{"hähnchenschnitzel","2.1","Hähnchenschnitzel"},
				{"hähnchenbrust",	"1.65","Hähnchenbrust"},
				{"chickenwings",	"2","Chickenwings"},
				{"mortadella",		"3.1","Mortadella, 18-20g pro Scheibe"},
				{"hähnchenlyoner",	"3.1","Hähnchenlyoner (8g pro Scheibe?), 3.1 kcal"},
				{"lyoner",			"2.85", "Lyoner, 18-20g pro Scheibe"},
				{"hirse",			"1.19","Hirse, 1 mittlere Schüssel ca. 145g"},
				{"Ei",				"1.42","Ei, ein mittleres ca. 54g, grössere etwas mehr"},
				{"schmand",			"2.4", "Schmand"},
				{"Proteintoast", 	"2.31",	"Proteintoast"},
				{"Hähnchenwurst", 	"0.98", "Hähnchenwurst"},
				{"Roast Chicken", 	"0.98", "Roast Chicken Aufschnitt"},
				{"Hähnchenbrustwurst", "1.05", "Hähnchenbrustwurst"},
				{"Ziegenkäse", 		"3.8", "Ziegenkäse, ca. 25g pro Scheibe"},
				{"Orangenschokolade", "5.3", "Orangenschokolade, ca. 11g pro Stück"},
				{"Buchweizen", 		"1.2", "Buchweizen (ggf. nur 1.09 kcal pro g)"},
				{"Hafermilch", 		"0.38", "Hafermilch"},
				{"Geflügelpastete", "1.87", "Geflügelpastete"},
				{"Honig", 			"3.18", "Honig"},
				{"Frikadelle", 		"1.85", "Frikadelle, 1 Portion ca. 150g"},
				{"Roggenmischbrot", "2.2", "Roggenmischbrot, 1 Scheibe ca. 56g"},
				{"Schinken", 		"1.08","Schinkenscheiben" },
				{"Mehrkorntoast", 	"2.57", "Mehrkorntoast, ca. 98kcal pro Scheibe (ca. 38g)"},
				{"Putenbrustwurst", "1.11", "Putenbrust in dünnen Scheiben fürs Brot"},
				{"Graved Lachs", 	"2.02", "Graved Lachs in Scheiben fürs Brot"},
				{"Mandelmehlkuchen","3.77", "Selbstgemachter Mandelmehlkuchen mit Ei und Obst"},
				{"Reis", 			"1.26", "Reis, gekocht"},
				{"Vollkornnudeln", 	"1.39", "Vollkornnudeln, gekocht"},
				{"Sushi", 			"1.59", "Sushi to go, durchschnittliche Nährwerte"},
				{"Kakaopulver pur", "3.33", "Kakaupulver pur, kein Zucker"},
				{"Sauerkraut", 		"0.18", "Russisches Sauerkraut, kein Zucker"},
				{"Tomate", 			"0.2", "TOMAT"},
				{"Putenbrust", 		"1.13", "Putenbrust"},
				{"Putenfleisch", 	"1.70", "Putenfleisch"},
				{"Hähnchenminutenschnitzel", "1.07", "Hähnchenminutenschnitzel, ohne Panade und Öl"},
				{"Ketchup", 		"1.24", "Ketchup"},
				{"Senf", 			"1.43", "Senf, mittelscharf, discount"},
				{"Dorschleber", 	"4.32", "Dorschleber in Öl"},
				{"Proteinbrot", 	"2.44", "Proteinbrot (Erbsenprotein)"},
				{"Vollkorntoast", 	"2.40", "Vollkorntoast"},
				{"Kopfsalat", 		"0.14", "Kopfsalat"},
				{"Trauben Grün", 	"0.71", "Traube Grün (kernlos)"},
				{"Erdbeeren", 		"0.33", "Erdbeeren"}, 
				{"Basmati Naturreis", "1.2", "Basmati Naturreis, gekocht"},
				{"Cashew", 			"5.89", "Cashew"},
				{"Brokkoli", 		"0.3", "Brokkoli (gekocht)"},
				{"Möhre", 			"0.3", "Möhre (ca.)"},
				{"Hackfleisch Rind", "2.19", "Hackfleisch Rind, normal"},
				{"Maggi Käsenudeln", "1.07", "Instantgericht (1 Portion = 247g = 264 kcal) (62g trocken, ca. 230g zubereitet)"},
				{"Haferkaffee", 	"0.58", "Haferkaffee"},
				{"Kalbgulasch", 	"1.25", "Kalbsgoulash (laut fddb)"},
				{"Kalbsfilet", 		"1.19", "Kalbsfilet (roh) (laut fddb)"},
				{"Schweinefilet", 	"1.43", "Schweinefilet (laut google)"},
				{"Teeröllchen", 	"4.58", "Teeröllchen."},
				{"Perlgraupen", 	"1.26", "Perlgraupen gekocht"},
				{"Bratkartoffeln Fertig", "1.55", "Bratkartoffeln Fertiggericht"},
				{"Pflaume", 		"1.87", "Pflaume, frisch"},
				{"Weißkrautsalat", 	"1.07", "Weißkrautsalat aus Dose, mit Zucker"},
				{"Kürbiskernbrot", 	"2.73", "Kürbiskernbrot"},
				{"Banane", 			"0.89", "Banane"},
				{"Erdnussbutter", 	"6.21", "Erdnussbutter"},
				{"Crossaint", 		"4", "Crossaint"},
				{"Schoko 85", 		"6.03", "Schokolade, 85% Kakao"},
				{"Instantsoba", 	"2.13", "Instantnudeln 'Soba', 1 fertige Portion = 180g = 384 kcal"},
				{"Trüffel-Schokolade", "5.78", "Trüffel-Schokolade"},
				{"Vanillereismilch","0.59", "Vanillereismilch"},
				{"Nuss-schoko", 	"5.79", "Haselnusschokolade, 1 Stück = 6.25g"},
				{"Avocado", 		"1.6", "Avocado"},
				{"Protein-Schokopudding", "0.84", "Protein-Schokopudding, kein Zucker"},
				{"Döner", 			"1.84", "Döner Kebab / Dönertasche "},
				{"Macadamia", 		"7.6", "Macadamia"}, 
				{"Feige", 			"0.65", "Feige"},
				{"Paranuss", 		"6.98", "Paranuss"},
				{"Mayo",			"7.06", "Mayonnaise"},
				{"Apfel",			"0.54", "Apfel, 180g = 97.2 kcal"},
				
		};
		
		String itemInput = "blank";
		float calSum = 0;
		float gramInput = 0;
		
		while (!(itemInput.toLowerCase().equals("exit"))) {
			
			//resets gramInput for each loop
			gramInput = 0;
			
			System.out.println("CAL-C: enter food item or \"result\" or \"exit\"");
			itemInput = sc3.nextLine();
			
			//if input isn't "exit" or "result"
			if (!(itemInput.toLowerCase().equals("exit")) && !(itemInput.toLowerCase().equals("result")) ) {
				
				for (int i = 0; i<myData.length; i++) {
					
					//if input exists on the list
					if (itemInput.toLowerCase().equals(myData[i][0].toLowerCase())) {
						//[i][2] stores description
						System.out.println("CAL-C: YOUR CHOICE: "+myData[i][2]);
						
						//calculate kcals
						System.out.println("CAL-C: enter amount in grams:");
						gramInput = sc3.nextFloat();
						//adds kcals to calSum
						calSum +=(gramInput*Float.parseFloat(myData[i][1]));
						System.out.println("CAL-C: CURRENT ITEM: " +gramInput*Float.parseFloat(myData[i][1]) + " kcal");
					}
				}
				
			} else if (itemInput.toLowerCase().equals("result")) {
				System.out.println("YOUR SUM: "+calSum);
				
			} else if (itemInput.toLowerCase().equals("exit")) {
				System.out.println("Program terminated. Byebye.");
				
			}else {
				System.out.println("Invalid input. Try again.");
			}
			
		}//while-loop ends here
		
		//++++++++++++++++++++++++++++++++++++++++ 
		
	}

}


