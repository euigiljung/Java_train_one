package chap07;

public class DmbCellPhone extends CellPhone{
		int channel;		
//		?��?��?��
		DmbCellPhone(String model, String color, int channel){
			
			this.model = model;
			this.color = color;
			this.channel = channel;					}		
//		메소?��
		void turnOnDmb()		{
			System.out.println("채널" +channel + "�? 방송?�� ?��?��?�� ?��?��?��?��?��.    ");		}
		void changeChannelDbb(int channel) {
			this.channel = channel;
			System.out.println("채널  " + channel + " 번으�? 바꿉?��?��");			
		}		
		void turnOffDmb() {
			System.out.println(" 방송 ?��?��?�� 멈춥?��?��.  ");
			
		}
		
		
	}


