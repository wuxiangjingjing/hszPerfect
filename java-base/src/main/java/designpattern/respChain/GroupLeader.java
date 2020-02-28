package designpattern.respChain;

/**
 * 小组长，处理两天以内的请假
 */
public class GroupLeader implements Ratify {

    private int days = 2;

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("GroupLeader=====>request:" + request.toString());
        if (request.days() > days) {
            Request newRequest = new Request.Builder().newRequest(request).setGroupLeaderInfo("现在项目不忙，" + request.name() + "表现还不错").build();
            return chain.proceed(newRequest);
        }
        return new Result(true, "两天内的，回家吧");
    }
}
