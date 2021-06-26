package stream;

import java.io.*;

class Person{

    String name;
    // 직렬화 금지 선언
    transient String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + " , " + job;
    }
}

// 직렬화 여부를 반드시 Serializable 선언해야함.
// Externalizable은 직접 read write를 구현가능.
public class Serialize implements Serializable {

    public static void main(String[] args) {

        // 인스턴스의 상태를 그대로 저장 , 네트웍으로 전송하고 이를 다시 Deserialization

        Person p1 = new Person("p1","a");
        Person p2 = new Person("p2","b");

        try (FileOutputStream fos = new FileOutputStream("serial2.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(p1);
            oos.writeObject(p2);

        }catch (IOException e){
            System.out.println(e);
        }

        try (FileInputStream fos = new FileInputStream("serial2.dat");
             ObjectInputStream ois = new ObjectInputStream(fos)){

            Person p11 = (Person) ois.readObject();
            Person p22 = (Person) ois.readObject();

            System.out.println(p11);
            System.out.println(p22);

        }catch (IOException e){
            System.out.println(e);
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

    }

}
