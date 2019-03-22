import java.io.FileReader;
import java.io.IOException;

public class LineFile {

	public static void main(String[] args) throws IOException{
		
		try {
		FileReader fr = new FileReader("E:\\javacap\\MyProject\\src\\classpack\\test.txt");
		int ch, count=1;
		while((ch=fr.read())!=-1)
		{
			if(ch==10)
			{
				System.out.print("Line "+count);
				count++;
			}
			
			System.out.print((char)ch);
		}
		fr.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}