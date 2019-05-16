import java.io.*;
import java.util.Scanner;
class CheckFileReadWrite{
	public static void main(String[] args) {
		int count=0;
		//File f = new File("Sample.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String filename = sc.nextLine();
		try{
		File f = new File(filename);
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		//File  exists or not 
		if(f.exists()){
			System.out.println("File found");

		}
		else {
			System.out.println("File not found");
		
		}
		
		// Check file is readable or not
		if(f.canRead()){
			System.out.println("File is readable");
		}
		else
		{
			System.out.println("File is not readable");
		}
		
		// check if file is writable
		if(f.canWrite()){
			System.out.println("File is writable");
		}
		else
		{
			System.out.println("File is not writeable");
		}
		
		//Find the length of the file in byte
		System.out.println("Length of file: "+f.length());
		
		
		// Finding the extension  of file
		String extension = "";
		String filename1 = f.getName();
		int i = filename1.lastIndexOf('.');
		if (i > 0) {
    	extension = filename1.substring(i+1);
		}
		System.out.println("Extension of file is:" + extension);
		br.close();
	}
	catch(IOException e){
		System.out.println("file not found");
	}
}
}