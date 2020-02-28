package designpattern.respChain;

/**
 * 部门领导 处理5天以上的请假
 */
public class DepartmentHeader implements Ratify {

    private int days = 7;

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("DepartmentHeader=====>request:" + request.toString());
        if (request.days() > days) {
            return new Result(false, "DepartmentHeader：请假天数太多了，批不了了！");
        }
        return new Result(true, "DepartmentHeader：不要着急，把事情处理完再回来！");
    }
}
