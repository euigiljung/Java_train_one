package chap07;

public class DmbCellPhone extends CellPhone{
		int channel;		
//		??±?
		DmbCellPhone(String model, String color, int channel){
			
			this.model = model;
			this.color = color;
			this.channel = channel;					}		
//		λ©μ?
		void turnOnDmb()		{
			System.out.println("μ±λ" +channel + "λ²? λ°©μ‘? ?? ? ???©??€.    ");		}
		void changeChannelDbb(int channel) {
			this.channel = channel;
			System.out.println("μ±λ  " + channel + " λ²μΌλ‘? λ°κΏ??€");			
		}		
		void turnOffDmb() {
			System.out.println(" λ°©μ‘ ?? ? λ©μΆ₯??€.  ");
			
		}
		
		
	}


