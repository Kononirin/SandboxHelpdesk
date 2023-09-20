package faker;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testJavaFaker() {
        Person person = new Person();
        System.out.println("First Name is " + person.getFirstName());
        System.out.println("Last name is " + person.getLastName());
        System.out.println("Age is " + person.getAge());
    }
}
