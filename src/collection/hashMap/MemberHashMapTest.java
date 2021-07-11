package collection.hashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap manager = new MemberHashMap();

        Member memberLee = new Member(100, "Lee");
        Member memberHee = new Member(200, "hee");
        Member memberJee = new Member(300, "jee");

        manager.addMember(memberHee);
        manager.addMember(memberLee);
        manager.addMember(memberJee);

        manager.removeMember(100);

        manager.showAllMember();

    }

}
