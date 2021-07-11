package classEx;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {

        Person person = new Person("James");
        System.out.println(person);

        Class cl = Class.forName("classEx.Person");

        Person person1 = (Person) cl.newInstance();
        System.out.println(person1);

//        Class[] parameterType = (String.class);
//        Constructor cons = cl.getConstructor(parameterType);


    }

}
