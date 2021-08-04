package chap07;

public class DmbCellPhone extends CellPhone{
		int channel;		
//		?ƒ?„±?
		DmbCellPhone(String model, String color, int channel){
			
			this.model = model;
			this.color = color;
			this.channel = channel;					}		
//		ë©”ì†Œ?“œ
		void turnOnDmb()		{
			System.out.println("ì±„ë„" +channel + "ë²? ë°©ì†¡?„ ?ˆ˜?‹ ?„ ?‹œ?‘?•©?‹ˆ?‹¤.    ");		}
		void changeChannelDbb(int channel) {
			this.channel = channel;
			System.out.println("ì±„ë„  " + channel + " ë²ˆìœ¼ë¡? ë°”ê¿‰?‹ˆ?‹¤");			
		}		
		void turnOffDmb() {
			System.out.println(" ë°©ì†¡ ?ˆ˜?‹ ?„ ë©ˆì¶¥?‹ˆ?‹¤.  ");
			
		}
		
		
	}


