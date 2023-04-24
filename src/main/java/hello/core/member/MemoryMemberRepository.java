package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 *      MemberRepository 메모리 버전 구조체 생성
 */
@Component //memoryMemberRepository
public class MemoryMemberRepository implements MemberRepository {

    // 저장소니깐 Map같은게 필요
    private static Map<Long, Member> store = new HashMap<>();
    // ConcurrentHashMap -> 동시성 잇슈 때문에 이걸쓴다

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}