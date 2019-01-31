class Goldfish extends Fish {

    public Goldfish(String name){

	super(name);
	
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    
    public void say() {
	System.out.println(this.name + " say : Only 3s memory!");
    }

    public void swim(){
	System.out.println(this.name + ": I'm swimming!");
    }
}
