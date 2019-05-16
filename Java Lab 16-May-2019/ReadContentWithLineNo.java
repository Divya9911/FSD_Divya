import java.io.*;
class ReadContentWithLineNo{
	public static void main(String[] args) {
		try{
		File f =new File("Sample.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write(" Divya \n Naina \n Dheeraj \n Naveen \n Ankit");
		bw.flush();
		bw.close();
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String content ="";
		int count =0;
		while((content = br.readLine())!=null){
			count++;
			System.out.println(count + content);
		}
		br.close();
		}catch(IOException e)
		{
			System.out.println("File not found");
		}
	}
}