package chap07_8;

public class Phone {
	//필드
	public String owner;
		
	//생성자
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	
	//메소드
	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}
		public void turnOff() {
			System.out.println("폰전원을 끕니다.");
	}
	
}
