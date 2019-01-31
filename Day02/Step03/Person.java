public abstract class Person {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    public Person(int id, String firstName, String lastName, String phone, String email)
    {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.email = email;
    }

    public void setId(int id){
	this.id = id;
    }

    public int getId(){
	return this.id;
    }
   public void setFirstName(String firstName){
	this.firstName = firstName;
    }

    public String getFirstName(){
	return this.firstName;
    }
    
   public void setLastName(String lastName){
	this.lastName = lastName;
    }

    public String getLastName(){
	return this.lastName;
    }

    public void setPhone(String phone){
	this.phone = phone;
    }

    public String getPhone(){
	return this.phone;
    }

    public void setEmail(String email){
	this.email = email;
    }

    public String getEmail(){
	return this.email;
    }

    public String toString() {
	return this.id + " " + this.lastName + " "+ this.firstName;
    }

 }
    
