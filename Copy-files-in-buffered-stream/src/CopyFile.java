import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException{
		// 1，指定数据源， 是数据源中读数据，采用输入流
		BufferedReader in = new BufferedReader(new FileReader("file.txt"));
		// 2,指定目的地，是把数据写入目的地，采用输出流
		BufferedWriter out = new BufferedWriter(new FileWriter("copyFile.txt"));
		// 3,读数据
		String line = null;
		while ((line = in.readLine()) != null) {
			// 4，写数据
			out.write(line);
			// 写入换行符号
			out.newLine();
		}
		// 5，关闭流
		out.close();
		in.close();
	}
}