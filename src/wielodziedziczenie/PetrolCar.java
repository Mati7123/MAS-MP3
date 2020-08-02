package wielodziedziczenie;

public class PetrolCar extends Car {

    private String marka;
    private String model;
    private int maxspeed;
    private int tankCapacity;
    private int avgPetrolConsumption;
    private String petrolType;

    public PetrolCar(String marka, String model, int maxspeed, String petrolType, int tankCapacity, int avgPetrolConsumption) {
        super(marka, model, maxspeed);
        this.marka = marka;
        this.model=model;
        this.maxspeed = maxspeed;
        this.tankCapacity = tankCapacity;
        this.avgPetrolConsumption = avgPetrolConsumption;
        this.petrolType = petrolType;
    }

    @Override
    public int getRange() {
        return tankCapacity/avgPetrolConsumption * 100;
    }

    public String toString() {
        String join = this.getClass().getSimpleName() + " ";
        join += marka + " "+
                model + " prędkość maksymalna: " +
                maxspeed + " pojemność baku: " +
                tankCapacity + " średnie zużycie paliwa: " +
                avgPetrolConsumption;
        return join;

    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getAvgPetrolConsumption() {
        return avgPetrolConsumption;
    }

    public String getPetrolType() {
        return petrolType;
    }
}
