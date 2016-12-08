package org.mvc.framework.proxy;

/**
 * Created by xiaobao on 2016/12/8.
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
