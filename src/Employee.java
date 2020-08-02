import others.ObjectPlusPlus;

import java.util.ArrayList;

public abstract class Employee extends ObjectPlusPlus {

    private ArrayList<String>  businessEquipmentList = new ArrayList<String>();

    private String firstName;
    private String name;

    public ArrayList<String> getBusinessEquipmentList() {
        return businessEquipmentList;
    }

    public Employee(String firstName, String name) {
    super();
        if (firstName == null) {
            throw new NullPointerException("Pole imie nie może być puste.");
        }
        this.firstName = firstName;
        if (name == null) {
            throw new NullPointerException("Pole nazwisko nie może być puste.");
        }
        this.name = name;
    }

    public abstract ArrayList<String> getEquipment();


    public void addEquipment (String item){

        businessEquipmentList.add(item);
    }

}
