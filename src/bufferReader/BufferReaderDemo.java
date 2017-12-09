package bufferReader;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferReaderDemo {

	public static void main(String[] args) {
		String text = null;
		//User your own file path into the iflePath variable's value.
		String filePath = "/Users/imrankabir/Desktop/mysql_password.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while((text = br.readLine()) != null) {
				System.out.println(text);
			}br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
