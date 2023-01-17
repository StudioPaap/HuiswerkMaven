import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pet {

    //attributen
    private String name;
    private int age;
    private String species;
    private List owners = new ArrayList<Person>();

    //constructor

    public Pet(String nm, int age, String sp){
        this.name = nm;
        this.age = age;
        this.species = sp;
    }

    //getter en setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }



    //methods

public void addOwner(Person owner){
        owners.add(owner);

}

public ArrayList getOwners(){
        return (ArrayList) owners;
}
}
