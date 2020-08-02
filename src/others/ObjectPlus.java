package others;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Hashtable;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ObjectPlus implements Serializable {
    private static final long serialVersionUID = 1L;

    private static Map<Class, List<ObjectPlus>> extents= new Hashtable<>();

    private static Vector extent;


    public ObjectPlus(){
        extent = null;
        Class aClass = this.getClass();

        if (extents.containsKey(aClass)){
            extent = (Vector) extents.get(aClass);
        }
        else {
            extent = new Vector();
            extents.put(aClass, extent);
        }
        extent.add(this);

    }

    public static int extentSize(Class<? extends ObjectPlus> className) {
        int counter = 0;
        if (extents.containsKey(className)) {
            counter = extents.get(className).size();
        }
        System.out.println(" Extent " + className.getSimpleName() + " : " + counter);
        return counter;
    }

    public static void saveExtents( ObjectOutputStream stream) throws IOException{
        stream.writeObject(extents);
    }

    public static void readExtents (ObjectInputStream stream) throws IOException, ClassNotFoundException {
        extents = (Hashtable) stream.readObject();
    }

    public static void showExtents(Class klasa) throws Exception {
        Vector extent = null;
        if (extents.containsKey(klasa)){
            extent = (Vector) extents.get(klasa);
        }
        else{
            throw new Exception ("Nienzna klasa " + klasa);
        }
        System.out.println("Ekstensja klasy: " + klasa.getSimpleName());
        for (Object o : extent){
            System.out.println(o + "\n");
        }
    }
    public static Vector getExtent(Class klasa) throws ClassNotFoundException {
        Vector extent = null;
        if (extents.containsKey(klasa)){
            extent = (Vector) extents.get(klasa);
        }
        else{
            throw new ClassNotFoundException ("Nienzna klasa " + klasa);
        }
        return extent;
    }


    public static <T> void deleteExtent(T name) {
        Vector<T> extent = (Vector<T>) extents.get(name.getClass());
        extent.remove(name);
    }
}

