package annotate;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @author heshuzhuang
 * @Date 2020/4/24 10:35
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Dog {
	public String dog() default "";
}