package hello.core.member;

/**
 *     회원 서비스
 *     (구현체 회원 가입, 회원 조회 설정)
 */
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
