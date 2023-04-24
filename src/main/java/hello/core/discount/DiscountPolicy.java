package hello.core.discount;

import hello.core.member.Member;

/**
 *      할인 정책 인터페이스
 *      (구현체 정액 할인 정책, 정률 할인 정책 등이 있을 수 있음)
 */
public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     * (1000원이 할인 됐어 이런걸 리턴)
     */
    int discount(Member member, int price);

}
