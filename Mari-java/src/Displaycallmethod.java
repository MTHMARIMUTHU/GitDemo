
public class Displaycallmethod {
	
	public static void main (String[] args) 
	{
	String playername ="Marimuthu Raju";
	int highscore=400;
	int position = calculatepos (highscore);
    System.out.println (playername + " Mananged to get into position" + position + " on the highest score table");
	}
	public static int calculatepos(int highscore)
	{	
	
	 if (highscore==500)
		 
	 {
		return 1;
		 
	 }else if (highscore<500)
	 {
		 return 2;
	 
	 }else
		 return 3;
	}
	}


