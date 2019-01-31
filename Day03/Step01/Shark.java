import java.util.List;

class Shark extends Fish {

    private int nbEatenFishes;
	
    public Shark(String name){

        super(name);
	this.nbEatenFishes = nbEatenFishes;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbEatenFishes() {
	return this.nbEatenFishes;
    }

    public void setNbEatenFishes(int nbEatenFishes) {
	this.nbEatenFishes = nbEatenFishes;
    }


    public void eat(Goldfish fish){
	this.nbEatenFishes = nbEatenFishes + 1; 
    }

    public void eat(List fishes){
	this.nbEatenFishes += fishes.size();
    }

    @Override

    public void say() {
	System.out.println(this.name + " say : I'm Hungry!");
    }
}
