public class Product {
	
	public String name;
	public int id;
		
	Product(String name, int id)
	{
			
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
	if(this == obj)
			return true;

	if(obj == null || obj.getClass()!= this.getClass())
			return false;
		
		Product product = (Product) obj;
		
		return (product.name == this.name && product.id == this.id);
	}
	
	@Override
	public int hashCode()
	{
		
		// We are returning the Geek_id
		// as a hashcode value.
		// we can also return some
		// other calculated value or may
		// be memory address of the
		// Object on which it is invoked.
		// it depends on how you implement
		// hashCode() method.
		return this.id;
	}
	


	
	public static void main (String[] args)
	{
	
		Product g1 = new Product("Ipad", 456);
		Product g2 = new Product("Iphone", 323);
		

		if(g1.hashCode() == g2.hashCode())
		{

			if(g1.equals(g2))
				System.out.println("Both Objects are equal. ");
			else
				System.out.println("Both Objects are not equal. ");
	
		}
		else
		System.out.println("Both Objects are not equal. ");
	}
}
