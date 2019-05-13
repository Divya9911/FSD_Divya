class TimerDemo extends Thread{
	public static void main(String[] args) {
		TimerDemo t1 =new TimerDemo();
		t1.start();
		}
		public void run(){
			for(int i=1;i<=10 ;i++){
				System.out.print("\r" +i);
				try{
				Thread.sleep(1000);
				}catch(InterruptedException ie){
						System.out.println("Interrupted");
				}
			}
		
	}
}