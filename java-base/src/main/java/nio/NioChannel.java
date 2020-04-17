package nio;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author heshuzhuang
 * @Date 2020/4/15 16:03
 */
public class NioChannel {

	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("F:\\project2\\learning\\java-base\\src\\main\\java\\nio\\nio.doc", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(2048);

		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {
			System.out.println("Read " + bytesRead);
			buf.flip();

			while(buf.hasRemaining()){
				System.out.print((char) buf.get());
			}

			buf.clear();
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}
}
