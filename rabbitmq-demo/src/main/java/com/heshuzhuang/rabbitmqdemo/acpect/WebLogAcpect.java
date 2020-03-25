package com.heshuzhuang.rabbitmqdemo.acpect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * // todo 待完善rabbitmq
 * 切面编程记录访web的日志文件等信息，好像切入的位置不准确可能导致  错误
 *
 *
 *  @Component 注解 把切面类加入到IOC容器中
 *  @Aspect 注解 使之成为切面类
 *
 * @author heshuzhuang
 * @Date 2020/1/3 11:49
 */
@Component
@Aspect
@Slf4j
public class WebLogAcpect {

	/**
	 * 定义切入点，切入点为com.example.aop下的所有函数
	 */
	@Pointcut("execution(public * com.heshuzhuang.rabbitmqdemo.controller..*.*(..))")
	public void webLog(){}

	/**
	 * 前置通知：在连接点之前执行的通知
	 * @param joinPoint
	 * @throws Throwable
	 */
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();

		// 记录下请求内容
		log.info("URL : " + request.getRequestURL().toString());
		log.info("HTTP_METHOD : " + request.getMethod());
		log.info("IP : " + request.getRemoteAddr());
		log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
		log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(returning = "ret",pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		log.info("RESPONSE : " + ret);
	}
}
