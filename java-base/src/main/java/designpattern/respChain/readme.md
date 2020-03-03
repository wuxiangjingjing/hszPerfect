责任链模式：使多个对象都有机会处理同一个请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
          责任链可能是一条直线、一个环链甚至一个树结构的一部分。
          
涉及到的角色如下：
    抽象处理者（Handler）角色：定义出一个处理请求的接口；如果需要，接口可以定义出一个方法，以返回对下家的引用。
    具体处理者（ConcreteHandler）角色：处理接到请求后，可以选择将请求处理掉，或者将请 求传给下家。
    抽象链角色：
    
应用场景：
     为完成同一个请求，如果存在多个请求处理器以及未知请求处理器个数或者请求处理器可动态配置的情况下，可以考虑使用责任链模式。
     
     
示例：击鼓传花，

https://blog.csdn.net/u012810020/article/details/71194853