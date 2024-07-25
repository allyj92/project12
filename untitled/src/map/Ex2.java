package map;

import java.util.HashMap;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        MemberHashMap map = new MemberHashMap();
        // 회원 추가
        Member member1 = new Member(1001,"둘리");
        Member member2 = new Member(1002,"또치");
        Member member3 = new Member(1003,"도우너");
        Member member4 = new Member(1004,"고길동");

        map.addMember(member1); // 1001, 회원객체
        map.addMember(member2);
        map.addMember(member3);
        map.addMember(member4);

        map.removeMember(member3.getMemberId());

        System.out.println(map);

        System.out.println();

        // 회원 추가

//        // 1번째 회원 삭제
//        map.remove(1001);
//
//        // 전체 회원 수 출력
//        System.out.println("전체 회원 수: " + map.size());
//
//        // 전체 회원 목록 출력
//        System.out.println(map);
//
//        // 회원 목록 순회하기
//        Set<Integer> keyset = map.keySet();
//
//        // 변수 : 자료구조 (배열, 리스트, set O map X)
//        for (int key : keyset){
//            System.out.println("[key]: " + key + "[Value]: " + map.get(key));
        }

    }



class Member{
    // 회원목록을 저장하는 map 생성
    MemberHashMap map;



    private int memberId; // 회원 아이디
    private String memberName; // 회원 이름

    // 생성자 추가
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;

    }


    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }




    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}

    class MemberHashMap {
        private HashMap<Integer, Member> map; // Declare HashMap as private

        public MemberHashMap() {
            map = new HashMap<>();
        }


        public void addMember(Member member) {
            map.put(member.getMemberId(), member);
        }


        public void removeMember(int memberId) {
            if (map.containsKey(memberId)) {
                map.remove(memberId);
                System.out.println(memberId + "번 회원을 삭제하였습니다.");
            } else {
                System.out.println("존재하는 회원이 없습니다.");
            }
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Member List:\n");
            for (Member m : map.values()) {
                sb.append(m.toString()).append("\n");
            }
            return sb.toString();
        }
    }