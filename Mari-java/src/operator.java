
public class operator {
	

	public static void main(String[] args) {
		int result=2+5;
		int prevresult=result;
	    System.out.println(prevresult);
	    result=result*1;
	    System.out.println(prevresult+"*2 =" +  result);
	   
	   prevresult=result;
	   result=result / 2; /* % will give value 0 or 1 based division*/
	   System.out.println(prevresult+ "/2 =" +  result);
	   result=result++;
	   result++;
	   System.out.println(result);
	   result=result--;
	   System.out.println(result);
	   result +=2;
	   System.out.println(result);
	   result *=1;
	   System.out.println(result);
	   if (result > 4)
		   System.out.println("Big no result: " + result );
	   System.out.println("Previousvalue: " + prevresult );
	   if ((prevresult > result) && (prevresult < 50) ) /*Both Right*/
		   System.out.println("Previous result is high");
	   if ((prevresult < result) && (prevresult < 50) ) /*first wrong*/
		   System.out.println("Previous result is first condition Wrong");
	   if ((prevresult > result) && (prevresult >  50) ) /*Second wrong*/
		   System.out.println("Previous result is Second condition Wrong");
	   if ((prevresult < result) & (prevresult < 50) ) /*first wrong &operator*/
		   System.out.println("Previous result is first condition Wrong");
	   if ((prevresult > result) & (prevresult >  50) ) /*Second wrong &operator*/
		   System.out.println("Previous result is Second condition Wrong");
	   if ((prevresult > result) | (prevresult >  50) ) /*Second wrong &operator*/
		   System.out.println("Previous result is Second condition Wrong Or operator");
	   if ((prevresult < result) || (prevresult <  50) ) /*First wrong &operator*/
		   System.out.println("Previous result is First condition Wrong Or operator");
	   boolean iscar =true;
			  boolean wascar =iscar ? true : false;
	   System.out.println("wascar: " + wascar);
	   
}
}