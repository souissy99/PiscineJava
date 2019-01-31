class Tiger extends Mammal {

    public Tiger(String name, float weight){
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
        System.out.println(this.name + " (weight : "+ this.weight +") say : I will eat you! (" + this.weight +")");
    }
}
