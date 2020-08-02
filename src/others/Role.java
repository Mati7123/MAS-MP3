package others;
import dynamiczne.*;
import wieloaspektowe.*;

public interface Role {
    String individualRoomRole= IndividualRoom.class.getSimpleName();
    String groupRoomRole = GroupRoom.class.getSimpleName();
    String roomRole = Room.class.getSimpleName();
    String assistantRole = Assistant.class.getSimpleName();
    String designerAssistantRole = DesignerAssistant.class.getSimpleName();
    String officeAssistantRole = OfficeAssistant.class.getSimpleName();
    String projectRole = Project.class.getSimpleName();
    String officeRole = Office.class.getSimpleName();
    String computerRole = Computer.class.getSimpleName();
}
