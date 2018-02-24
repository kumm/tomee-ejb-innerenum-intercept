package org.superbiz.composed;

import junit.framework.TestCase;
import org.apache.openejb.jee.EjbJar;
import org.apache.openejb.jee.StatelessBean;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

@RunWith(ApplicationComposer.class)
public class InterceptorTest extends TestCase {

    @EJB
    private Intercepted intercepted;

    @Module
    public EjbJar beans() {
        return new EjbJar("intercepted-beans")
                .enterpriseBean(new StatelessBean(Intercepted.class));
    }

    @Test
    public void testInnerEnum() throws Exception {
        assertEquals("HELLO", intercepted.method(EnumInside.InnerEnum.TEST));
    }

    @Test
    public void testString() throws Exception {
        assertEquals("HELLO", intercepted.method("TEST"));
    }

}