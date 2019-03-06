package school;
//Java Program to illustrate how to define a class and fields  

//Defining a Student class.  
class Student{
	
	//defining fields  
	int id;//field or data member or instance variable 
 	char gender;
	String firstName;
 	String lastName;
 
 	
 	//Constructors
 	public Student(String firstNameArg, String lastNameArg, char genderArg) {
 		this.firstName = firstNameArg;
 		this.lastName = firstNameArg;
 		
 	}
 	
 	
 	//Constructor with no arguments.
    public Student() {
		// TODO Auto-generated constructor stub
	}
    
    //Constructor with name arguments.
    public Student(String firstName, String lastName) {
    	//TODO Set firstName and lastName equal to the parameters 
    	this.id = 0;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	
    	
    	//constructors don't need a return statement.
    	//They return the new object instance
    }
 	


	//setters Input
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    	return; //input doesn't need a return
    }

    public void setLastName(String lastName) {
    	//TODO
    }

    //getters Output
    public String getFirstName() {
    	return this.firstName; //outputs a string
    }

    public String getLastName() {
    	return null;//TODO
    }
    
    //Output FullName 
 	public String fullName() {
 		return this.firstName + " " + this.lastName;//TODO
 	}
 	
	 //Define main method inside the Student Class (This could be defined elsewhere.)
	 public static void main(String args[]){  
		 
		 Student sEmpty;
		 
		 /*
		 //This won't work. Since sEmpty is an empty pointer, there is no firstName to write to.
		 sEmpty.firstName = "Dan";
		 
		 //This also won't work. It won't print blank. There will be an error since first name can't be found.
		 System.out.println(sEmpty.firstName);
		 */
		 Student sBlank = new Student();
		 System.out.println(sBlank.firstName); //This should print null	 
		 
		 
		 
		  //Creating an object or instance  
		  System.out.println("Test constructor");
		  Student s1=new Student("Martin","Sun");//creating an object of Student   
		  System.out.println(s1.fullName());
		  System.out.println("");		  

		  //Test First Name
		  System.out.println("Test First Name");
		  s1.setFirstName("John");
		  System.out.println(s1.getFirstName());
		  System.out.println(s1.fullName());

		  //Test Last Name
		  System.out.println("Test Last Name");
		  s1.setLastName("Smith");
		  System.out.println(s1.getLastName());
		  System.out.println(s1.fullName());
		  
		  
		  
	 }

	 
	 
}


