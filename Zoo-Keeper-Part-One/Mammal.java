package zoopart1;

public class Mammal {
	
    private int energyLevel = 100;

    public Mammal(){
    }

    public void initEnergy(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int genEnergy(){
        return energyLevel;
    }

    public int displayEnergy(){
    	
        System.out.println("Gorilla energy: " + energyLevel);

        return energyLevel;
    }
}
