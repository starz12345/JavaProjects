import java.util.*;
import java.lang.*;
import java.io.*;
 
class SampleDemo implements Runnable {
	private Thread t;
	private String threadName;
 
	SampleDemo (String threadName){
		this.threadName = threadName;
 
	}
 
	public void run()
	{
		while(true)
			System.out.print(threadName);
	}
 
	public void start()
	{
		if(t==null){
			t = new Thread (this, threadName);
			t.start();
		}
	}
}
 
/* Name of the class has to be "Main" only if the class is public. */
public class runner
{
	public static void main (String[] args) throws java.lang.Exception
	{
		SampleDemo A =  new SampleDemo ("A");
		SampleDemo B =  new SampleDemo ("B");
 
		A.start();
		B.start();
	}
}