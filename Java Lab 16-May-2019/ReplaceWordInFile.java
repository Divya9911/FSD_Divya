import java.util.Scanner;
import java.io.*;
class ReplaceWordInFile
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word you want to replace");
		String word = sc.nextLine();
		System.out.println("Enter the word by you want to replace");
		String replacewith = sc.nextLine();
		
		try{
		File f = new File("sample.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//FileWriter fw =new FileWriter(f);
		//BufferedWriter bw = new BufferedWriter(fw);
		String filecontent="";
		String content ="";
		while((content = br.readLine()) != null)
			{
				content = content.replace(word,replacewith);
				filecontent = filecontent + content + "\n";

    		}

    		br.close();

    		BufferedWriter bw = new BufferedWriter(new FileWriter(f));

    		bw.write(filecontent);

    		bw.flush();

			bw.close();
		}catch(IOException e){
		System.out.println("file not found");
	}
	catch(NullPointerException e){
		System.out.println("Null pointer exception occurs");
	}

	}
}
