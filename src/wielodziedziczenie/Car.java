package wielodziedziczenie;

import others.ObjectPlusPlus;

public abstract class Car extends ObjectPlusPlus {
    private String marka;
    private String model;
    private int maxspeed;

    public Car (String marka, String model, int maxspeed){
         this.marka = marka;
         this.model = model;
         this.maxspeed = maxspeed;
    }

    public abstract int getRange();
}
