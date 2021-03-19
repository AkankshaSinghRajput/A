
public class OrderDetails{
	
	String name;
	String email;
	
	int c=0;
			
	
	public void OrderStatus() {
		if(c==0) {
			System.out.println("Order not placed yet.");
		}
		else {
			ORDERSTATUS result= ORDERSTATUS.RECEIVED;
			System.out.println(result);
		}
		
	}
	
	public void PlaceOrder() {
		c=c+1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public OrderDetails(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	

}
