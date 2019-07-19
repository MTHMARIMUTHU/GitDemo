
public class VipCustomer {
	private String name;

	private double Creditlimit;
	private String email;
	
	public VipCustomer ()
	{
		this("rock",2000,"karthi@gmail.com");
		System.out.println("Default Value");
	}
	public VipCustomer (String name, double Creditlimit) {
		this(name,Creditlimit,"karthee@gmail.com");
	}
	public VipCustomer (String name, double Creditlimit,String email) {
		//this(name,Creditlimit,email);
		
	    this.name = name;
        this.Creditlimit = Creditlimit;
        this.email = email;
      
	}
	
	public String getName() {
		return this.name;
	}
	public double getCreditlimit() {
		return this.Creditlimit;
	}
	public String getEmail() {
		return this.email;
	}
}


