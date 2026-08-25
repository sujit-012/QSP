class Synchronized 
{
	public static void main(String[] args) 
	{
		Task task = new Task();
		MyThread t1 = new MyThread("Ramesh", task);
		t1.start();
		
		MyThread t2 = new MyThread("Suresh", task);
		t2.start();
	}
}

class MyThread extends Thread
{
	String threadName;
	Task task;
	
	MyThread(String threadName, Task task)
	{
		this.threadName = threadName;
		this.task = task;
	}
	
	@Override
		public void run()
	{
		try{
			task.printNumber(threadName);
		}catch(InterruptedException e)
		{
			System.out.println("Something went Wrong");
		}
	}
}

class Task
{
	public synchronized void printNumber(String threadName) throws InterruptedException
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(threadName + " : " + i);
			Thread.sleep(500);
		}
	}
}
