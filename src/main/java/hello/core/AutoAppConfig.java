package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// 쫙 컴포넌트 스캔해서 스프링 빈으로 자동등록하는데 그 중에 제외 설정
public class AutoAppConfig {

/*
    @Autowired MemberRepository memberRepository;
    @Autowired
    DiscountPolicy discountPolicy;

    @Bean
    OrderService orderService() {
        return new OrderServiceImpl(memberRepository, discountPolicy);
    }
*/

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

}
