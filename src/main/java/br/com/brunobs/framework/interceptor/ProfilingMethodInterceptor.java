package br.com.brunobs.framework.interceptor;

import java.util.Collection;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.com.brunobs.framework.fetch.FetchService;

@Component
public class ProfilingMethodInterceptor implements MethodInterceptor {

	private static final Logger log = LoggerFactory.getLogger(ProfilingMethodInterceptor.class);

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = invocation.proceed();
		if (result instanceof Collection<?>) {
			Collection<?> lista = (Collection<?>) result;
			System.out.println("LISTA / ANTES: " + lista.size());
			lista = FetchService.execute(lista);
			System.out.println("LISTA / DEPOIS " + lista.size());

		} else {
			System.out.println("OBJETO / ANTES: " + result);
			result = FetchService.execute(result);
			System.out.println("OBJETO / DEPOIS: " + result);
		}
		return result;

	}

}
