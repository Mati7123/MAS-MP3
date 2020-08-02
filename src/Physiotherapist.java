import java.util.ArrayList;

public class Physiotherapist extends Employee{

    private ArrayList<String> personalEquipmentList = new ArrayList<String>();

    public Physiotherapist(String firstName, String name) {
        super(firstName, name);
    }

    public void addPersonelEquipment(String item){
        personalEquipmentList.add(item);
    }

    @Override
    public ArrayList<String> getEquipment() {
        ArrayList<String> allEquipmentList = new ArrayList<String>(getBusinessEquipmentList());
        allEquipmentList.addAll(personalEquipmentList);
        System.out.println(allEquipmentList);
        return allEquipmentList;
    }


}
