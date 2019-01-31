public abstract class Mammal implements Animal {

    protected String name;
    protected float weight;
    
    public Mammal(String name, float weight){
	this.name = name;
	this.weight = weight;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }
    
    public float getWeight() {
	return this.weight;
    }

    public void setWeight(float weight) {
	this.weight = weight;
    }

    public abstract void run();

}
