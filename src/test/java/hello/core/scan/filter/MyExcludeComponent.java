package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// ElementType.Type : 클래스 레벨
public @interface MyExcludeComponent {
}
