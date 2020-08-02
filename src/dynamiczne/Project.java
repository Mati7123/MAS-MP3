package dynamiczne;

import others.ObjectPlusPlus;

public class Project extends ObjectPlusPlus {
    private String projectName;

    public Project ( String projectName) {
        super();
        this.projectName = projectName;
    };

    public String toString(){
        return projectName;
    }

}
