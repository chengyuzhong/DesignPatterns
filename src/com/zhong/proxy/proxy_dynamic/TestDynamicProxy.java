package com.zhong.proxy.proxy_dynamic;

import com.zhong.proxy.ITicketService;
import com.zhong.proxy.Station;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Jdk的动态代理：依赖于接口，首先使用接口来定义好操作的规范。
 * 然后通过Proxy类产生的代理对象调用被代理对象的操作，而这个操作又被分发给InvocationHandler接口的 invoke方法具体执行。
 * 事实上，真正的业务功能还是由目标类来实现，代理类只是用于扩展、增强目标类的行为。
 *
 * 应用场景：
 * 静态代理比动态代理更符合OOP原则，在日常开发中使用也较多。动态代理在开发框架时使用较多，例如大名鼎鼎的Spring
 *
 * 优缺点：
 * 代理模式的优点：
 * 1、代理模式能够协调调用者和被调用者，在一定程度上降低了系统的耦合度；
 * 2、代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了保护目标对象的作用
 * 3、还有一个我认为的优点、使用代理类我们就可以不用管委托类方法中的变动，或者我们只需要做少量的调整，比如如果委托类中的某个方法突然改成私有了，那个不使用代理类我们需要在每个此方法调用的地方都要把反射处理才能调用，使用代理之后 我们只需要在代理类中处理就可以了，当然这些操作可以使用包装类做，但是问题就在于我们不知道哪个方法会变成私有，不可能每个方法都写个包装类进行反射处理。
 *
 * 缺点：
 * 1、由于在客户端和真实对象之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢；
 * 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * 3、静态代理在委托类变多的情况时会显的非常臃肿，不方便阅读与使用
 *
 */
public class TestDynamicProxy {

    public static void main(String[] args) {

        Station station = new Station();

        InvocationHandler invocationHandler = new DynamicProxy(station);

        Class<?> stationClass = station.getClass();

        // 动态生成一个代理实例
        ITicketService proxy = (ITicketService) Proxy.newProxyInstance(stationClass.getClassLoader(), stationClass.getInterfaces(), invocationHandler);

        // 通过该代理实例调用方法。
        proxy.Consultation();
        proxy.sellTicket();
        proxy.ReturnTicket();

    }

}
