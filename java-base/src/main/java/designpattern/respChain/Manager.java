package designpattern.respChain;


/**
 * 经理 处理2-5天的请假请求
 */
public class Manager implements Ratify {

    private int maxDays = 5;

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manager=====>request:" + request.toString());
        if (request.days() <= 2 || request.days() > maxDays) {
            Request newRequset = new Request.Builder().newRequest(request).setManagerInfo(request.name() + "的请假，经理准许了").build();
            return chain.proceed(newRequset);
        }
        return new Result(true, "经理，允许了");
    }
}
