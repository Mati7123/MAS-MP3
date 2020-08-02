import others.*;
import overlapping.Worker;
import overlapping.WorkerType;
import wieloaspektowe.BabiesRoom;
import wieloaspektowe.ChlidrensRoom;
import java.util.EnumSet;
import dynamiczne.*;
import wielodziedziczenie.*;
public class Main implements Role {

    public static void main(String[] args) throws Exception {



        System.out.println("------------ DISJOINT + POLIMORFIA------------");
        Employee physiotherapist1 = new Physiotherapist("Jan", "Sałata");
        Employee recepcionist1 = new Receptionist("Marcia", "Pietruszka", true);
        physiotherapist1.addEquipment("Telefon");
        ((Physiotherapist) physiotherapist1).addPersonelEquipment("Uniform męski rozmiar L");
        recepcionist1.addEquipment("Telefon");

        physiotherapist1.getEquipment();
        recepcionist1.getEquipment();


        System.out.println("------------ WIELOASPEKTOWE------------");

        BabiesRoom babiesRoom1 = new BabiesRoom(1, 10, true, 10, true) ;
        ChlidrensRoom chlidrensRoom = new ChlidrensRoom(1,20, false, true);


        chlidrensRoom.showLinks(individualRoomRole, System.out);
        babiesRoom1.showLinks(groupRoomRole, System.out);
        babiesRoom1.cleanUpRoom();
        chlidrensRoom.cleanUpRoom();



        // overlapping
        System.out.println("------------ OVERLAPPING------------");

        Worker worker1 = new Worker("Franciszek", "Baranowicz",null,"SDK123589", EnumSet.of(WorkerType.Designer));
        Worker worker2 = new Worker("Andrzej", "Chleb","SWT82139","SDK123589", EnumSet.of(WorkerType.Designer, WorkerType.WorksManager));
        ObjectPlus.showExtents((Worker.class));
        System.out.println(worker2.getLicenses());

        //dynamic
        System.out.println("------------ DYNAMICZNE ------------");
        Assistant assistant1 = new OfficeAssistant("Jan","Maria", true);
        Office office1 = new Office("Dalkia", "Kolejowa 49");
        Project project1 = new Project( "Biurowiec Postępu 4");
        Computer computer1 = new Computer( "laptop", "Lenovo Legion S45");
        assistant1.addLink(officeRole, officeAssistantRole, office1);
        assistant1.addLink(computerRole, assistantRole, computer1);

        office1.showLinks(officeAssistantRole,System.out);
        assistant1.showLinks(computerRole, System.out);
        assistant1 = new DesignerAssistant(assistant1, "inż", "Inżynieria Środowiska");
        assistant1.showLinks(computerRole, System.out);
        System.out.println(assistant1.makeCoffee());
        assistant1.addLink(projectRole, designerAssistantRole, project1);


        project1.showLinks(designerAssistantRole, System.out);
        //office1.showLinks(officeAssistantRole,System.out);
        assistant1 = new OfficeAssistant(assistant1,true);
        //project1.showLinks(designerAssistantRole, System.out);
        System.out.println(assistant1.makeCoffee());



        System.out.println("------------ WIELODZIEDZICZENIE------------");
        // wielodziedczienie
        Car car1 = new ElectricCar("Tesla", "Model S", 200, 10, 10, 20 );
        System.out.println(car1.getRange());
        Car car2 = new PetrolCar("Toyota", "Tacoma", 180, "bezołowiowa", 60, 8 );
        System.out.println(car2.getRange());
        ObjectPlus.showExtents((PetrolCar.class));
        Car car3 = new HybridCar("Toyota", "Prius 2035", 200,10, 4,20,"bezołowiowa", 40,6);
        System.out.println(car3.getRange());
        ObjectPlus.showExtents((HybridCar.class));
    }
}
