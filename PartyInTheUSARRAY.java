import java.util.Random;


public class PartyInTheUSARRAY {

	/**
	 * @param args
	 */
	public static String getAdj(int num)
	{
		String[] adjs = new String[4]; 
		adjs[0] = "ginormous"; 
		adjs[1] = "technological"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "squirrely";
		
		
		return adjs[num]; 
	}
	
	public static String getFood(int num)
	{
		//create an array filled with crazy food words
		//return a word in the array 
		
		 
	}
	public static String getName(int num)
	{
		//create an array filled with wacky names
		//return a word in the array 
		
		 
	}
	public static String getPlant(int num)
	{
		//create an array filled with silly types of plants
		//return a word in the array 
		
		 
	}
	public static String getNoun(int num)
	{
		//create an array filled with creative nouns
		//return a word in the array 
		
		 
	}
	public static String getPlace(int num)
	{
		//create an array filled with super fun places
		//return a word in the array 
		
		 
	}
	public static String getVerb(int num)
	{
		//create an array filled with the most exciting verbs ever
		//return a word in the array 
		
		 
	}
	public static String getAni(int num)
	{
		//create an array filled with exotic animal names!
		//return a word in the array 
				 
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); 
		System.out.println("Is getAdj working?\t"+getAdj(rand.nextInt(4)));
		System.out.println("Is getFood working?\t"+getFood(rand.nextInt(4)));
		System.out.println("Is getName working?\t"+getName(rand.nextInt(4)));
		System.out.println("Is getPlant working?\t"+getPlant(rand.nextInt(4)));
		System.out.println("Is getNoun working?\t"+getNoun(rand.nextInt(4)));
		System.out.println("Is getPlace working?\t"+getPlace(rand.nextInt(4)));
		System.out.println("Is getVerb working?\t"+getVerb(rand.nextInt(4)));
		System.out.println("Is getAni working?\t"+getAni(rand.nextInt(4)));
	}

}
