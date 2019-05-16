import java.io.*;
class Copy
{
public static void main(String[] args) 
{	try{
	File sourcefile = new File("Source.txt");
	sourcefile.createNewFile();
	File targetfile = new File("Target.txt");
	targetfile.createNewFile();
	CopyDataThread copyData = new CopyDataThread(sourcefile,targetfile);
	copyData.start();
	}catch(IOException e){
		System.out.println(e);
	}

}
}
class CopyDataThread extends Thread
{
	File sourcefile,targetfile;
	CopyDataThread(File sourcefile, File targetfile)
	{
		this.sourcefile = sourcefile;
		this.targetfile = targetfile;

	}
	public void run()
	{

		try{
			String content ="";
			int countChars = 0; 
			int value = 0;
			FileInputStream fileIn = new FileInputStream(sourcefile);
			while((value = fileIn.read())!=-1)
			{
				
				content = content + (char)value;
				countChars++; 
				if(countChars == 10)
				{
					System.out.println("10 characters copied");
					countChars=0;
					Thread.sleep(5000);

                }

            }
	 BufferedWriter bw = new BufferedWriter(new FileWriter(targetfile));
		bw.write(content);
		bw.flush();
		bw.close(); 
	}catch(IOException e)
	{
		System.out.println("Exception caught: "+e);
	}
	catch(InterruptedException e)
	{
		System.out.println("Exception caught: "+e);
	}

	}

}