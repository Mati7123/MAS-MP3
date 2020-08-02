package overlapping;

import others.ObjectPlusPlus;

import java.util.EnumSet;
import java.util.Vector;

public class Worker extends ObjectPlusPlus {

    private String firstname;
    private String surname;

    private String worksManagerLicenseNumber;
    private String designerLicenseNumber;
    private EnumSet<WorkerType> workerType;


    public Worker(String firstname, String surname, String worksManagerLicenseNumber, String designerLicenseNumber, EnumSet<WorkerType> workerType  ){
        super();
        this.firstname = firstname;
        this.surname = surname;
        this.workerType = workerType;
        if (workerType.contains(WorkerType.Designer)) {
            if (designerLicenseNumber == null) {
                throw new NullPointerException("Projektant musi posiadać numer uprawnień");
            }
            this.designerLicenseNumber = designerLicenseNumber;
        }
        if (workerType.contains(WorkerType.WorksManager)) {
            if (worksManagerLicenseNumber == null) {
                throw new NullPointerException("Kierownik robót musi posiadać numer uprawnień");
            }
            this.worksManagerLicenseNumber = worksManagerLicenseNumber;
        }
    }
    public boolean isWorksManager() {
        if (workerType.contains(WorkerType.WorksManager)) {
            return true;
        }
        return false;
    }

    public boolean isDesigner() {
        if (workerType.contains(WorkerType.Designer)) {
            return true;
        }
        return false;
    }


    public String toString() {
        String join = "Stanowisko: ";
        if (isDesigner()) {
            join +="Projektant ";
        }
        if (isWorksManager()) {
            join +="Kierownik Robót ";
        }
        join += "\nImie: " + firstname +
                "\nNazwisko: " + surname ;
        if (isDesigner()) {
            join +="\nUperawienia projektowe: " + designerLicenseNumber;
        }
        if (isWorksManager()) {
            join +="\nUperawienia budowlane: " + worksManagerLicenseNumber;
        }
        return join;

    }

    public Vector<String> getLicenses() {
        Vector<String> licenses = new Vector();
        if (isDesigner()) {
            licenses.add(designerLicenseNumber);
        }
        if (isWorksManager()) {
            licenses.add(worksManagerLicenseNumber);
        }
        return licenses;
    }
}