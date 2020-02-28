package designpattern.respChain;

public class CustomInterceptor implements Ratify {

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("CustomInterceptor=>" + request.toString());
        String reason = request.reason();
        if (reason != null && reason.contains("紧急")) {
            Request newRequest = new Request.Builder().newRequest(request).setCustomInfo("我真的很着急啊,请领导批准").build();
            return chain.proceed(newRequest);
        }
        return chain.proceed(request);
    }
}
