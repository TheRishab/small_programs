public class multi extends Thread{
	public void run(){
		for (int i=1;i<=10 ;i++ ) {
			try{
				Thread.sleep(1000);
				System.out.println("Thread number : " + i);
			}catch(Exception e){

			}
		}
	}

	public static void main(String args[]){
		multi p = new multi();
		p.start();
	}
}