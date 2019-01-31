class Student extends Person {

    public Student(int id, String firstName, String lastName, String phone, String email){

        super(id, firstName, lastName, phone, email);

    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getFirstName() {
	return this.firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return this.lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getPhone() {
	return this.phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getEmail() {
	return this.email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String toString() {
	return "Student: " + this.firstName + " " + this.lastName + ". email: " + this.email + ", phone: " + this.phone;
    }
}
