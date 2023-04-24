package hello.core.member;

/**
 *     회원 저장
 *     (구현체 메모리, mysql 등이 있을 수 있음)
 */
public interface MemberRepository {

    void save(Member member); // 회원저장

    Member findById(Long memberId); // 회원아이디로 회원 찾는 기능
}
