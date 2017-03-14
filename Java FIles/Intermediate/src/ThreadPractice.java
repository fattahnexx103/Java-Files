//Runnable interface contains run() method
import java.util.*;
public class ThreadPractice implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public ThreadPractice(String x){
		name = x;
		time = r.nextInt(999);//random time is between 0 and 1 sec
	}
	public void run(){
		
		try{
			System.out.printf("%s is sleeping for %d\n", name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n",name);
		}
		catch(Exception e){
			
		}
	}

}


