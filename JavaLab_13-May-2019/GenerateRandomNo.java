import java.util.*;
class GenerateRandomNo extends Thread{
	public static void main(String[] args) {
		GenerateRandomNo t1 =new GenerateRandomNo();
		t1.start();
	}
	public void run(){
		Date d1 = new Date();
		for(int i = 0; i < 10 ; i++){
		long start = System.currentTimeMillis();
		try{
		Thread.sleep(1000);
		}

		catch(InterruptedException ie){
			System.out.println("InterruptedException");
		}
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println(diff);
		try{
		Thread.sleep(1000);
		}

		catch(InterruptedException ie){
			System.out.println("InterruptedException");
		}
		
	}
}
}