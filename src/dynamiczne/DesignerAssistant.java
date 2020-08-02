package dynamiczne;

import others.ObjectPlusPlus;
import others.Role;

public class DesignerAssistant extends Assistant implements Role {
    private String professionalTitle;
    private String finishedStudies;

    public DesignerAssistant(Assistant lastAssistant, String professionalTitle, String finishedStudies) throws Exception{
        super(lastAssistant.getFirstname(), lastAssistant.getSurname());
        this.finishedStudies = finishedStudies;
        this.professionalTitle = professionalTitle;
        if(lastAssistant.areLinks(officeAssistantRole))
        {
            ObjectPlusPlus[] obj = lastAssistant.getLinks(officeRole);
            ObjectPlusPlus obj1 = obj[0];
            lastAssistant.removeLink(officeRole, officeAssistantRole, obj1);
            obj1.removeLink(officeAssistantRole,officeRole,lastAssistant);
        }
        if(lastAssistant.areLinks(assistantRole)){
            ObjectPlusPlus[] obj = lastAssistant.getLinks(computerRole);
            ObjectPlusPlus obj1 = obj[0];
            lastAssistant.removeLink(computerRole, assistantRole, obj1);
            obj1.removeLink(assistantRole,computerRole,lastAssistant);
            obj1.addLink(assistantRole,computerRole,this);

        }
        this.addLink(assistantRole, designerAssistantRole,  this);
    }

    public DesignerAssistant ( String firstname, String surname,  String professionalTitle, String finishedStudies) {
        super(firstname, surname);
        this.finishedStudies = finishedStudies;
        this.professionalTitle = professionalTitle;
        this.addLink(assistantRole, designerAssistantRole,this);

    }

    public String toString() {
        String join = "Stanowisko: ";
        join +="Asystent Projektanta "+
                professionalTitle + " " +
                super.toString() +
                "Skończone studia " + finishedStudies;
        return join;

    }

    @Override
    public String makeCoffee() {
        return " I dont know how to do it";
    }
}
