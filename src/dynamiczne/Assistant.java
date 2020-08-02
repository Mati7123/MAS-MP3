package dynamiczne;

import others.ObjectPlusPlus;

public abstract class Assistant extends ObjectPlusPlus {



    private String firstname;
    private String surname;

    public Assistant(String firstname, String surname) {
        super();
        this.firstname = firstname;
        this.surname = surname;
    }

    public String toString(){
        return "Imie: " + firstname+ " Nazwisko: " + surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String makeCoffee();
}
