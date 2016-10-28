/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc.nature;

/**
 *
 * @author beach
 */
public class CallBackBean {

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
//    @PostConstruct
//    @PreDestroy
//    org.springframework.beans.factory.InitializingBean
//    org.springframework.beans.factory.DisposableBean
//    Lifecycle
//LifecycleProcessor
//    SmartLifecycle
//    <bean id="lifecycleProcessor" class="org.springframework.context.support.DefaultLifecycleProcessor">
//<!-- timeout value in milliseconds -->
//<property name="timeoutPerShutdownPhase" value="10000"/>
//</bean>
//    ctx.registerShutdownHook();
}
