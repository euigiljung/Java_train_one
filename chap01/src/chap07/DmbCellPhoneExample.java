package chap07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("?ë°”í°", "ê²?? •",10);
		
		System.out.println("ëª¨ë¸: " + dmbCellPhone.model);
		System.out.println("?ƒ‰?ƒ: " + dmbCellPhone.color);
		
		System.out.println("ì±„ë„: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("?—¬ë³´ì„¸?š”");
		dmbCellPhone.receiveVoice("?•ˆ?…•?•˜?„¸?š”! ???Š” ?™ê¸¸ë™ ?¸?°?š”");
		dmbCellPhone.sendVoice("?•ˆ ?„¤ ë°˜ê°‘?Šµ?‹ˆ?‹¤");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDbb(12);
		dmbCellPhone.turnOffDmb();
		


	

		
		
	}

}
