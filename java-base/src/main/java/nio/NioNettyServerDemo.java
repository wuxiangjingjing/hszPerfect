package nio;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

/**
 *
 *
 *
 *
 * @author heshuzhuang
 * @Date 2020/4/20 14:27
 */
public class NioNettyServerDemo {


	public static void main(String[] args) {
		NioEventLoopGroup bossGroup = new NioEventLoopGroup();
		NioEventLoopGroup workerGroup = new NioEventLoopGroup();

		ServerBootstrap serverBootstrap = new ServerBootstrap();
		serverBootstrap
				.group(bossGroup, workerGroup )
				.channel(NioServerSocketChannel.class)
				.childHandler(new ChannelInitializer<NioSocketChannel>() {
					protected void initChannel(NioSocketChannel ch) {
						ch.pipeline().addLast(new StringDecoder());
						ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
							@Override
							protected void channelRead0(ChannelHandlerContext ctx, String msg) {
								System.out.println(msg);
							}
						});
					}
				})
				.bind(8000);
	}
}
