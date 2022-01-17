package zoopart1;

public class Gorilla extends Mammal {
	
    public void throwItem(){
        this.initEnergy(this.genEnergy()-5);
        System.out.println("Gorilla has thrown something; be careful");
    }

    public void eatBananas(){
        this.initEnergy(this.genEnergy()+10);
        
        System.out.println("The gorilla is satisfied with the banana");
    }

    public void climb(){
        this.initEnergy(this.genEnergy()-10);
        System.out.println("Gorilla has climbed a tree");
        
        
    }
}