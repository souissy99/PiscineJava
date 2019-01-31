class Elephant extends Mammal {

    public Elephant(String name, float weight){
	super(name, weight);
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

    @Override

    public void say() {
	System.out.println(this.name + " say : I'm BIG and HEAVY! (weight : " + this.weight +")");
    }

}
