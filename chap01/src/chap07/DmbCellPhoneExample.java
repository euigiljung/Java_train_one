package chap07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("?λ°ν°", "κ²?? ",10);
		
		System.out.println("λͺ¨λΈ: " + dmbCellPhone.model);
		System.out.println("??: " + dmbCellPhone.color);
		
		System.out.println("μ±λ: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("?¬λ³΄μΈ?");
		dmbCellPhone.receiveVoice("????Έ?! ??? ?κΈΈλ ?Έ?°?");
		dmbCellPhone.sendVoice("? ?€ λ°κ°?΅??€");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDbb(12);
		dmbCellPhone.turnOffDmb();
		


	

		
		
	}

}
