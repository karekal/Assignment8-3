
public class MyPriority implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyPriority mp=new MyPriority();
Thread a= new Thread(mp);
Thread b=new Thread(mp);
Thread c=new Thread(mp);
a.setName("thread a");
b.setName("thread b");
c.setName("thread c");
a.setPriority(Thread.MIN_PRIORITY);
b.setPriority(Thread.NORM_PRIORITY);
c.setPriority(Thread.MAX_PRIORITY);
a.start();
b.start();
c.start();
	}
public void run(){
	for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName() + i  + "  is running");
	}try{
		Thread.sleep(1000);
	}
	catch(InterruptedException e){
		e.printStackTrace();
}
	
	


	}

}
