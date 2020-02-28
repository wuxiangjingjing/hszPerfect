package designpattern.respChain;

import java.util.List;

/**
 * 真正处理请求的链
 */
public class RealChain implements Ratify.Chain {

    private Request request;

    private List<Ratify> ratifyList;

    private int index;

    public RealChain(Request req, List<Ratify> list, int ind) {
        this.request = req;
        this.index = ind;
        this.ratifyList = list;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result proceed(Request request) {
        Result procced = null;
        if (ratifyList.size() > index) {
            RealChain realChain = new RealChain(request, ratifyList, index + 1);
            Ratify ratify = ratifyList.get(index);
            procced = ratify.deal(realChain);
        }
        return procced;
    }
}
