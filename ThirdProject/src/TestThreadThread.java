import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("This is currently running on the main thread," + "the id is:" + Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.setName(name);
		t2.start
		Thread t3 = new Thread (worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ":Main finished running...");
		
	}
	
	@Override
	public void run()
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ":Thread with id is:" +Thread.currentThread().getId() + ", with Name :" + Thread ;
		
		
		
		// TODO Auto-generated method stub
		

	}

}
