package co.uksafebear;

import co.uksafebear.kennels.Dog;
import org.junit.Test;

public class TestDog {

    @Test
    public void testDog() {

        Dog scooby = new Dog();
        Dog wolfy = new Dog();
        Dog liver = new Dog();

        liver.setSkin("brown");
        wolfy.setSkin("pink");
        scooby.setSkin("Yellow");



    }

}
