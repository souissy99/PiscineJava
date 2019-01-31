public class Person {

    private String name;
    private String fullName;
    private int age;
    private float money;

    public Person(String name, String fullName, int age, float money){

	this.name = name;
	this.fullName = fullName;
	this.age = age;
	this.money = money;

    }

    public Person(){

	this.name = "";
	this.fullName = "";
	this.age = 0;
	this.money = 0;

    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setfullName(String fullName) {
	this.fullName = fullName;
    }

    public String getfullName() {
	return fullName;
    }
    
    public void setAge(int age) {
	this.age = age;
    }

    public int getAge() {
	return age;
    }

    public void setMoney(float money) {
	this.money = money;
    }

    public float getMoney() {
	return money;
    }
    
    public void addMoney(float money){

	this.money += money;

    }

    public void removeMoney(float money){

	if(this.money < money)
	    System.out.println("Not enough money");
	else
	    this.money -= money;

    }	
	
}
    
