package org.superbiz.composed;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
public class Intercepted {

    @Interceptors(HelloInterceptor.class)
    public String method(final EnumInside.InnerEnum p) {
        return "IT SHOULD NOT RUN";
    }

    @Interceptors(HelloInterceptor.class)
    public String method(final OuterEnum p) {
        return "IT SHOULD NOT RUN";
    }

    @Interceptors(HelloInterceptor.class)
    public String method(String p) {
        return "IT SHOULD NOT RUN";
    }

}
