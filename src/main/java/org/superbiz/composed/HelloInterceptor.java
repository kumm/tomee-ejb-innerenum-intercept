package org.superbiz.composed;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class HelloInterceptor {
    @AroundInvoke
    public Object aroundInvoke(InvocationContext ctx) throws Exception {
        return "HELLO";
    }
}
