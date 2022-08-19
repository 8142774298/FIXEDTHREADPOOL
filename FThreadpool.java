//executed on java programiz compiler
import java.util.concurrent.*;
public class FThreadpool implements Runnable{
	int i,j;
	public FThreadpool(int i,int j){
		this.i=i;
		this.j=j;
	}
	public void run(){
		System.out.println(i+"\t"+Thread.currentThread().getName());
		System.out.println(j+"\t"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		final int max_t=5;
		Runnable r1=new FThreadpool(1,2);
		Runnable r2=new FThreadpool(3,4);
		Runnable r3=new FThreadpool(5,6);
		Runnable r4=new FThreadpool(7,8);
		Runnable r5=new FThreadpool(9,10);
		ExecutorService pool=Executors.newFixedThreadPool(5);
		System.out.println("Numbers\tExecutorBehavior");
		System.out.println();
		pool.submit(r1);
		pool.submit(r2);
		pool.submit(r3);
		pool.submit(r4);
		pool.submit(r5);
		pool.shutdown();
	}
}
