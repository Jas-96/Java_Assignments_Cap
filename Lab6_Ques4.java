import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Permissions {

	private static Scanner s;

	public static void main(String[] args) throws IOException {
		s = new Scanner (System.in);
		System.out.println("Enter Filename  ::  ");
		String str = s.next();
		File f = new File(str);
		boolean exists = f.exists();
		if(exists==true)
		{
			System.out.println("File found");
			System.out.println("Readable :: "+f.canRead());
			System.out.println("Writable :: "+f.canWrite());
			System.out.println("Executable :: "+f.canExecute());
			System.out.println("Absolute Path of File :: "+f.getAbsolutePath());
			System.out.println("Type of file :: "+getFileExtension(f));
			System.out.println("Length :: "+f.length());
		}
		else
		{
			System.out.println("File not Found");
		}
	}

	private static String getFileExtension(File f) {
		String fileName = f.getName();
		//System.out.println(fileName.lastIndexOf("."));
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        	return fileName.substring(fileName.lastIndexOf(".")+1);
        else 
        	return "";
	}

}
