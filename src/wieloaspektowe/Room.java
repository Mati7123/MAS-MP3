package wieloaspektowe;

import others.*;
import wieloaspektowe.GroupRoom;
import wieloaspektowe.RoomGroupType;

public abstract class Room extends ObjectPlusPlus implements Role {


    private int roomNumber;
    private int area;
    private  boolean airConditioning;
    private boolean massageTable;
    private int capacity;

    public Room( int roomNumber, int area, boolean airConditioning, boolean massageTable ){
        super();
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
        this.massageTable = massageTable;

        addIndvidualRoom(roomNumber, massageTable);
    }

    public Room( int roomNumber, int area, boolean airConditioning, int capacity ){
        super();
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
        this.capacity = capacity;

        addGroupRoom(roomNumber, capacity);
    }
    public Room(){
        super();
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
    }


    public void addIndvidualRoom(int roomNumber, boolean massageTable){
        RoomGroupType room = new IndividualRoom(roomNumber, massageTable);
        this.addLink(individualRoomRole, roomRole, room);
    }

    public void addGroupRoom(int roomNumber, int capacity){
        RoomGroupType room = new GroupRoom(roomNumber, capacity);
        this.addLink(groupRoomRole, roomRole, room);
    }
    public void cleanUpRoom() throws Exception{
        if(this.areLinks(individualRoomRole)){
            ObjectPlusPlus [] obj = this.getLinks(individualRoomRole);
            ((RoomGroupType) obj[0]).cleanUpRoom();
        }
       if(this.areLinks(groupRoomRole)){
           ObjectPlusPlus [] obj = this.getLinks(groupRoomRole);
           ((RoomGroupType) obj[0]).cleanUpRoom();
       }
   }



}
