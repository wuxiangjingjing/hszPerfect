package designpattern.respChain;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Ratify> ratifies;

    public Client(List<Ratify> list) {
        this.ratifies = list;
    }

    //可以添加自定义的审批人
    public void addRatifys(Ratify ratify) {
        ratifies.add(ratify);
    }


    public Result execute(Request request) {
        List<Ratify> list = ratifies;
        list.add(new GroupLeader());
        list.add(new Manager());
        list.add(new DepartmentHeader());
        RealChain realChain = new RealChain(request, list, 0);
        return realChain.proceed(request);
    }

    public static void main(String[] args) {
        Client client = new Client(new ArrayList<>());
        client.addRatifys(new CustomInterceptor());
        Request request = new Request.Builder().setDays(6).setName("许路路").setReason("紧急,我先回家").build();
        Result result = client.execute(request);
        System.out.println(result);
    }


}
