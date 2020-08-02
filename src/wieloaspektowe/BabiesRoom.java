package wieloaspektowe;

public class BabiesRoom extends Room {
    private boolean changingTable;
    private int roomNumber;
    private int area;
    private  boolean airConditioning;
    private boolean massageTable;
    private int capacity;

    public BabiesRoom(int roomNumber, int area, boolean airConditioning, boolean massageTable, boolean changingTable) {
        super(roomNumber, area, airConditioning, massageTable);
        this.changingTable = changingTable;
        this.massageTable = massageTable;
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
    }

    public BabiesRoom(int roomNumber, int area, boolean airConditioning, int size, boolean changingTable) {
        super(roomNumber, area, airConditioning, size);
        this.changingTable = changingTable;
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
    }


    public String toString() {
        String join = "";
        join += "\nPokój dla dzieci:"+
                "\nNumer" + roomNumber +
                "\nPowierzchnia: " + area +
                "\nKlmatyzacja: " + airConditioning;


        return join;

    }
}
