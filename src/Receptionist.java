import java.util.ArrayList;

public class Receptionist extends Employee{

    private boolean rentedComputer;

    public Receptionist(String firstName, String name, boolean rentedComputer ) {
        super(firstName, name);
        this.rentedComputer = rentedComputer;
    }

    @Override
    public ArrayList<String> getEquipment() {
        if (rentedComputer){
           addEquipment("Komputer");
        }
        System.out.println(getBusinessEquipmentList());
        return getBusinessEquipmentList();
    }
}
