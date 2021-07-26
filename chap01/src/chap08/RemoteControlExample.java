package chap08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RemoteControl.changeBattery();

		//RemoteControl rc;
		RemoteControl rc = null;
		
			
		rc= new Television();
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(0);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		
	}

}
