package aggregation;

public class AggregationChildExample {

	String city;
    int housenumber;
    AggregrationParentExample ref;
	
	public AggregationChildExample(String city, int housenumber, AggregrationParentExample ref ) 
	{
		this.city = city;
		this.housenumber = housenumber;
		this.ref = ref;
	}
	
	public void display() {
		
		System.out.println("The city in child class is: " + city);
		System.out.println("The housenumber in child class is: " + housenumber);
		
		System.out.println("The street in parent class is: " + ref.street);
		System.out.println("The zipcode in parent class is: " + ref.zipcode);
		
	} 
public static void main(String[] args) {
		
	    AggregrationParentExample obj1 = new AggregrationParentExample("Pencil Cactus", 78660);
		AggregationChildExample obj = new AggregationChildExample("Austin", 3366, obj1);
		obj.display();
			
	}

}
