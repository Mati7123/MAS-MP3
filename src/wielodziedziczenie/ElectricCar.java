package wielodziedziczenie;

public class ElectricCar extends Car {
    private String marka;
    private String model;
    private int maxspeed;
    private int batteryCapacity;
    private int batteryQuantity;
    private int avgEnergyConsumption;

    public ElectricCar(String marka, String model, int maxspeed, int batteryCapacity, int batteryQuantity, int avgEnergyConsumption) {
        super(marka, model, maxspeed);
        this.marka = marka;
        this.model=model;
        this.maxspeed = maxspeed;
        this.batteryCapacity = batteryCapacity;
        this.batteryQuantity = batteryQuantity;
        this.avgEnergyConsumption = avgEnergyConsumption;
    }

    @Override
    public int getRange() {
        return (batteryQuantity*batteryCapacity/avgEnergyConsumption*100);
    }

    public String toString() {
        String join = this.getClass().getSimpleName() + " ";
        join += marka + " "+
                model + " prędkość maksymalna: " +
                maxspeed + " pojemność jednej baterii: " +
                batteryCapacity + " ilość baterii "+
                batteryQuantity + " średnie zużycie energii: " +
                avgEnergyConsumption;
        return join;

    }
}
