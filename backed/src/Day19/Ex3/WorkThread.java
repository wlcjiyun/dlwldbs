package Day19.Ex3;

public class WorkThread extends Thread{
	private boolean work = true;
	public WorkThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + " : 작업처리");
			}
		}
	}
}
