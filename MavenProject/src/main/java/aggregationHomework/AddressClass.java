 //Get the address of student
//Print Student name, roll number with address 
//There is no IS-A relationship

package aggregationHomework;

public class AddressClass { //child class
	
	int housenumber;
	 String streetname;
	 String city;
	 String state;
	 String country;
	 int zipcode;
	 StudentClass ref;

	public AddressClass(int housenumber, String streetname, String city, String state, String country, int zipcode, StudentClass ref) 
	{
		this.housenumber = housenumber;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.ref = ref;
	}
	
public void display() {
		
		System.out.println("The student name is: " + ref.name);
		System.out.println("The roll number is: " + ref.rnumber);
		
		System.out.println("The housenumber is: " + housenumber);
		System.out.println("The streetname is: " + streetname);
		System.out.println("The city is: " + city);
		System.out.println("The state is: " + state);
		System.out.println("The country is: " + country);
		System.out.println("The zipcode is: " + zipcode);
		
	}
	public static void main(String[] args) {
		
		StudentClass obj1 = new StudentClass("Blossom", 20);
		AddressClass obj = new AddressClass(5566, "PencilCactus", "Austin", "Texas", "USA", 78665, obj1);
		
		obj.display();
	}

}
