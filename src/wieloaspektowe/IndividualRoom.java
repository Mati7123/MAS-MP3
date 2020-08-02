package wieloaspektowe;

import wieloaspektowe.RoomGroupType;

public class IndividualRoom extends RoomGroupType {
    private boolean massageTable;
    private int roomNumber;
    public IndividualRoom(int roomNumber, boolean massageTable) {
        super(roomNumber);
        this.massageTable = massageTable;
        this.roomNumber = roomNumber;
    }

    public String toString() {
        String join = "";
        join += "\nPokój indywidualny:"+
                "\nNumer" + roomNumber +
                "\nStół do masażu" + massageTable;

        return join;
    }

    public void cleanUpRoom(){
        System.out.println("Posprzatano");
    }
}

