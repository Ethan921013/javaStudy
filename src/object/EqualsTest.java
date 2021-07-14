package object;

class Student{

    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        // 자동 업캐스팅
        // 다운 캐스팅필요
        if(obj instanceof Student){
            Student std = (Student)obj;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {

    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        // 메모리의 주소 여부.
        System.out.println(str1 == str2);

        // 문자열이 같은지 여부를 판단.
        System.out.println(str1.equals(str2));

        Student student1 = new Student(100,"학생");
        Student student = student1;
        Student student2 = new Student(100,"학생");

        // false가 맞지만 재정의해서 사용하게끔.
        System.out.println(student == student2);
        System.out.println(student.equals(student2));

        // hashcode() 인스턴스가 생성시 메모리에 할당되는 주소값을 10진수로 변환한것.
        // equals를 오버라이딩을 하면 hashcode도 같이 오버라이딩해줌. 보통은..

        Integer i1 = new Integer(100);
        Integer i2 = 100;

        System.out.println();

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println();
        // 실제 메모리 주소
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));


    }

}
