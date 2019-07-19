
public class keywords {
	public static void main (String[] args){
		
	double kilometers=(200*1.609344);
	 System.out.println(kilometers);
	 
	 boolean game=true;
	 int score=2000;
	 int level=4;
	 int bonus=100;
	 if (score==2000)
	 {
		 System.out.println("your score Good");
		 
	 }else if (score<1000)
	 {
		 System.out.println("Your score Low");
	 
	 }else
		 System.out.println("Not valid score");
	 if (game==true)
	 {
		 int finalscore=score+(level*bonus);
		 System.out.println("Final score"+ finalscore);
	 }
			 
	}

}
