package chap07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("?��바폰", "�??��",10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("?��?��: " + dmbCellPhone.color);
		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("?��보세?��");
		dmbCellPhone.receiveVoice("?��?��?��?��?��! ???�� ?��길동 ?��?��?��");
		dmbCellPhone.sendVoice("?�� ?�� 반갑?��?��?��");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDbb(12);
		dmbCellPhone.turnOffDmb();
		


	

		
		
	}

}
