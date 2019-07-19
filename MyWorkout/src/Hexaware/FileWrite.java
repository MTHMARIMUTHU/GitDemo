package Hexaware;
import java.io.FileWriter;;

public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\test.txt");
			fw.write("Hi Good Morning");
			fw.close();
			System.out.println("Success");
		}
	    catch(Exception e)
		{
			System.out.println(e);
			}

	}

}
