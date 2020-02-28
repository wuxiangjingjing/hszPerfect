package designpattern.respChain;

/**
 * 处理请求接口
 */
public interface Ratify {

    Result deal(Chain chain);

    //链 决定当前请求能否处理完
    interface Chain {
        //获取当前的请求
        Request request();

        //请求转发
        Result proceed(Request request);
    }
}
