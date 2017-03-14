import javax.swing.*;
public class TestProgram {
	public static void main(String[] args){
		
		TheWindow w = new TheWindow();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(230,280);
		w.setVisible(true);
		
		Thread t1 = new Thread(new ThreadPractice("one"));
		Thread t2 = new Thread(new ThreadPractice("two"));
		Thread t3 = new Thread(new ThreadPractice("three"));
		Thread t4 = new Thread(new ThreadPractice("four"));
	
		t1.start();//starting a thread
		t2.start();
		t3.start();
		t4.start();
	}

}
