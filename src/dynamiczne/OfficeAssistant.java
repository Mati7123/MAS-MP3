package dynamiczne;

import others.ObjectPlusPlus;
import others.Role;

public class OfficeAssistant extends Assistant implements Role {
    private boolean goodCoffee;

    public OfficeAssistant (Assistant lastAssistant, boolean goodCoffee) throws Exception{
        super(lastAssistant.getFirstname(), lastAssistant.getSurname());
        this.goodCoffee = goodCoffee;
        if(lastAssistant.areLinks(designerAssistantRole))
        {
            ObjectPlusPlus[] obj = lastAssistant.getLinks(projectRole);
            ObjectPlusPlus obj1 = obj[0];
            lastAssistant.removeLink(projectRole, designerAssistantRole, obj1);
            obj1.removeLink(designerAssistantRole,projectRole,lastAssistant);
        }
        if(lastAssistant.areLinks(assistantRole)){
            ObjectPlusPlus[] obj = lastAssistant.getLinks(computerRole);
            ObjectPlusPlus obj1 = obj[0];
            lastAssistant.removeLink(computerRole, assistantRole, obj1);
            obj1.removeLink(assistantRole,computerRole,lastAssistant);
            obj1.addLink(assistantRole,computerRole,this);

        }
        this.addLink(assistantRole, officeAssistantRole, this);
    }

    public OfficeAssistant ( String firstname, String surname,  boolean goodCoffee) {
        super(firstname, surname);
        this.goodCoffee = goodCoffee;
        this.addLink(assistantRole, officeAssistantRole,  this);
    }

    public String makeCoffee(){
        return "Hot Coffee";
    }
    public String toString() {
        String join = "Stanowisko: ";
        join +="Pomoc biurowa "+
                super.toString();
        if (!goodCoffee){
            join += " Robi słabą kawę...";
        }
        else{
            join += " Parzy świetną kawę!";
        }

        return join;
    }

}
