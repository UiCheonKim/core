package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *      MemberService 구조체 생성
 *      (회원 가입, 회원 조회)
 */
@Component
public class MemberServiceImpl implements MemberService{

    // 가입을 하고 회원을 찾으려면 얘가 필요함
//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // MemberServiceImpl은 MemberRepository 의존하고 구현체인 MemoryMemberRepository도 의존한다.
    // -> 추상화에도 의존하고 구체화에도 의존한다.

    private final MemberRepository memberRepository;

    @Autowired // ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
