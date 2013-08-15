import java.util.Random;


public class Madlibs {

	/**
	 * @param args
	 */
	public static String getAdj(int num)
	{
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num]; 
	}
	public static String getFood(int num)
	{
		//create an array filled with crazy food words
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num];
		
		 
	}
	public static String getName(int num)
	{
		//create an array filled with wacky names
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num];
		 
	}
	public static String getPlant(int num)
	{
		//create an array filled with silly types of plants
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy";
		
		
		return adjs[num];
		 
	}
	public static String getNoun(int num)
	{
		//create an array filled with creative nouns
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num];
		 
	}
	public static String getPlace(int num)
	{
		//create an array filled with super fun places
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num];
		 
	}
	public static String getVerb(int num)
	{
		//create an array filled with super fun places
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num];
		 
	}
	public static String getAni(int num)
	{
		//create an array filled with super fun places
		//return a word in the array 
		String[] adjs = new String[4]; 
		adjs[0] = "purple"; 
		adjs[1] = "monstrous"; 
		adjs[2] = "carnivorous"; 
		adjs[3] = "fluffy ";
		
		
		return adjs[num];
		 
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); 
		
		System.out.print("Dear Mom and Dad, Camp is so "+getAdj(rand.nextInt(4))+"!\n The food here is really good, unlike that camp food "
		+getName(rand.nextInt(4))+" told me about.\n We get to eat "+getFood(rand.nextInt(4))+" and "+getFood(rand.nextInt(4))+" every day of the week! This week I get to try out all" +
		" the "+getAdj(rand.nextInt(4))+" activities and sports.\n We are canoeing in water on Lake "+getPlace(rand.nextInt(4))+". \nWe also are learning " +
		"how to dive off the diving board! I tried archery and I wasn't very good—I hit a(n) " +getPlant(rand.nextInt(4))+	"by mistake.\n" +
		" I'll practice and get better, though. For Arts and Crafts, I made a clay " +getNoun(rand.nextInt(4)) +", a(n) "+getNoun(rand.nextInt(4))+"out of macrame, " +
		"and a shelf for Mom to put her "+getNoun(rand.nextInt(4))+"s on.\n I even learned about whittling. I made a(n)"+getNoun(rand.nextInt(4))+" out of wood! Can you believe it?" +
		"I especially like all the friends I am meeting.\n Kids here come from all over the country, from as far away as "+getPlace(rand.nextInt(4))+
		"and "+getPlace(rand.nextInt(4))+".\n I am sorry I have to leave soon. I sure am going to miss all the fun I've had here.\n Maybe I can go camping in the backyard " +
		"when I get back and pretend that I'm still at camp. Do you think Spot will want to camp with me?");
		
		System.out.print("\n\n\n");
		
		System.out.print("Many people enjoy keeping a variety of animals for pets. \n" +
			"Each kind of pet needs special care and attention. Every pet needs food, water, and lots of "+getNoun(rand.nextInt(4))+"s. \n" +
			" Some pets need regular "+getVerb(rand.nextInt(4))+" and "+getVerb(rand.nextInt(4))+", but other pets need less care. So which pet is right for you? \n" +
			"If you are keeping fish, you will need a tank and "+getNoun(rand.nextInt(4))+"s. Cats like to "+getVerb(rand.nextInt(4))+"alot, and they enjoy \n" +
			" being petted. Dogs that are "+getAdj(rand.nextInt(4))+"need a lot of exercise, while "+getAdj(rand.nextInt(4))+" dogs might be happy just running \n" +
			" around the house.	Horses take a lot of work. They need a stable and lots of "+getFood(rand.nextInt(4))+".\n" +
			" They also need to "+getVerb(rand.nextInt(4))+" regularly. Gerbils and hamsters take less work than a horse, and it can be fun \n" +
			" watching them "+getVerb(rand.nextInt(4))+"ing in their cages. Snakes like to "+getVerb(rand.nextInt(4))+" under a heat lamp. But when it comes to feeding time, \n" +
			" you have to be ready to feed most snakes "+getFood(rand.nextInt(4))+"! There are all kinds of animals \n" +
			" that can be kept as pets, but always remember that a pet requires some effort and needs lots of "+getNoun(rand.nextInt(4))+"."); 

		System.out.print("\n\n\n"); 
		String n1=getName(rand.nextInt(4)); 
		System.out.print("This Halloween, I tried something different. I went as a detective! Detectives are "+getAdj(rand.nextInt(4))+" because they solve mysteries. \n" +
			" My dad thought it was a good idea for me to take our "+getAni(rand.nextInt(4))+" Scooter along, because every good detective \n" +
			" has one, he said. Things went along smoothly until Scooter saw our neighbor's "+getAni(rand.nextInt(4))+" and \n" +
			" chased it up a(n) "+getNoun(rand.nextInt(4))+". I almost dropped my candy, but luckily, Scooter doesn't "+getVerb(rand.nextInt(4))+" very often! " +
			"We then went to "+n1+"'s house to meet him and his little sister. I hate Trick or Treating with little sisters. \n" +
			" They are no fun! But "+n1+"'s dad said we had to take her along. Well, it was a good thing \n " +
			"I was a detective, because "+n1+"'s little sister ran away from us and we were really scared that she was lost. \n" +
			"Luckily, Scooter sniffed her out and brought her back to us. She had only gone across the street to see her friends. \n" +
			"I'm such a(n) "+getAdj(rand.nextInt(4))+" detective!");
		
	}

}
