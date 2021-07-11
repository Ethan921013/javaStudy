package collection.set;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member(100, "Lee");
        Member memberKee = new Member(200, "Kee");
        Member memberHee = new Member(300, "Hee");

        manager.addMember(memberHee);
        manager.addMember(memberLee);
        manager.addMember(memberKee);

        manager.removeMember(100);

        manager.showAllMember();


    }

}
