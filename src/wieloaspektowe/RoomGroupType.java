package wieloaspektowe;
import others.*;

public abstract class RoomGroupType extends ObjectPlusPlus {
    private int roomNumber;

    public RoomGroupType (int roomNumber){
        super();
        this.roomNumber = roomNumber;
    }

    public abstract void cleanUpRoom();
}
