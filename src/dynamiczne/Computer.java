package dynamiczne;

import others.ObjectPlusPlus;

public class Computer extends ObjectPlusPlus {
    private String computerType;
    private String model;

    public Computer (String computerType, String model){
        this.model = model;
        this.computerType = computerType;
    }

    public String toString(){
        return computerType + " " + model;
    }
}
