import java.io.*;
class DisplayNoCharLineWord{
	public static void main(String[] args) {
		int countLine=0;
		int countWord=0;
		int countChar=0;
		try{
		File f = new File("Sample.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String content ="";
		while((content=br.readLine())!= null){
			countLine++;
			String []str = content.split(" ");
			countWord = countWord + str.length;
			String []str1 = content.split("");
			countChar =countChar+str1.length;

		}
		System.out.println("No of lines: "+countLine);
		System.out.println("No of words: "+countWord);
		System.out.println("No of Characters: "+countChar);

		br.close();

		}catch(IOException e){
			System.out.println("File not found");
		}


	}
}