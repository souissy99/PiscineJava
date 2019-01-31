public abstract class Fish {

    protected String name;

    public Fish(String name){

	this.name = name;
	
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public abstract void say();

}
