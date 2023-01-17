import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void ChildShouldBeAddedToChildList() {
        //arrange
        Person aTest = new Person("Pietje", "Bel", 22, "male");
        Person childTest = new Person("Keesje", "Bel", 2, "male");
        //act
        aTest.addChildren(childTest);
        //assert
        assertEquals(1, aTest.getChildren().size());
    }

    @Test
    void ParentsShouldBeAddedToParentList() {
        //arrange
        Person aTest = new Person("Pietje", "Bel", 22, "Male");
        Person momTest = new Person("Tini", "paap", 32, "female");


        //act
        aTest.addParent(momTest);
        //assert
        assertEquals(1, aTest.getParents().size());
    }


    @Test
    void ParentsShouldBeAddedToParentListNoMoreThan2() {
        //arrange
        Person aTest = new Person("Pietje", "Bel", 22, "male");
        Person momTest = new Person("Tini", "paap", 32, "female");
        Person dadTest = new Person("Tom", "paap", 42, "male");
        Person stepDadTest = new Person("Tim", "palo", 32, "male");

        //act
        aTest.addParent(momTest);
        aTest.addParent(dadTest);
        aTest.addParent(stepDadTest);
        //assert
        assertEquals(2, aTest.getParents().size());

    }


    @Test
    void siblingShoudlBeAddedToSiblingList() {
        //arrange
        Person aTest = new Person("Pietje", "Bel", 22, "male");
        Person sibTest = new Person("Jantje", "Bel", 32, "male");
        //act
        aTest.addSibling(sibTest);
        //assert
        assertEquals(1, aTest.getSibling().size());
    }


}