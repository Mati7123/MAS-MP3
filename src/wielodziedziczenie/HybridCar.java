package wielodziedziczenie;

public class HybridCar extends ElectricCar implements IPetrolCar {

    private PetrolCar petrolCar;
    private String marka;
    private String model;
    private int maxspeed;
    private int batteryCapacity;
    private int batteryQuantity;
    private int avgEnergyConsumption;



    public HybridCar(String marka, String model, int maxspeed, int batteryCapacity, int batteryQuantity, int avgEnergyConsumption, String petrolType, int tankCapacity, int avgPetrolConsumption) {
        super(marka, model, maxspeed, batteryCapacity, batteryQuantity, avgEnergyConsumption);
        petrolCar = new PetrolCar(marka, model,maxspeed, petrolType, tankCapacity, avgPetrolConsumption);

        this.marka = marka;
        this.model=model;
        this.maxspeed = maxspeed;
        this.batteryCapacity = batteryCapacity;
        this.batteryQuantity = batteryQuantity;
        this.avgEnergyConsumption = avgEnergyConsumption;

    }
    @Override
    public int getRange() {
        return super.getRange() + petrolCar.getRange();
    }

    @Override
    public int getTankCapacity() {
        return petrolCar.getTankCapacity();
    }

    @Override
    public int getAvgPetrolConsumption() {
        return petrolCar.getAvgPetrolConsumption();
    }

    @Override
    public String getPetrolType() {
        return petrolCar.getPetrolType();
    }

    public String toString() {
        String join = this.getClass().getSimpleName() + " ";
        join += marka + " "+
                model + " prędkość maksymalna: " +
                maxspeed + " pojemność jednej baterii: " +
                batteryCapacity + " ilość baterii "+
                batteryQuantity + " średnie zużycie energii: " +
                avgEnergyConsumption +" pojemność baku: " +
                getTankCapacity() + " średnie zużycie paliwa: " +
                getAvgPetrolConsumption() + " rodzaj paliwa: " +
                getPetrolType();
        return join;

    }
}
