
public class BarkingDog {
	
 public static boolean shouldwakeup (boolean barking,int hourofday)
    	{
    
	
		if (hourofday < 0 || hourofday > 23 )
		{
			return false;
		}
		if (barking ==true && (hourofday < 8 || hourofday > 22))
		{
		return true;
		}
		 if (barking ==true && (hourofday > 8 || hourofday < 22 ))
		{
			return false;
		}
		 else 
		 {
				 return false;
	
	}
}
 
}
