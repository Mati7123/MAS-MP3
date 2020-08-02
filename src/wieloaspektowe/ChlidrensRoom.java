package wieloaspektowe;

public class ChlidrensRoom extends Room {

    private int roomNumber;
    private int area;
    private  boolean airConditioning;
    private boolean massageTable;
    private int capacity;

    public ChlidrensRoom(int roomNumber, int area, boolean airConditioning,boolean massageTable) {
        super(roomNumber, area, airConditioning, massageTable);
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
        this.massageTable = massageTable;

    }

    public ChlidrensRoom(int roomNumber, int area, boolean airConditioning, int size) {
        super(roomNumber, area, airConditioning, size);
        this.roomNumber = roomNumber;
        this.area = area;
        this.airConditioning = airConditioning;
        this.capacity = size;

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
