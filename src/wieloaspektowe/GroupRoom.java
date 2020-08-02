package wieloaspektowe;

public class GroupRoom extends RoomGroupType {

    private int roomNumber;
    private int capicity;
    public GroupRoom(int roomNumber, int capacity) {
        super(roomNumber);
        this.capicity = capacity;
        this.roomNumber = roomNumber;
    }

    public String toString() {
        String join = "";
        join += "\nPokój grupowy:"+
                "\nNumer" + roomNumber +
                "\nIlość osób" + capicity;

        return join;

    }

    public void cleanUpRoom(){
        System.out.println("Posprzatano i wymieniono poduszki");
    }
}
        