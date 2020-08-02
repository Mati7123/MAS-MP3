package dynamiczne;

import others.ObjectPlusPlus;

public class Office extends ObjectPlusPlus {
    private String companyName;
    private String adress;

    public Office(String companyName, String adress){
        super();
        this.companyName = companyName;
        this.adress = adress;
    }

    public String toString() {
        String join = "Nazwa firmy: ";
        join += companyName + " Adress: " +
                adress;
        return join;
    }
}
