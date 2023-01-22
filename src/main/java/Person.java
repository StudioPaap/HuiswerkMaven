import java.util.ArrayList;
import java.util.List;

public class Person {

    //Assets
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private String mother;
    private int age;
    private String father;
    private int siblings;
    private List<Person> parents = new ArrayList<Person>();
    private List<Person> children = new ArrayList<Person>();
    private List<Person> sibling = new ArrayList<Person>();
    private List<Person> pet = new ArrayList<Person>();

    //Constructor
    public Person(String nm, String lnm, int age, String sex) {
        this.name = nm;
        this.lastName = lnm;
        this.age = age;
        this.sex = sex;
    }

    ;

    //Constructor 2
    public Person(String nm, String lnm, String mnm, int age, String sex) {
        this.name = nm;
        this.lastName = lnm;
        this.middleName = mnm;
        this.age = age;
        this.sex = sex;
    }

    //Getter en Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;

    }


    public void setSiblings(int siblings) {
        this.siblings = siblings;
    }


    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getSibling() {
        return sibling;
    }

    public void setSibling(List<Person> sibling) {
        this.sibling = sibling;
    }

    public List<Person> getPet() {
        return pet;
    }

    public void setPet(List<Person> pet) {
        this.pet = pet;
    }


    //Methods

    public void addChildren(Person child) {
        children.add(child);
    }

    public ArrayList getChildren() {
        return (ArrayList) children;
    }

    public void addParent(Person parent){
        if(parents.size() < 2 ){
            parents.add(parent);
        }

    }

    public ArrayList getParents() {
        return (ArrayList) parents;
    }

    public void addSibling(Person siblings) {
        sibling.add(siblings);
    }

    public ArrayList getSiblings() {
        return (ArrayList) sibling;
    }


}
