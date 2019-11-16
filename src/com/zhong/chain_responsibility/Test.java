package com.zhong.chain_responsibility;

import java.util.ArrayList;

/**
 * 责任链模式：
 * 使多个对象都有机会处理同一个请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * 链接上的请求可以是一条链，可以是一个树，还可以是一个环
 *
 * 本demo基于员工上上级请假的一个流程
 * 参考博客：https://blog.csdn.net/u012810020/article/details/71194853
 */
public class Test {

    public static void main(String[] args) {
        Request request = new Request.Builder().setName("张三").setDays(5).setReason("事假").build();

        ArrayList<IdealRequest> arrayList = new ArrayList<IdealRequest>();
        arrayList.add(new GroupLeader());
        arrayList.add(new Manager());
        arrayList.add(new DepartmentHeader());
        // 责任链模式是可以“动态扩展的”

        RealChain realChain = new RealChain(arrayList, request, 0);

        realChain.proceed(request);
    }

}
