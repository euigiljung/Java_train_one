package chap08;

public class Television implements RemoteControl {
		//�ʵ�
	
		private int volume;
		
		// turnOn() �߻� �޼ҵ��� ��ü�޼ҵ�
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
				
	}

		// turnOff() �߻� �޼ҵ��� ��ü�޼ҵ�
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
				
}
		//setVolum()�߻� �޼ҵ��� ��ü �޼ҵ�
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if (volume<RemoteControl.MIX_VOLUME) {
				this.volume = RemoteControl.MIX_VOLUME;
			} else {
				this.volume = volume;
				
			}
			System.out.println("���� tv ����:" + this.volume);
			}
			}
	
