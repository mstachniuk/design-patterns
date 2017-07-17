package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        InvocationHandler handler = new InvocationHandler() {
            Image4K image4K;

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("getImage")) {
                    if (image4K == null) {
                        System.out.println("Load image");
                        image4K = new Image4K();
                    }
                    return method.invoke(image4K, args);
                }
                if(method.getName().equals("getMiniature")) {
                    return "Miniature from proxy";
                }
                return proxy;
            }
        };

        Image proxy = (Image) Proxy.newProxyInstance(Image.class.getClassLoader(),
                new Class[]{Image.class},
                handler);

        System.out.println(proxy.getMiniature());
        System.out.println(proxy.getImage());
        System.out.println(proxy.getImage());
    }
}
